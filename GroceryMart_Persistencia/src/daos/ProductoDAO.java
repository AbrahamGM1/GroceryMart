/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Entidades.Producto;
import Entidades.status;
import interfaces.IConexionBD;
import interfaces.IProductosDAO;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rjsaa
 */
public class ProductoDAO implements IProductosDAO {

    private IConexionBD conexion = null;

    public ProductoDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean insertar(Producto producto) {

        try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("INSERT INTO grocery_mart.productos \n"
                    + "(nombre,precio,marca,descripcion,estatus)\n"
                    + "VALUES ('" + producto.getNombre() + "','" + producto.getPrecio() + "','" + producto.getMarca() + "',"
                    + "'" + producto.getDescripcion() + "','" + producto.getStatus() + "');");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean actualizar(Producto producto) {
        try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("UPDATE grocery_mart.productos \n"
                    + "SET nombre = '" + producto.getNombre() + "' , precio = " + producto.getPrecio() + ", marca= '" + producto.getMarca() + "', \n"
                    + "descripcion = '" + producto.getDescripcion() + "', estatus = '" + producto.getStatus() + "'\n"
                    + "WHERE id_productos = " + producto.getIdProducto() + ";");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public Producto consultar(Producto producto) {

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.productos"
                    + " WHERE id_productos = " + producto.getIdProducto() + ";");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            resultados.next();
            Producto productoReturn = new Producto();
            productoReturn.setIdProducto(resultados.getInt(1));
            productoReturn.setNombre(resultados.getString(2));
            productoReturn.setPrecio(resultados.getFloat(3));
            productoReturn.setMarca(resultados.getString(4));
            productoReturn.setDescripcion(resultados.getString(5));
            productoReturn.setStatus(resultados.getString(6));

            conexion.close();

            return productoReturn;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Producto> consultarTodos() {
        List<Producto> productos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.productos;");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultados.getInt(1));
                producto.setNombre(resultados.getString(2));
                producto.setPrecio(resultados.getFloat(3));
                producto.setMarca(resultados.getString(4));
                producto.setDescripcion(resultados.getString(5));
                producto.setStatus(resultados.getString(6));

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
    public List<Producto> ConsultaString(String string) {
        List<Producto> productos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.productos"
                    + " WHERE nombre LIKE '%%" + string + "%%';");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(resultados.getInt(1));
                producto.setNombre(resultados.getString(2));
                producto.setPrecio(resultados.getFloat(3));
                producto.setMarca(resultados.getString(4));
                producto.setDescripcion(resultados.getString(5));
                producto.setStatus(resultados.getString(6));

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
    public boolean eliminar(int id) {
        try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("DELETE FROM grocery_mart.productos"
                    + " WHERE id_productos=" + id + "");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

}
