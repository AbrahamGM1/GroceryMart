/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;


import Entidades.Producto;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;


public interface IGestionProducto {
    List<Producto> ConsultaTodos(JTable tblProductos);
    boolean AgregarProducto(JFrame frame, Producto producto);
    Integer getProductoSeleccionado(JTable tblChats);
    Producto consultaProducto(JFrame frame, String idSeleccionado, JTable tblProductos);
    boolean ActualizarProducto(JFrame frame, Producto producto);
    List<Producto> ConsultaString(JTable tblProductos, String string);
    boolean EliminarProducto(JFrame frame, String idSeleccionado, JTable tblProductos);
}
