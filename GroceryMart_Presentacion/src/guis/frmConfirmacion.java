package guis;

import Interfaces.IGestionAdeudos;
import Interfaces.IGestionProducto;
import Negocio.GestionAdeudos;
import Negocio.GestionProducto;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Abraham
 */
public class frmConfirmacion extends javax.swing.JFrame {

    private String contraseña = "123";
    private boolean esCorrecto = false;
    IGestionProducto control = new GestionProducto();
    IGestionAdeudos controlAdeudo = new GestionAdeudos();
    JTable tablaProductos;
    JTable tablaAdeudos;
    boolean esProducto;
    boolean esAdeudo;

    public frmConfirmacion(JTable tablaProductos, JTable tablaAdeudos, boolean esProducto, boolean esAdeudo) {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        this.tablaProductos = tablaProductos;
        this.tablaAdeudos = tablaAdeudos;
        this.esProducto = esProducto;
        this.esAdeudo = esAdeudo;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel2.setText("Contraseña:");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 28)); // NOI18N
        jLabel3.setText("CONFIRMACIÓN");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(204, 0, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(51, 153, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Cerrar();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        String texto = txtContraseña.getText();

        //Contraseña correcta
        if (texto.equals(contraseña)) {

            // Si se trata de borrar un producto
            if (esProducto == true && esAdeudo == false) {

                /// ELIMINAR PRODUCTO
                try {
                    Integer idSeleccionado = control.getProductoSeleccionado(tablaProductos);
                    boolean seEliminoProducto = control.EliminarProducto(this, String.valueOf(idSeleccionado), tablaProductos);
                    if (seEliminoProducto) {
                        control.ConsultaTodos(tablaProductos);
                    }
                } catch (NullPointerException e) {
                    boolean seEliminoProducto = control.EliminarProducto(this, null, tablaProductos);
                }
                /////////////////////

                this.dispose();

            } // Si se trata de borrar un adeudo
            else if (esProducto == false && esAdeudo == true) {

                /// ELIMINAR ADEUDO
                try {
                    Integer idAdeudoSeleccionado = controlAdeudo.getAdeudoSeleccionado(tablaAdeudos);
                    boolean seEliminoAdeudo = controlAdeudo.eliminar(idAdeudoSeleccionado, this, tablaAdeudos);
                    if (seEliminoAdeudo) {
                        controlAdeudo.consultarTodos(tablaAdeudos);
                    }
                } catch (NullPointerException e) {
                    boolean seEliminoAdeudo = controlAdeudo.eliminar(-1, this, tablaAdeudos);
                }
                ///////////////////

                this.dispose();
                
            }

        } //Contraseña incorrecta
        else {

            JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "Aviso", 1);
            esCorrecto = false;

        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    public boolean Correcto() {
        return esCorrecto;
    }

    public void Cerrar() {
        this.dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
