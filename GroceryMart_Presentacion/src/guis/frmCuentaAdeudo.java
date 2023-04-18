/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import Entidades.Adeudo;
import Entidades.Costo;
import Interfaces.IGestionAdeudos;
import Interfaces.IGestionCostos;
import Negocio.GestionAdeudos;
import Negocio.GestionCostos;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author spide
 */
public class frmCuentaAdeudo extends javax.swing.JFrame {

    /**
     * Creates new form frmCuentaAdeudo
     */
    private Adeudo adeudo;
    IGestionAdeudos control = new GestionAdeudos();
    IGestionCostos controlCostos = new GestionCostos();

    public frmCuentaAdeudo(Adeudo adeudo) {
        initComponents();
        this.adeudo = adeudo;
        control.cargarCuenta(adeudo, txtNombre, txtId, txtAsunto);
        controlCostos.consultarCostosAdeudo(adeudo, tablaCostos);
        controlCostos.calcularTotal(adeudo, lblTotal);
        getContentPane().setBackground(Color.WHITE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCostos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnRestar = new javax.swing.JButton();
        txtRestar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSumar = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel1.setText("Identificación:");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel2.setText("CUENTA DE ADEUDO");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel3.setText("Nombre:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel4.setText("Asunto:");

        txtAsunto.setEditable(false);
        txtAsunto.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsuntoActionPerformed(evt);
            }
        });

        tablaCostos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Costos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCostos);
        if (tablaCostos.getColumnModel().getColumnCount() > 0) {
            tablaCostos.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel5.setText("TOTAL: $");

        lblTotal.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        lblTotal.setText("0.00");

        btnRestar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(51, 153, 255));
        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        txtRestar.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestarActionPerformed(evt);
            }
        });
        txtRestar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRestarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRestarKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel7.setText("Cantidad a restar:");

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 102, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel8.setText("Agregar:");

        txtSumar.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        txtSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSumarActionPerformed(evt);
            }
        });
        txtSumar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSumarKeyTyped(evt);
            }
        });

        btnSumar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(51, 153, 255));
        btnSumar.setText("Agregar costo");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSumar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombre)
                                    .addComponent(txtAsunto)
                                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(9, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(lblTotal))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsuntoActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed

        if ("".equals(txtRestar.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese la cantidad a inventariar primero", "Aviso", 2);
        } else if (Float.parseFloat(txtRestar.getText()) == 0) {
            JOptionPane.showMessageDialog(this, "La cantidad ingresada debe de ser mayor a 0", "Aviso", 2);
        } else {
            Costo costo = new Costo();

            costo.setDinero(-1 * (Float.parseFloat(txtRestar.getText())));
            boolean seAgregoCosto = controlCostos.insertar(costo, adeudo.getId(), adeudo, this);
            controlCostos.consultarCostosAdeudo(adeudo, tablaCostos);
            controlCostos.calcularTotal(adeudo, lblTotal);
            if (seAgregoCosto) {
                txtRestar.setText("");
            }
        }

    }//GEN-LAST:event_btnRestarActionPerformed

    private void txtRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmGestionAdeudos g = new frmGestionAdeudos();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSumarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtSumar.getText())) {
            JOptionPane.showMessageDialog(this, "Ingrese la cantidad a inventariar primero", "Aviso", 2);
        } else if (Float.parseFloat(txtSumar.getText()) == 0) {
            JOptionPane.showMessageDialog(this, "La cantidad ingresada debe de ser mayor a 0", "Aviso", 2);
        } else {
            Costo costo = new Costo();
            costo.setDinero(Float.parseFloat(txtSumar.getText()));
            controlCostos.insertar(costo, adeudo.getId(), adeudo, this);
            controlCostos.consultarCostosAdeudo(adeudo, tablaCostos);
            controlCostos.calcularTotal(adeudo, lblTotal);
            txtSumar.setText("");
        }
    }//GEN-LAST:event_btnSumarActionPerformed

    private void txtRestarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRestarKeyPressed

    }//GEN-LAST:event_txtRestarKeyPressed

    private void txtSumarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSumarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || c == '.' && txtSumar.getText().indexOf('.') == -1) {
            super.processKeyEvent(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtSumarKeyTyped

    private void txtRestarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRestarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || c == '.' && txtRestar.getText().indexOf('.') == -1) 
        {
            super.processKeyEvent(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtRestarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaCostos;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRestar;
    private javax.swing.JTextField txtSumar;
    // End of variables declaration//GEN-END:variables
}
