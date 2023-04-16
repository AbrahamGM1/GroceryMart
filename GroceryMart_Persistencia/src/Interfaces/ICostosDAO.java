/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Adeudo;
import Entidades.Costo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public interface ICostosDAO {
    
    public boolean insertar(Costo costo,int idAdeudo);
   
    public List<Costo> consultarCostosAdeudo(Adeudo adeudo);
    
}
