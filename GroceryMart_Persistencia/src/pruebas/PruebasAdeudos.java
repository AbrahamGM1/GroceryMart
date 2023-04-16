/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import Entidades.Adeudo;
import Entidades.Costo;
import Interfaces.IAdeudosDAO;
import Interfaces.ICostosDAO;
import daos.AdeudosDAO;
import daos.CostosDAO;
import interfaces.ConexionBD;
import interfaces.IConexionBD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public class PruebasAdeudos {
    
      public static void main(String[] args) {
          
          IConexionBD conexion= new ConexionBD();
          
          //prueba insertar
          IAdeudosDAO ado= new AdeudosDAO(conexion);
          ICostosDAO cosdao= new CostosDAO(conexion);
          
          Adeudo adeudo = new Adeudo("Juan Perez","prestamo coca cola 600ml");
          Adeudo adeudo2 = new Adeudo("No Juan Perez","prestamo coca cola 2litros");
          Adeudo adeudo3 = new Adeudo("ricardo","fiado");
          
          ado.insertar(adeudo);
          ado.insertar(adeudo2);
          ado.insertar(adeudo3);

          
          //prueba consulta todos
          List<Adeudo> adoLista= new ArrayList<>();
          
          adoLista=  ado.consultarTodos();
          
          for (Adeudo xx: adoLista){
              System.out.println(xx.toString());
          }
          
          //prueba obtener consulta objeto adeudo individual
          Adeudo adeudoIndividual = new Adeudo();
          adeudoIndividual.setId(3);
          
          System.out.println(ado.consultar(adeudoIndividual).toString());
          
          //prueba eliminar adeudo de la bd
          ado.eliminar(2);
          
          adoLista=  ado.consultarTodos();
          
          for (Adeudo xx: adoLista){
              System.out.println(xx.toString());
          }
          
          //prueba aniadir costo (insertando negativo y positivo
          
          Costo costo = new Costo();
          Costo costo2 = new Costo();
          
          costo.setDinero(500f);
          costo2.setDinero(-500.0f);
          
          cosdao.insertar(costo, 1);
          cosdao.insertar(costo2, 1);
          
          List<Costo> costoLista= new ArrayList<>();
          
          adeudo.setId(1);
          
          costoLista=  cosdao.consultarCostosAdeudo(adeudo);
          
          for (Costo xx: costoLista){
              System.out.println(xx.toString());
          }
          
          
          
          
      }
}
