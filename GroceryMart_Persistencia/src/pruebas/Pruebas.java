/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import Entidades.Producto;
import Entidades.status;
import daos.ProductoDAO;
import interfaces.ConexionBD;
import interfaces.IConexionBD;
import interfaces.IProductosDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IConexionBD conexion= new ConexionBD();
        IProductosDAO pd = new ProductoDAO(conexion);
        
//        //String nombre, float precio, String marca, String descripcion
//        Producto producto= new Producto("coca cola",20.0f,"pepsico","ninguna");
//        producto.setStatus(status.ACTIVO.toString());
//        
//        Producto producto2 = new Producto("coca cola2",30.0f,"fanta","ninguna");
//        producto2.setStatus(status.ACTIVO.toString());
//        
//        Producto producto3= new Producto("coca cola3",25.0f,"pepsico33","ninguna");
//        producto3.setStatus(status.ACTIVO.toString());
//        
//        pd.insertar(producto);
//        pd.insertar(producto2);
//        pd.insertar(producto3);
        
        Producto producto4 = new Producto();
        producto4.setIdProducto(2);
        producto4 = pd.consultar(producto4);
        
        System.out.println(producto4.toString());
        
        producto4.setNombre("fanta");
        producto4.setPrecio(210.0f);
        producto4.setMarca("great value");
        producto4.setDescripcion("alguna");
        producto4.setStatus(status.DESCONTINUADO.toString());
        
        pd.actualizar(producto4);
        
//        List<Producto> productoLista = pd.consultarTodos();
//        
//        for(Producto xx: productoLista){
//            System.out.println(xx.toString());
//        }

        pd.eliminar(4);
        pd.eliminar(3);
        
        List<Producto> productoLista = pd.ConsultaString("2");
        
        for(Producto xx: productoLista){
            System.out.println(xx.toString());
        }
        
        
        
        
        
    }
    
}
