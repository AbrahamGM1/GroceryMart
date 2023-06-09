/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import Entidades.Adeudo;
import Entidades.Producto;
import Interfaces.IGestionAdeudos;
import Interfaces.IGestionProducto;
import Negocio.GestionAdeudos;
import Negocio.GestionProducto;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author spide
 */
public class frmAgregarAdeudo extends javax.swing.JFrame {

    /**
     * Creates new form frmAgregarProducto
     */
    IGestionAdeudos control = new GestionAdeudos();
    
    public frmAgregarAdeudo() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtAsunto = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnRestablecer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 36)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 36)); // NOI18N
        jLabel5.setText("Asunto:");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtAsunto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtAsunto.setForeground(new java.awt.Color(102, 102, 102));
        txtAsunto.setToolTipText("");
        txtAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAsuntoActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(51, 153, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRestablecer.setBackground(new java.awt.Color(255, 255, 255));
        btnRestablecer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRestablecer.setForeground(new java.awt.Color(51, 153, 255));
        btnRestablecer.setText("Restablecer");
        btnRestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestablecerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestablecerMouseExited(evt);
            }
        });
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 162, 232));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR CUENTA DE ADEUDO");

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 102, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAsunto)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        frmGestionAdeudos ga = new frmGestionAdeudos();
        ga.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAsuntoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Agregar cuenta
        String nombre = txtNombre.getText();
        String asunto = txtAsunto.getText();
        Adeudo adeudo = new Adeudo(nombre, asunto);
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre para la cuenta antes de continuar", "Aviso", 2);
        } else if (asunto.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un asunto para la cuenta antes de continuar", "Aviso", 2);
        } else {
            boolean seAgregoAdeudo = control.insertar(adeudo, this);
            if (seAgregoAdeudo) {
                frmGestionAdeudos ga = new frmGestionAdeudos();
                ga.setVisible(true);
                this.setVisible(false);
            }
        }
        

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        
        txtAsunto.setText("");
        txtNombre.setText("");

    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setBackground(Color.blue);
        btnAgregar.setForeground(Color.white);
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setBackground(Color.white);
        btnAgregar.setForeground(new Color(51,153,255));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnRestablecerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestablecerMouseEntered
        btnRestablecer.setBackground(Color.blue);
        btnRestablecer.setForeground(Color.white);
    }//GEN-LAST:event_btnRestablecerMouseEntered

    private void btnRestablecerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestablecerMouseExited
        btnRestablecer.setBackground(Color.white);
        btnRestablecer.setForeground(new Color(51,153,255));
    }//GEN-LAST:event_btnRestablecerMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRestablecer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
