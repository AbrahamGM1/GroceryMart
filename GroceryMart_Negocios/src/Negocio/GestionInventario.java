package Negocio;

import Entidades.Producto;
import Entidades.ProductoInventario;
import Interfaces.IGestionInventario;
import Interfaces.IGestionProducto;
import Interfaces.IInventarioDAO;
import daos.InventarioDAO;
import daos.ProductoDAO;
import interfaces.ConexionBD;
import interfaces.IConexionBD;
import interfaces.IProductosDAO;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author spide
 */
public class GestionInventario implements IGestionInventario {

    private IConexionBD conexion = new ConexionBD();
    InventarioDAO p = new InventarioDAO(conexion);
    IGestionProducto gp = new GestionProducto();

    @Override
    public boolean insertar(JFrame frame, Integer idProducto, JTable tblProductos, int cantidad) {

        try {
            Producto producto = gp.consultaProducto(frame, idProducto.toString(), tblProductos);
            ProductoInventario pi = new ProductoInventario();
            String nombre = producto.getNombre();

            if (p.consultarProductoInventario(nombre)) {
                /////////// Para sumar ocupo el id del inventario
                /// cosa que hasta orita no puedo sacar
                p.agregarCantidad(cantidad, producto.getIdProducto());
                JOptionPane.showMessageDialog(frame, "El producto seleccionado ya se encuentra en el inventario, la cantidad ingresada le será sumada", "Aviso", 1);
                return true;
            } else if (!(p.consultarProductoInventario(nombre))) {

                pi.setProducto(producto);
                pi.setCantidad(cantidad);
                p.insertar(pi);
                JOptionPane.showMessageDialog(frame, "El producto ha sido agregado al inventario", "Aviso", 1);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean consultarProductoInventario(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ProductoInventario> consultarTodos(JTable table) {
        List<ProductoInventario> listaInventario = p.consultarTodoProductoInventario();

        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
        modeloTabla.setRowCount(0);
        listaInventario.forEach(inventario -> {

            Object[] fila = new Object[5];
            fila[0] = inventario.getIdProductoInventario();
            fila[1] = inventario.getIdProducto().getNombre();
            fila[2] = inventario.getIdProducto().getMarca();
            fila[3] = inventario.getIdProducto().getPrecio();
            fila[4] = inventario.getCantidad();

            modeloTabla.addRow(fila);

        });
        //Desaparece la tabla del ID
        //table.getColumnModel().getColumn(0).setMaxWidth(0);
        //table.getColumnModel().getColumn(0).setMinWidth(0);
        //table.getColumnModel().getColumn(0).setPreferredWidth(0);
        return listaInventario;
    }

    @Override
    public boolean agregarCantidad(int cantidad, int idInventario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ProductoInventario> ConsultaString(String string, JTable table) {
        List<ProductoInventario> listaInventario = p.ConsultaString(string);

        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
        modeloTabla.setRowCount(0);
        listaInventario.forEach(inventario -> {

            Object[] fila = new Object[5];
            fila[0] = inventario.getIdProductoInventario();
            fila[1] = inventario.getIdProducto().getNombre();
            fila[2] = inventario.getIdProducto().getMarca();
            fila[3] = inventario.getIdProducto().getPrecio();
            fila[4] = inventario.getCantidad();

            modeloTabla.addRow(fila);

        });
        //Desaparece la tabla del ID
        //table.getColumnModel().getColumn(0).setMaxWidth(0);
        //table.getColumnModel().getColumn(0).setMinWidth(0);
        //table.getColumnModel().getColumn(0).setPreferredWidth(0);
        return listaInventario;
    }

}
