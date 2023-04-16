/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Producto;
import Entidades.ProductoInventario;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public interface IInventarioDAO {
    
    public boolean insertar(ProductoInventario producto);
    
    public List<ProductoInventario> consultarTodos();
    
    public boolean consultarProductoInventario(String string);
    
    public boolean agregarCantidad(int cantidad,int idInventario);
   
}
