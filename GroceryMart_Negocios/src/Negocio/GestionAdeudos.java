/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Entidades.Adeudo;
import Interfaces.IAdeudosDAO;
import Interfaces.IGestionAdeudos;
import daos.AdeudosDAO;
import interfaces.ConexionBD;
import interfaces.IConexionBD;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author spide
 */
public class GestionAdeudos implements IGestionAdeudos {

    private IConexionBD conexion = new ConexionBD();
    private IAdeudosDAO a = new AdeudosDAO(conexion);

    @Override
    public boolean insertar(Adeudo adeudo, JFrame frame) {
        if (a.insertar(adeudo)) {
            JOptionPane.showMessageDialog(frame, "Cuenta de adeudo agregada con éxito", "Aviso", 1);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Adeudo consultar(Integer idAdeudo) {
        Adeudo adeudo = a.consultar(idAdeudo);
        return adeudo;
    }

    @Override
    public List<Adeudo> consultarTodos(JTable table) {
        List<Adeudo> listaAdeudos = a.consultarTodos();

        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
        modeloTabla.setRowCount(0);
        listaAdeudos.forEach(adeudo -> {

            Object[] fila = new Object[3];
            fila[0] = adeudo.getId();
            fila[1] = adeudo.getNombre();
            fila[2] = adeudo.getAsunto();

            modeloTabla.addRow(fila);

        });

        return listaAdeudos;
    }

    @Override
    public List<Adeudo> ConsultaString(String string, JTable table) {
        List<Adeudo> listaAdeudos = a.ConsultaString(string);

        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
        modeloTabla.setRowCount(0);
        listaAdeudos.forEach(adeudo -> {

            Object[] fila = new Object[3];
            fila[0] = adeudo.getId();
            fila[1] = adeudo.getNombre();
            fila[2] = adeudo.getAsunto();

            modeloTabla.addRow(fila);

        });

        return listaAdeudos;
    }

    @Override
    public boolean eliminar(int id, JFrame frame, JTable tblAdeudos) {
        if (id == -1) {
            JOptionPane.showMessageDialog(frame, "Debes seleccionar una cuenta de adeudo primero", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            // Devolver cada parámetro dentro de su respectivo JTextField 
            a.eliminar(id);
            JOptionPane.showMessageDialog(frame, "Se eliminó la cuenta", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    
    @Override
    public Integer getAdeudoSeleccionado(JTable tblAdeudos) {
        int indiceFilaSeleccionada = tblAdeudos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblAdeudos.getModel();
        int indiceColumnaId = 0;
        if (indiceFilaSeleccionada != -1) {
            Integer adeudoSeleccionado = (Integer) modelo.getValueAt(indiceFilaSeleccionada, indiceColumnaId);
            return adeudoSeleccionado;
        } else {
            return null;
        }
    }
    
    @Override
    public boolean cargarCuenta(Adeudo adeudo, JTextField txtNombre, JTextField txtId, JTextField txtAsunto){
        txtNombre.setText(adeudo.getNombre());
        txtId.setText(String.valueOf(adeudo.getId()));
        txtAsunto.setText(adeudo.getAsunto());
        return true;
    }

}
