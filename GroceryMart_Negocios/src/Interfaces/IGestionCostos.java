/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Adeudo;
import Entidades.Costo;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author spide
 */
public interface IGestionCostos {

    public boolean insertar(Costo costo, int idAdeudo, Adeudo adeudo, JFrame frame);

    public boolean restar(Costo costo, int idAdeudo);

    public List<Costo> consultarCostosAdeudo(Adeudo adeudo, JTable table);

    public void calcularTotal(Adeudo adeudo, JLabel lblTotal);
}
