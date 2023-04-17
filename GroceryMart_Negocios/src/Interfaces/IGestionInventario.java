/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.ProductoInventario;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author spide
 */
public interface IGestionInventario {
    boolean insertar(JFrame frame,Integer idProducto, JTable tblProductos,int cantidad);
    public boolean consultarProductoInventario(String string);
    public List<ProductoInventario> consultarTodos(JTable table);
    public boolean agregarCantidad(int cantidad, int idInventario);
    public List<ProductoInventario> ConsultaString(String string, JTable table);
}
