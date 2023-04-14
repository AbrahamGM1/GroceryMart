/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Interfaces.IComprasDAO;
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
public class ComprasDAO implements IComprasDAO {

    private IConexionBD conexion;

    public ComprasDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public boolean insertar(Compra compra) {
        try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("INSERT INTO grocery_mart.compras \n"
                    + "(total,id_usuarios)\n"
                    + "VALUES (" + compra.getTotal() + "," + compra.getIdUsuarios()+");");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            
            

            this.insertarDetalles(compra.getDetalle());
            
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public boolean insertarDetalles(ArrayList<DetalleCompra> detalles) {
        
        for(DetalleCompra xx: detalles){
            try {
            Connection conexion = this.conexion.crearConexion();
         
            Statement comandoSQL = conexion.createStatement();
               
            int ultimo = this.consultarUltimo();
            
            String codigoSQL = String.format("INSERT INTO grocery_mart.detalle_compra_producto \n"
                    + "(id_producto,id_compra,cantidad,preciovendido,importe)\n"
                    + "VALUES (" + xx.getProducto().getIdProducto() + "," + ultimo
                    +","+xx.getCantidad()+","+xx.getPrecioVendido()+","+xx.getImporte()+");");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
            } catch (SQLException ex) {
            return false;
            }
        }
        
        return true;
        
    }
    
    @Override
    public int consultarUltimo() {
        int ultimo = 0;

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT MAX(id_compras) FROM grocery_mart.compras");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                ultimo = resultados.getInt(1);

            }
            conexion.close();
            return ultimo;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return ultimo;
        }
    }
    
}
