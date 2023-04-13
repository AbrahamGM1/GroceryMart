/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Entidades.Producto;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public interface IProductosDAO {
    public boolean insertar(Producto producto);
    
    public boolean actualizar(Producto producto);
    
    public Producto consultar(Producto producto);
    
    public List<Producto> consultarTodos();
    
    public List<Producto> ConsultaString(String string);
    
    public boolean eliminar(int id);
}
