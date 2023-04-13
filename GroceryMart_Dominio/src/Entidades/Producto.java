/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author spide
 */
public class Producto {
    
    private int idProducto;
    private String nombre;
    private float precio;
    private String marca;
    private String descripcion;
    private String status;

    public Producto() {
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    

    public Producto(int idProducto, String nombre, float precio, String marca, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public Producto(String nombre, float precio, String marca, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idProducto;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Float.floatToIntBits(this.precio);
        hash = 53 * hash + Objects.hashCode(this.marca);
        hash = 53 * hash + Objects.hashCode(this.descripcion);
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
        final Producto other = (Producto) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
   
}
