/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import Entidades.Adeudo;
import Interfaces.IGestionAdeudos;
import Negocio.GestionAdeudos;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author spide
 */
public class frmGestionAdeudos extends javax.swing.JFrame {

    /**
     * Creates new form frmAdeudos
     */
    IGestionAdeudos control = new GestionAdeudos();
    
    public frmGestionAdeudos() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        control.consultarTodos(tablaAdeudos);
        tablaAdeudos.setRowHeight(50);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdeudos = new javax.swing.JTable();
        btnAgregarAdeudo = new javax.swing.JButton();
        btnVerAdeudo = new javax.swing.JButton();
        btnEliminarAdeudo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tablaAdeudos.setBackground(new java.awt.Color(255, 255, 255));
        tablaAdeudos.setFont(new java.awt.Font("Microsoft JhengHei", 0, 18)); // NOI18N
        tablaAdeudos.setForeground(new java.awt.Color(0, 0, 0));
        tablaAdeudos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Asunto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAdeudos.setMinimumSize(new java.awt.Dimension(30, 60));
        tablaAdeudos.setSelectionBackground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(tablaAdeudos);

        jScrollPane2.setViewportView(jScrollPane1);

        btnAgregarAdeudo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAgregarAdeudo.setForeground(new java.awt.Color(0, 0, 255));
        btnAgregarAdeudo.setText("Agregar Adeudo");
        btnAgregarAdeudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAdeudoActionPerformed(evt);
            }
        });

        btnVerAdeudo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVerAdeudo.setForeground(new java.awt.Color(0, 0, 255));
        btnVerAdeudo.setText("Ver Adeudo");
        btnVerAdeudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAdeudoActionPerformed(evt);
            }
        });

        btnEliminarAdeudo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEliminarAdeudo.setForeground(new java.awt.Color(153, 0, 0));
        btnEliminarAdeudo.setText("Eliminar Adeudo");
        btnEliminarAdeudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdeudoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 162, 232));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADEUDOS");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtConsulta.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N

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
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(29, 29, 29))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarAdeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerAdeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarAdeudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnAgregarAdeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerAdeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarAdeudo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        control.ConsultaString(txtConsulta.getText(), tablaAdeudos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarAdeudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAdeudoActionPerformed

        frmAgregarAdeudo aa = new frmAgregarAdeudo();
        aa.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAgregarAdeudoActionPerformed

    private void btnVerAdeudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAdeudoActionPerformed
        Integer idAdeudo = control.getAdeudoSeleccionado(tablaAdeudos);
        if (idAdeudo == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un adeudo para consultarlo", "Aviso", 2);
        }else{
        Adeudo adeudo = control.consultar(control.getAdeudoSeleccionado(tablaAdeudos));
        frmCuentaAdeudo ca = new frmCuentaAdeudo(adeudo);
        ca.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnVerAdeudoActionPerformed

    private void btnEliminarAdeudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdeudoActionPerformed
        
        frmConfirmacion fc = new frmConfirmacion(null,tablaAdeudos,false,true);
        fc.setVisible(true);

        
        
    }//GEN-LAST:event_btnEliminarAdeudoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        frmMenu m = new frmMenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAdeudo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarAdeudo;
    private javax.swing.JButton btnVerAdeudo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAdeudos;
    private javax.swing.JTextField txtConsulta;
    // End of variables declaration//GEN-END:variables
}
