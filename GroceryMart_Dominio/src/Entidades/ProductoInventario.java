/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author spide
 */
public class ProductoInventario {
    
    private int idProductoInventario;
    private int cantidad;
    private Producto producto;

    public ProductoInventario() {
    }

    public ProductoInventario(int idProductoInventario, int cantidad, Producto producto) {
        this.idProductoInventario = idProductoInventario;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public ProductoInventario(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getIdProductoInventario() {
        return idProductoInventario;
    }

    public void setIdProductoInventario(int idProductoInventario) {
        this.idProductoInventario = idProductoInventario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getIdProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idProductoInventario;
        hash = 97 * hash + this.cantidad;
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
        final ProductoInventario other = (ProductoInventario) obj;
        if (this.idProductoInventario != other.idProductoInventario) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        return this.producto == other.producto;
    }

    @Override
    public String toString() {
        return "ProductoInventario{" + "idProductoInventario=" + idProductoInventario + ", cantidad=" + cantidad + ", idProducto=" + producto.toString() + '}';
    }
    
    
    
}
