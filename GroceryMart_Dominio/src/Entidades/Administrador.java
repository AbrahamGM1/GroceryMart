/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author rjsaa
 */
public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String nombre, int idUsuario, String password, String pista) {
        super(nombre, idUsuario, password, pista);
    }

    public Administrador(String nombre, String password, String pista) {
        super(nombre, password, pista);
    }
    
}
