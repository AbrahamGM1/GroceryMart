/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author rjsaa
 */
public class Adeudo {
    private int id;
    private String nombre;
    private String asunto;
    private ArrayList<Costo> costo;
    

    public Adeudo() {
    }

    public Adeudo(int id, String nombre, String asunto) {
        this.id = id;
        this.nombre = nombre;
        this.asunto = asunto;
        this.costo = new ArrayList<>();
        
    }

    public Adeudo(String nombre, String asunto) {
        this.nombre = nombre;
        this.asunto = asunto;
        this.costo = new ArrayList<>();
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public ArrayList<Costo> getCosto() {
        return costo;
    }
    
    public void addCosto(Costo costo){
        this.costo.add(costo);
    }

    public void setCosto(ArrayList<Costo> costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Adeudo other = (Adeudo) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Adeudo{" + "id=" + id + ", nombre=" + nombre + ", asunto=" + asunto + ", costo=" + costo + '}';
    }
    
    
    
}
