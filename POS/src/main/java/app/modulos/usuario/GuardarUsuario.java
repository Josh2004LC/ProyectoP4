/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.usuario;

import app.pos.entities.TipoIdentificacion;
import app.pos.entities.TipoUsuario;
import app.pos.entities.Usuario;
import app.pos.logica.LTipoIdentificacion;
import app.pos.logica.LTipoUsuario;
import app.pos.logica.LUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class GuardarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuardarUsuario
     */
    
    private ArrayList<TipoIdentificacion> tiposIdentificacion;
    private TipoIdentificacion tipo;
    private ArrayList<TipoUsuario> tiposUsuario;
    private TipoUsuario tipoU;
    
    public GuardarUsuario() {
        initComponents();
        CargarTipoIdentificacion();
        CargarTipoUsuario();        
    }
    
    private void CargarTipoIdentificacion() {
        this.tiposIdentificacion = new LTipoIdentificacion().Listar();
        if (this.tiposIdentificacion != null && !this.tiposIdentificacion.isEmpty()) {
            for (TipoIdentificacion tipo : this.tiposIdentificacion) {
                this.cbxTipoIdentificacion.addItem(tipo.getNombre());
            }
        }
    }
     private void CargarTipoUsuario() {
        this.tiposUsuario = new LTipoUsuario().Listar();
        if (this.tiposUsuario != null && !this.tiposUsuario.isEmpty()) {
            for (TipoUsuario tipoU : this.tiposUsuario) {
                this.cbxTipoUsuario.addItem(tipoU.getNombre());
            }
        }
    }
    
    private void LimpiarFormulario() {
        this.cbxTipoIdentificacion.setSelectedIndex(0);
        this.cbxTipoUsuario.setSelectedIndex(0);
        this.txtIdentificacion.setText("");
        this.txtNombre.setText("");
        this.txtApellidos.setText("");
        this.txtCorreo.setText("");
        this.txtTelefono.setText("");
        this.txtUsuario.setText("");
        this.txtContrasena.setText("");

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        lbTipoIdentificacion = new javax.swing.JLabel();
        cbxTipoIdentificacion = new javax.swing.JComboBox();
        lbIdentificacion = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JFormattedTextField();
        lbTituloFormulario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion1 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbApellidos = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JFormattedTextField();
        lbCorreo = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion6 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        lbApellidos1 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lbTipoIdentificacion1 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion8 = new javax.swing.JLabel();
        cbxTipoUsuario = new javax.swing.JComboBox();

        setClosable(true);

        lbTipoIdentificacion.setText("Tipo de identificación:");

        cbxTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un tipo de identificación" }));
        cbxTipoIdentificacion.setToolTipText("");
        cbxTipoIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoIdentificacionActionPerformed(evt);
            }
        });

        lbIdentificacion.setText("Identificación:");

        lbRequeridoTipoIdentificacion.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion.setText("*");

        txtIdentificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        lbTituloFormulario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario.setText("Ingrese todos los campos requeridos");

        jLabel3.setText("Nombre:");

        lbRequeridoTipoIdentificacion1.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion1.setText("*");

        lbRequeridoTipoIdentificacion2.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion2.setText("*");

        lbApellidos.setText("Apellidos:");

        lbRequeridoTipoIdentificacion3.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion3.setText("*");

        lbTelefono.setText("Teléfono:");

        lbRequeridoTipoIdentificacion4.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion4.setText("*");

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setText("");

        lbCorreo.setText("Correo:");

        lbRequeridoTipoIdentificacion5.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion5.setText("*");

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

        jLabel4.setText("Usuario:");

        lbRequeridoTipoIdentificacion6.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion6.setText("*");

        lbApellidos1.setText("Contraseña:");

        lbRequeridoTipoIdentificacion7.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion7.setText("*");

        lbTipoIdentificacion1.setText("Tipo de usuario:");

        lbRequeridoTipoIdentificacion8.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion8.setText("*");

        cbxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un tipo de usuario" }));
        cbxTipoUsuario.setToolTipText("");
        cbxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTituloFormulario)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(37, 37, 37)
                                .addComponent(btnLimpiar))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                                            .addComponent(lbTipoIdentificacion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbRequeridoTipoIdentificacion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbRequeridoTipoIdentificacion1)
                                            .addGap(76, 76, 76)))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                                .addComponent(lbTelefono)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbRequeridoTipoIdentificacion4))
                                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbRequeridoTipoIdentificacion6))
                                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                                .addComponent(lbTipoIdentificacion1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbRequeridoTipoIdentificacion8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtUsuario)
                                    .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(lbCorreo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbRequeridoTipoIdentificacion5))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(lbApellidos1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbRequeridoTipoIdentificacion7))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbIdentificacion)
                                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                                .addComponent(lbApellidos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbRequeridoTipoIdentificacion3)
                                                .addGap(12, 12, 12)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbRequeridoTipoIdentificacion2)))
                                .addGap(16, 16, 16)))
                        .addGap(1, 1, 1)))
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtContrasena)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoIdentificacion)
                    .addComponent(cbxTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdentificacion)
                    .addComponent(lbRequeridoTipoIdentificacion)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRequeridoTipoIdentificacion2))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbRequeridoTipoIdentificacion1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbApellidos)
                    .addComponent(lbRequeridoTipoIdentificacion3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono)
                    .addComponent(lbRequeridoTipoIdentificacion4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCorreo)
                    .addComponent(lbRequeridoTipoIdentificacion5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lbRequeridoTipoIdentificacion6)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbApellidos1)
                        .addComponent(lbRequeridoTipoIdentificacion7)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTipoIdentificacion1)
                        .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbRequeridoTipoIdentificacion8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoIdentificacionActionPerformed
        this.tipo = this.tiposIdentificacion.stream().filter(x -> x.getNombre().equals(this.cbxTipoIdentificacion.getSelectedItem().toString())).findFirst().orElse(null);
    }//GEN-LAST:event_cbxTipoIdentificacionActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.cbxTipoIdentificacion.getSelectedItem() == null || this.cbxTipoIdentificacion.getSelectedItem().toString().equals("Seleccione un tipo de identificación")) {
            JOptionPane.showMessageDialog(this, "El tipo de identificación es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.cbxTipoIdentificacion.requestFocus();
            return;
        }

        if (this.txtIdentificacion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "La identificación es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtIdentificacion.requestFocus();
            return;
        }
        
        if (this.txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El usuario es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtUsuario.requestFocus();
            return;
        }
        
        if (this.txtContrasena.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "La contraseña es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtContrasena.requestFocus();
            return;
        }

        if (this.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtNombre.requestFocus();
            return;
        }

        if (this.txtApellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Los apellidos son requeridos.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtApellidos.requestFocus();
            return;
        }

        if (this.txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El teléfono es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtTelefono.requestFocus();
            return;
        }

        if (this.txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El correo es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtCorreo.requestFocus();
            return;
        }
        
        if (this.cbxTipoUsuario.getSelectedItem() == null || this.cbxTipoUsuario.getSelectedItem().toString().equals("Seleccione un tipo de usuario")) {
            JOptionPane.showMessageDialog(this, "El tipo de usuario es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.cbxTipoUsuario.requestFocus();
            return;
        }

        int operacion = new LUsuario().Guardar(new Usuario(
            0,
            0,
            this.tipoU,
            this.txtUsuario.getText().trim(),
            this.txtContrasena.getText().trim(),
            1,
            this.txtIdentificacion.getText().trim(),
            this.txtNombre.getText().trim(),
            this.txtApellidos.getText().trim(),
            this.txtCorreo.getText().trim(),
            this.txtTelefono.getText().trim(),
            this.tipo
            
        ));

        if (operacion > 0) {
            JOptionPane.showMessageDialog(this, "Se completó el registro correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar el registro del usuario,"
                + " intente nuevamente, verifique que no exista el usuario ingresado.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoUsuarioActionPerformed
        this.tipoU = this.tiposUsuario.stream().filter(x -> x.getNombre().equals(this.cbxTipoUsuario.getSelectedItem().toString())).findFirst().orElse(null);
    }//GEN-LAST:event_cbxTipoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox cbxTipoIdentificacion;
    private javax.swing.JComboBox cbxTipoUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbApellidos1;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbIdentificacion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion1;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion2;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion3;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion4;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion5;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion6;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion7;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion8;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipoIdentificacion;
    private javax.swing.JLabel lbTipoIdentificacion1;
    private javax.swing.JLabel lbTituloFormulario;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
