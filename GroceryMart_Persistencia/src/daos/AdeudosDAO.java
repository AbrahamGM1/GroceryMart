/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import Entidades.Adeudo;
import Entidades.Producto;
import Interfaces.IAdeudosDAO;
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
public class AdeudosDAO implements IAdeudosDAO{

    private IConexionBD conexion;

    public AdeudosDAO(IConexionBD conexionBD) {
        this.conexion = conexionBD;
    }
    
    @Override
    public boolean insertar(Adeudo adeudo) {
       try {
            Connection conexion = this.conexion.crearConexion();
            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("INSERT INTO grocery_mart.registrodeudas \n"
                    + "(nombre,asunto)\n"
                    + "VALUES ('" + adeudo.getNombre() + "','" + adeudo.getAsunto() + "');");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    @Override
    public Adeudo consultar(Adeudo adeudo) {
        
        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.registrodeudas"
                    + " WHERE id_cuentasdinero = " + adeudo.getId() + ";");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            
            resultados.next();
            
            Adeudo adeudo1 = new Adeudo();
            adeudo1.setId(resultados.getInt(1));
            adeudo1.setNombre(resultados.getString(2));
            adeudo1.setAsunto(resultados.getString(3));
            conexion.close();
            return adeudo1;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Adeudo> consultarTodos() {
        List<Adeudo> adeudos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.registrodeudas;");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                Adeudo adeudo = new Adeudo();
                adeudo.setId(resultados.getInt(1));
                adeudo.setNombre(resultados.getString(2));
                adeudo.setAsunto(resultados.getString(3));

                adeudos.add(adeudo);

            }
            conexion.close();
            return adeudos;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Adeudo> ConsultaString(String string) {
        List<Adeudo> adeudos = new ArrayList<>();

        try {
            Connection conexion = this.conexion.crearConexion();

            Statement comandoSQL = conexion.createStatement();
            String codigoSQL = String.format("SELECT * FROM grocery_mart.registrodeudas"
                    + " WHERE nombre LIKE '%%" + string + "%%';");

            ResultSet resultados = comandoSQL.executeQuery(codigoSQL);

            while (resultados.next()) {
                Adeudo adeudo = new Adeudo();
                adeudo.setId(resultados.getInt(1));
                adeudo.setNombre(resultados.getString(2));
                adeudo.setAsunto(resultados.getString(3));

                adeudos.add(adeudo);

            }
            conexion.close();
            return adeudos;

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
            String codigoSQL = String.format("DELETE FROM grocery_mart.registrodeudas"
                    + " WHERE id_CuentasDinero = " + id + "");

            int registrosAfectados = comandoSQL.executeUpdate(codigoSQL);
            conexion.close();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
}
