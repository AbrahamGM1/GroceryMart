/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Adeudo;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author spide
 */
public interface IGestionAdeudos {
    
    public boolean insertar(Adeudo adeudo, JFrame frame);
    
    public Adeudo consultar(Integer idAdeudo);
    
    public List<Adeudo> consultarTodos(JTable table);
    
    public List<Adeudo> ConsultaString(String string, JTable table);
    
    public boolean eliminar(int id, JFrame frame, JTable tblAdeudos);
    
    public Integer getAdeudoSeleccionado(JTable tblAdeudos);
    
    public boolean cargarCuenta(Adeudo adeudo, JTextField txtNombre, JTextField txtId, JTextField txtAsunto);
}
