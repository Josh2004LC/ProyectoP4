/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.marca;

import app.pos.entities.Cliente;
import app.pos.entities.Marca;
import app.pos.logica.LMarca;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class GuardarMarca extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuardarMarca
     */
    public GuardarMarca() {
        initComponents();
    }

    private void LimpiarFormulario() {
        this.txtNombre.setText("");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        lbTituloFormulario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        lbTituloFormulario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario.setText("Ingrese todos los campos requeridos");

        jLabel3.setText("Nombre:");

        lbRequeridoTipoIdentificacion1.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion1.setText("*");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-broom-16.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-save-16.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRequeridoTipoIdentificacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloFormulario)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnGuardar)
                        .addGap(31, 31, 31)
                        .addComponent(btnLimpiar)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbTituloFormulario)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbRequeridoTipoIdentificacion1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    
        if (this.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtNombre.requestFocus();
            return;
        }

        int operacion = new LMarca().Guardar(new Marca(
                0,
                this.txtNombre.getText().trim().toUpperCase(),
                1
        ));

        if (operacion > 0) {
            JOptionPane.showMessageDialog(this, "Se completó el registro correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar el registro de la marca,"
                    + " intente nuevamente, verifique que no exista la marca ingresada.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion1;
    private javax.swing.JLabel lbTituloFormulario;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
