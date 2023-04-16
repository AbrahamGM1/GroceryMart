/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Entidades.Adeudo;
import Entidades.Costo;
import Interfaces.ICostosDAO;
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
public class CostosDAO implements ICostosDAO{
    
    
    private IConexionBD conexion = null;

    public CostosDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public boolean insertar(Costo costo,int idAdeudo) {
        try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("INSERT INTO grocery_mart.dinero \n"
                    + "(dinero,id_registrodeudas)\n"
                    + "VALUES ('" + costo.getDinero() + "','" + idAdeudo + "');");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
        
    }
    
    @Override
    public List<Costo> consultarCostosAdeudo(Adeudo adeudo){
        List<Costo> costos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.dinero"
                    + " WHERE id_registrodeudas = " + adeudo.getId() + ";");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                Costo costo = new Costo();
                costo.setId(resultados.getInt(1));
                costo.setDinero(resultados.getFloat(2));
                
                costos.add(costo);

            }
            conexion.close();
            return costos;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
