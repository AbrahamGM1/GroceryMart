/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Entidades.Adeudo;
import Entidades.Costo;
import Interfaces.ICostosDAO;
import Interfaces.IGestionCostos;
import daos.CostosDAO;
import interfaces.ConexionBD;
import interfaces.IConexionBD;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author spide
 */
public class GestionCostos implements IGestionCostos {

    private IConexionBD conexion = new ConexionBD();
    ICostosDAO c = new CostosDAO(conexion);

    @Override
    public boolean insertar(Costo costo, int idAdeudo, Adeudo adeudo, JFrame frame) {
        ///Checar si es negativo
        float dinero = costo.getDinero();
        float total = getTotal(adeudo);
        ///Si es una resta
        if (dinero < 0) {
            System.out.println(dinero);
            System.out.println(total);
            ///Si la resta es mayor al total acumulado
            if (Math.abs(dinero) > total) {
                JOptionPane.showMessageDialog(frame, "El monto a restar supera al total", "Aviso", 2);
                return false;
            } else {
                c.insertar(costo, idAdeudo);
                return true;
            }
        } ///Si es una suma directamente la pone
        else {
            c.insertar(costo, idAdeudo);
            return true;
        }

    }

    @Override
    public boolean restar(Costo costo, int idAdeudo) {
        c.insertar(costo, idAdeudo);
        return true;
    }

    public float getTotal(Adeudo adeudo) {
        float total = 0;
        List<Costo> costos = c.consultarCostosAdeudo(adeudo);
        for (int i = 0; i < costos.size(); i++) {
            total = total + costos.get(i).getDinero();
        }
        return total;
    }

    @Override
    public List<Costo> consultarCostosAdeudo(Adeudo adeudo, JTable table) {
        List<Costo> listaCostos = c.consultarCostosAdeudo(adeudo);

        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
        modeloTabla.setRowCount(0);
        listaCostos.forEach(costo -> {

            Object[] fila = new Object[1];
            fila[0] = costo.getDinero();
            modeloTabla.addRow(fila);

        });
        //Desaparece la tabla del ID
        //table.getColumnModel().getColumn(0).setMaxWidth(0);
        //table.getColumnModel().getColumn(0).setMinWidth(0);
        //table.getColumnModel().getColumn(0).setPreferredWidth(0);
        return listaCostos;
    }

    @Override
    public void calcularTotal(Adeudo adeudo, JLabel lblTotal) {
        float total = 0;
        List<Costo> costos = c.consultarCostosAdeudo(adeudo);
        for (int i = 0; i < costos.size(); i++) {
            total = total + costos.get(i).getDinero();
        }
        lblTotal.setText(String.valueOf(total));
    }

}
