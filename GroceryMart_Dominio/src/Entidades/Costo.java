/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author rjsaa
 */
public class Costo {
    
    private int id;
    private float dinero;

    public Costo() {
    }

    public Costo(int id, float dinero) {
        this.id = id;
        this.dinero = dinero;
    }

    public Costo(float dinero) {
        this.dinero = dinero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Costo other = (Costo) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Costo{" + "id=" + id + ", dinero=" + dinero + '}';
    }
    
    
    
    
}
