/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Compra;
import Entidades.DetalleCompra;
import java.util.ArrayList;

/**
 *
 * @author rjsaa
 */
public interface IComprasDAO {
    
    public boolean insertar(Compra compra);
    
    public boolean insertarDetalles(ArrayList<DetalleCompra> detalles);
    
    public int consultarUltimo();
    
}
