/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Entidades.Adeudo;
import java.util.List;

/**
 *
 * @author rjsaa
 */
public interface IAdeudosDAO {
    
    public boolean insertar(Adeudo adeudo);
    
    public Adeudo consultar(Integer idAdeudo);
    
    public List<Adeudo> consultarTodos();
    
    public List<Adeudo> ConsultaString(String string);
    
    public boolean eliminar(int id);
}
