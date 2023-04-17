/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Entidades.Producto;
import daos.ProductoDAO;
import interfaces.ConexionBD;
import interfaces.IConexionBD;
import interfaces.IProductosDAO;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Interfaces.IGestionProducto;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author spide
 */
public class GestionProducto implements IGestionProducto {

    private IConexionBD conexion = new ConexionBD();
    IProductosDAO p = new ProductoDAO(conexion);

    @Override
    public List<Producto> ConsultaTodos(JTable tblProductos) {
        List<Producto> listaProductos = p.consultarTodos();

        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        modeloTabla.setRowCount(0);
        listaProductos.forEach(producto -> {

            Object[] fila = new Object[3];
            fila[0] = producto.getIdProducto();
            fila[1] = producto.getNombre();
            fila[2] = producto.getPrecio();
            modeloTabla.addRow(fila);

        });
        //Desaparece la tabla del ID
        tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
        return listaProductos;
    }

    @Override
    public boolean AgregarProducto(JFrame frame, Producto producto) {

        //TO DO, Validación para evitar productos repetidos
        if (producto.getNombre().equals("")) {
            JOptionPane.showMessageDialog(frame, "Ingrese un nombre antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (producto.getDescripcion().equals("")) {
            JOptionPane.showMessageDialog(frame, "Ingrese una descripción antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (producto.getPrecio() == 0) {
            JOptionPane.showMessageDialog(frame, "Ingrese un precio válido antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (producto.getMarca().equals("")) {
            JOptionPane.showMessageDialog(frame, "Ingrese la marca del producto antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;

        } else {
            p.insertar(producto);
            JOptionPane.showMessageDialog(frame, "Se agregó el producto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }

    @Override
    public Integer getProductoSeleccionado(JTable tblProductos) {
        int indiceFilaSeleccionada = tblProductos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        int indiceColumnaId = 0;
        if (indiceFilaSeleccionada != -1) {
            Integer productoSeleccionado = (Integer) modelo.getValueAt(indiceFilaSeleccionada, indiceColumnaId);
            return productoSeleccionado;
        } else {
            return null;
        }
    }

    @Override
    public String getProductoSeleccionadoNombre(JTable tblProductos, JTextField txt) {
        int indiceFilaSeleccionada = tblProductos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        int indiceColumnaId = 1;
        if (indiceFilaSeleccionada != -1) {
            String productoSeleccionado = (String) modelo.getValueAt(indiceFilaSeleccionada, indiceColumnaId);
            txt.setText(productoSeleccionado);
            return productoSeleccionado;
        } else {
            return null;
        }
    }

    public Producto consultaProducto(JFrame frame, String idSeleccionado, JTable tblProductos) {
        //INICIALIZAR LOS ID

        if (idSeleccionado == null) {
            JOptionPane.showMessageDialog(frame, "Debes seleccionar un producto primero", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return null;
        } else {
            idSeleccionado = this.getProductoSeleccionado(tblProductos).toString();
            // Devolver cada parámetro dentro de su respectivo JTextField 
            Producto producto = new Producto(Integer.parseInt(idSeleccionado));
            producto = p.consultar(producto);
            return producto;
        }
    }

    @Override
    public boolean ActualizarProducto(JFrame frame, Producto producto) {
        //TO DO, Validación para evitar productos repetidos
        if (producto.getNombre().equals("")) {
            JOptionPane.showMessageDialog(frame, "Ingrese un nombre antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (producto.getDescripcion().equals("")) {
            JOptionPane.showMessageDialog(frame, "Ingrese una descripción antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (producto.getPrecio() == 0) {
            JOptionPane.showMessageDialog(frame, "Ingrese un precio válido antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else if (producto.getMarca().equals("")) {
            JOptionPane.showMessageDialog(frame, "Ingrese la marca del producto antes de continuar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;

        } else {
            p.actualizar(producto);
            JOptionPane.showMessageDialog(frame, "Se actualizó el producto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }

    @Override
    public List<Producto> ConsultaString(JTable tblProductos, String string) {
        List<Producto> listaProductos = p.ConsultaString(string);

        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        modeloTabla.setRowCount(0);
        listaProductos.forEach(producto -> {

            Object[] fila = new Object[3];
            fila[0] = producto.getIdProducto();
            fila[1] = producto.getNombre();
            fila[2] = producto.getPrecio();
            modeloTabla.addRow(fila);

        });
        //Desaparece la tabla del ID
        tblProductos.getColumnModel().getColumn(0).setMaxWidth(0);
        tblProductos.getColumnModel().getColumn(0).setMinWidth(0);
        tblProductos.getColumnModel().getColumn(0).setPreferredWidth(0);

        return listaProductos;
    }

    @Override
    public boolean EliminarProducto(JFrame frame, String idSeleccionado, JTable tblProductos) {
        if (idSeleccionado == null) {
            JOptionPane.showMessageDialog(frame, "Debes seleccionar un producto primero", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else {
            // Devolver cada parámetro dentro de su respectivo JTextField 
            idSeleccionado = this.getProductoSeleccionado(tblProductos).toString();
            Producto producto = new Producto(Integer.parseInt(idSeleccionado));
            p.eliminar(Integer.parseInt(idSeleccionado));
            JOptionPane.showMessageDialog(frame, "Se eliminó el producto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }

}
