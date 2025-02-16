/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.marca;

import app.pos.entities.Marca;
import app.pos.logica.LMarca;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class ActualizarMarca extends javax.swing.JInternalFrame {

    
    private Marca marca;
   
    public ActualizarMarca() {
        initComponents();
        CargarEstado();
    }

    private void CargarEstado() {
        this.cbxEstado.addItem("Activo");
        this.cbxEstado.addItem("Inactivo");

    }

    private int ObtenerEstado() {
        String estado = (String) this.cbxEstado.getSelectedItem();
        if (estado.equals("Activo")) {
            return 1;
        } else {
            return 0;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario1 = new javax.swing.JPanel();
        lbTituloFormulario2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lbProfesion1 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion14 = new javax.swing.JLabel();
        lbTituloFormulario3 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        cbxEstado = new javax.swing.JComboBox<>();
        txtNombreBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        lbTituloFormulario2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario2.setText("Ingrese todos los campos requeridos");

        jLabel4.setText("Nombre:");

        lbRequeridoTipoIdentificacion9.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion9.setText("*");

        txtNombre.setEditable(false);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-broom-16.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-save-16.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lbProfesion1.setText("Estado:");

        lbRequeridoTipoIdentificacion14.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion14.setText("*");

        lbTituloFormulario3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario3.setText("Buscar marca:");

        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-search-16.png"))); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el estado del cliente" }));

        javax.swing.GroupLayout panelFormulario1Layout = new javax.swing.GroupLayout(panelFormulario1);
        panelFormulario1.setLayout(panelFormulario1Layout);
        panelFormulario1Layout.setHorizontalGroup(
            panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormulario1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRequeridoTipoIdentificacion9)
                .addGap(18, 18, 18)
                .addGroup(panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormulario1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addContainerGap(407, Short.MAX_VALUE))
                    .addGroup(panelFormulario1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbProfesion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRequeridoTipoIdentificacion14)
                        .addGap(18, 18, 18)
                        .addComponent(cbxEstado, 0, 224, Short.MAX_VALUE)
                        .addGap(136, 136, 136))
                    .addGroup(panelFormulario1Layout.createSequentialGroup()
                        .addGroup(panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormulario1Layout.createSequentialGroup()
                                .addComponent(lbTituloFormulario3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormulario1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(lbTituloFormulario2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelFormulario1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(btnBuscar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFormulario1Layout.setVerticalGroup(
            panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormulario1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloFormulario3)
                    .addComponent(txtNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloFormulario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbRequeridoTipoIdentificacion9)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProfesion1)
                        .addComponent(lbRequeridoTipoIdentificacion14)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112)
                .addGroup(panelFormulario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormulario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormulario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void LimpiarFormulario() {
        this.txtNombre.setText("");
        this.txtNombre.setEditable(false);
        this.cbxEstado.setSelectedIndex(0);
        this.cbxEstado.setEditable(false);
        this.marca = null;
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    
        if (this.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtNombre.requestFocus();
            return;
        }

        if (this.cbxEstado.getSelectedItem() == null || this.cbxEstado.getSelectedItem().toString().equals("Seleccione el estado del cliente")) {
            JOptionPane.showMessageDialog(this, "El estado es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.cbxEstado.requestFocus();
            return;
        }

        int operacion = new LMarca().Actualizar(new Marca(
            marca.getIdMarca(),
            this.txtNombre.getText().trim(),
            this.ObtenerEstado()
        ));

        if (operacion > 0) {
            JOptionPane.showMessageDialog(this, "Se completó la actualización correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar la actualización de la marca,"
                + " intente nuevamente, verifique que exista la marca ingresada.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        this.Buscar();
    }//GEN-LAST:event_btnBuscar1ActionPerformed
private void Buscar() {
        if (this.txtNombreBuscar.getText().trim().toUpperCase().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtNombreBuscar.requestFocus();
            return;
        }

        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        this.marca = new LMarca().Consultar(this.txtNombreBuscar.getText().trim().toUpperCase());
        if (this.marca != null && this.marca.getIdMarca()> 0) {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            
            this.txtNombre.setText(this.marca.getNombre());
            this.txtNombre.setEditable(true);
            this.btnGuardar.setEnabled(true);
        } else {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No se encontró la marca con ese nombre.", "Aviso", JOptionPane.ERROR_MESSAGE);
            this.txtNombreBuscar.requestFocus();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbProfesion1;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion14;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion9;
    private javax.swing.JLabel lbTituloFormulario2;
    private javax.swing.JLabel lbTituloFormulario3;
    private javax.swing.JPanel panelFormulario1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBuscar;
    // End of variables declaration//GEN-END:variables
}
