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
public class Compra {
   
    private int idCompra;
    private float total;
    private ArrayList<DetalleCompra> detalle;
    private int idUsuarios;

    public Compra() {
    }

    public Compra(float total,ArrayList<DetalleCompra> detalle) {
        this.total = total;
        this.detalle = detalle;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ArrayList<DetalleCompra> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<DetalleCompra> detalle) {
        this.detalle = detalle;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.idCompra;
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
        final Compra other = (Compra) obj;
        return this.idCompra == other.idCompra;
    }
    
    
    
}
