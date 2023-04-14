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
import java.sql.SQLException;
import java.sql.Statement;

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
    
    
}
