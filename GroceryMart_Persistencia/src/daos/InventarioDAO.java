/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Entidades.Producto;
import Entidades.ProductoInventario;
import Interfaces.IInventarioDAO;
import interfaces.IConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public class InventarioDAO implements IInventarioDAO {
    private IConexionBD conexion;

    public InventarioDAO(IConexionBD conexionBD) {
        this.conexion = conexionBD;
    }

    @Override
    public boolean insertar(ProductoInventario producto) {

        try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("INSERT INTO grocery_mart.producto_inventario \n"
                    + "(cantidad,id_producto)\n"
                    + "VALUES ('" + producto.getCantidad() + "','" + producto.getIdProducto().getIdProducto()+"');");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    //metodo que comprueba si no se tiene este producto en el inventario
    
    @Override
    public boolean consultarProductoInventario(String string) {
        List<ProductoInventario> productos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.producto_inventario"
                    + " JOIN grocery_mart.productos "
                    + " ON grocery_mart.productos.id_productos = grocery_mart.producto_inventario.id_producto"
                    + " AND grocery_mart.productos.nombre LIKE '%%" + string + "%%' ");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            resultados.next();
            
            String str = resultados.getString(1);
            
            System.out.println(str);

            conexion.close();
            return true;
      
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
        public Producto consultarId(Integer id) {
        List<ProductoInventario> productos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.producto_inventario"
                    + " JOIN grocery_mart.productos "
                    + " ON grocery_mart.productos.id_productos = grocery_mart.producto_inventario.id_producto"
                    + " WHERE id_producto = "+ id
            );

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                ProductoInventario producto = new ProductoInventario();
                producto.setIdProductoInventario(resultados.getInt(1));
                producto.setCantidad(resultados.getInt(2));
                
                Producto productoss = new Producto();
                
                productoss.setIdProducto(resultados.getInt(3));
                productoss.setNombre(resultados.getString(5));
                productoss.setPrecio(resultados.getFloat(6));
                productoss.setMarca(resultados.getString(7));
                producto.setProducto(productoss);
                
                productos.add(producto);

            }
            conexion.close();
            return productos.get(0).getIdProducto();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    
        public List<ProductoInventario> consultarTodoProductoInventario() {
        List<ProductoInventario> productos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.producto_inventario"
                    + " JOIN grocery_mart.productos "
                    + " ON grocery_mart.productos.id_productos = grocery_mart.producto_inventario.id_producto");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                ProductoInventario producto = new ProductoInventario();
                producto.setIdProductoInventario(resultados.getInt(1));
                producto.setCantidad(resultados.getInt(2));
                
                Producto productoss = new Producto();
                
                productoss.setIdProducto(resultados.getInt(3));
                productoss.setNombre(resultados.getString(5));
                productoss.setPrecio(resultados.getFloat(6));
                productoss.setMarca(resultados.getString(7));
                producto.setProducto(productoss);
                
                productos.add(producto);

            }
            conexion.close();
            return productos;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    
    
    @Override
    public List<ProductoInventario> consultarTodos() {
        List<ProductoInventario> productos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.producto_inventario;");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                ProductoInventario producto = new ProductoInventario();
                producto.setIdProductoInventario(resultados.getInt(1));
                producto.setCantidad(resultados.getInt(2));
                
                Producto productoss = new Producto();
                
                productoss.setIdProducto(resultados.getInt(3));
                
                producto.setProducto(productoss);
                
                productos.add(producto);

            }
            conexion.close();
            return productos;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean agregarCantidad(int cantidad, int idInventario) {
        try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("UPDATE grocery_mart.producto_inventario "
                    + "SET cantidad = cantidad + "+ cantidad
                    + " WHERE grocery_mart.producto_inventario.id_producto = "+idInventario+" ;");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
            public List<ProductoInventario> ConsultaString(String string) {
        List<ProductoInventario> productos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.producto_inventario"
                    + " JOIN grocery_mart.productos "
                    + " ON grocery_mart.productos.id_productos = grocery_mart.producto_inventario.id_producto"
                    + " WHERE nombre LIKE '%%" + string + "%%';"
            );

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                ProductoInventario producto = new ProductoInventario();
                producto.setIdProductoInventario(resultados.getInt(1));
                producto.setCantidad(resultados.getInt(2));
                
                Producto productoss = new Producto();
                
                productoss.setIdProducto(resultados.getInt(3));
                productoss.setNombre(resultados.getString(5));
                productoss.setPrecio(resultados.getFloat(6));
                productoss.setMarca(resultados.getString(7));
                producto.setProducto(productoss);
                
                productos.add(producto);

            }
            conexion.close();
            return productos;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
