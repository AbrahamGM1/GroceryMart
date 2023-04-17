/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public class ConexionBD implements IConexionBD{

    final String cadenaConexion = "jdbc:mysql://localhost/grocery_mart";
    final String usuario="root";
    final String contrasenia="035602";

    public ConexionBD() {
    }

    @Override
    public Connection crearConexion() throws SQLException {
       Connection conexion = DriverManager.getConnection(cadenaConexion,usuario,contrasenia);
       return conexion;
    }
    
    
    
    
}
