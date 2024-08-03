/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.usuario;

import app.pos.entities.TipoIdentificacion;
import app.pos.entities.TipoUsuario;
import app.pos.entities.Usuario;
import app.pos.logica.LCliente;
import app.pos.logica.LTipoIdentificacion;
import app.pos.logica.LTipoUsuario;
import app.pos.logica.LUsuario;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josh
 */
public class ActualizarUsuario extends javax.swing.JInternalFrame {

    private ArrayList<TipoIdentificacion> tiposIdentificacion;
    private TipoIdentificacion tipo;
    private ArrayList<TipoUsuario> tiposUsuario;
    private TipoUsuario tipoU;
    private Usuario usuario;
    private int TipoUsuarioid;
    
    public ActualizarUsuario() {
        initComponents();
        CargarTipoIdentificacion();
        CargarTipoUsuario();   
        CargarEstado();
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
     
      private void CargarEstado() {
        this.cbxEstado.addItem("Activo");
        this.cbxEstado.addItem("Inactivo");

    }
      
      
      
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        lbTipoIdentificacion = new javax.swing.JLabel();
        cbxTipoIdentificacion = new javax.swing.JComboBox();
        lbIdentificacion = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion = new javax.swing.JLabel();
        lbTituloFormulario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion1 = new javax.swing.JLabel();
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
        lbProfesion = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion6 = new javax.swing.JLabel();
        lbTituloFormulario1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        cbxEstado = new javax.swing.JComboBox<>();
        txtIdentificacionBuscar = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion7 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion8 = new javax.swing.JLabel();
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion9 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion10 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

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

        lbTituloFormulario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario.setText("Ingrese todos los campos requeridos");

        jLabel3.setText("Nombre:");

        lbRequeridoTipoIdentificacion1.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion1.setText("*");

        txtNombre.setEditable(false);

        lbApellidos.setText("Apellidos:");

        lbRequeridoTipoIdentificacion3.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion3.setText("*");

        txtApellidos.setEditable(false);

        lbTelefono.setText("Teléfono:");

        lbRequeridoTipoIdentificacion4.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion4.setText("*");

        txtTelefono.setEditable(false);
        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbCorreo.setText("Correo:");

        lbRequeridoTipoIdentificacion5.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion5.setText("*");

        txtCorreo.setEditable(false);

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

        lbProfesion.setText("Estado:");

        lbRequeridoTipoIdentificacion6.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion6.setText("*");

        lbTituloFormulario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario1.setText("Buscar usuario:");

        txtIdentificacion.setEditable(false);
        try {
            txtIdentificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-search-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el estado del usuario" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        try {
            txtIdentificacionBuscar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdentificacionBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de usuario:");

        lbRequeridoTipoIdentificacion7.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion7.setText("*");

        lbRequeridoTipoIdentificacion8.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion8.setText("*");

        cbxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de usuario" }));
        cbxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuario:");

        jLabel4.setText("Contraseña:");

        lbRequeridoTipoIdentificacion9.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion9.setText("*");

        lbRequeridoTipoIdentificacion10.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion10.setText("*");

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
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
                                        .addComponent(lbProfesion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbRequeridoTipoIdentificacion6))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbRequeridoTipoIdentificacion9)))
                                .addGap(70, 70, 70)))
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioLayout.createSequentialGroup()
                                    .addComponent(lbTituloFormulario1)
                                    .addGap(23, 23, 23)
                                    .addComponent(txtIdentificacionBuscar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioLayout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(lbTituloFormulario)))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardar)
                                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxTipoIdentificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                                .addComponent(lbIdentificacion)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbRequeridoTipoIdentificacion7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(panelFormularioLayout.createSequentialGroup()
                                                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelFormularioLayout.createSequentialGroup()
                                                            .addComponent(lbCorreo)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbRequeridoTipoIdentificacion5))
                                                        .addGroup(panelFormularioLayout.createSequentialGroup()
                                                            .addComponent(lbApellidos)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbRequeridoTipoIdentificacion3)))
                                                    .addGap(41, 41, 41)
                                                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                                        .addComponent(txtCorreo)))
                                                .addGroup(panelFormularioLayout.createSequentialGroup()
                                                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                                                            .addComponent(jLabel1)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbRequeridoTipoIdentificacion8)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                                                            .addComponent(jLabel4)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbRequeridoTipoIdentificacion10)
                                                            .addGap(33, 33, 33)))
                                                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cbxTipoUsuario, 0, 217, Short.MAX_VALUE)
                                                        .addComponent(txtContrasena))))))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar))))))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(btnBuscar)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloFormulario1)
                    .addComponent(txtIdentificacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloFormulario)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoIdentificacion)
                    .addComponent(cbxTipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdentificacion)
                    .addComponent(lbRequeridoTipoIdentificacion)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRequeridoTipoIdentificacion7))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbRequeridoTipoIdentificacion1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRequeridoTipoIdentificacion3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbApellidos))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono)
                    .addComponent(lbRequeridoTipoIdentificacion4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCorreo)
                    .addComponent(lbRequeridoTipoIdentificacion5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfesion)
                    .addComponent(lbRequeridoTipoIdentificacion6)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lbRequeridoTipoIdentificacion8)
                    .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lbRequeridoTipoIdentificacion9)
                    .addComponent(lbRequeridoTipoIdentificacion10)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoIdentificacionActionPerformed
        this.tipo = this.tiposIdentificacion.stream().filter(x -> x.getNombre().equals(this.cbxTipoIdentificacion.getSelectedItem().toString())).findFirst().orElse(null);
    }//GEN-LAST:event_cbxTipoIdentificacionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void Buscar() {
        if (this.txtIdentificacionBuscar.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "La identificación es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtIdentificacionBuscar.requestFocus();
            return;
        }
        
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        this.usuario = new LUsuario().Consultar(this.txtIdentificacionBuscar.getText().trim());
        if (this.usuario != null && this.usuario.getIdUsuario()> 0) {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            
            this.cbxTipoIdentificacion.setSelectedItem(this.usuario.getTipoIdentificacion().getNombre());
            this.cbxTipoIdentificacion.setEditable(true);
            TipoUsuarioid = this.usuario.getTipoUsuario().getIdTipoUsuario();
            this.cbxTipoUsuario.setEditable(true);
            this.txtIdentificacion.setText(this.usuario.getIdentificacion());
            this.txtIdentificacion.setEditable(false);
            this.txtNombre.setText(this.usuario.getNombre());
            this.txtNombre.setEditable(true);
            this.txtApellidos.setText(this.usuario.getApellidos());
            this.txtApellidos.setEditable(true);
            this.txtCorreo.setText(this.usuario.getCorreo());
            this.txtCorreo.setEditable(true);
            this.txtTelefono.setText(this.usuario.getTelefono());
            this.txtTelefono.setEditable(true);
            this.txtUsuario.setText(this.usuario.getUseraccess());
            this.txtUsuario.setEditable(true);
            this.txtContrasena.setText(this.usuario.getPasswordd());
            this.txtContrasena.setEditable(true);
            this.txtIdentificacionBuscar.setText("");
            this.btnGuardar.setEnabled(true);
        } else {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No se encontró el usuario con esa identificación.", "Aviso", JOptionPane.ERROR_MESSAGE);
            this.txtIdentificacionBuscar.requestFocus();
        }
    }
        private void LimpiarFormulario() {
        this.cbxTipoIdentificacion.setSelectedIndex(0);
        this.cbxTipoIdentificacion.setEditable(false);
        this.cbxTipoUsuario.setSelectedIndex(0);
        this.cbxTipoUsuario.setEditable(false);
        this.txtIdentificacion.setText("");
        this.txtIdentificacion.setEditable(false);
        this.txtNombre.setText("");
        this.txtNombre.setEditable(false);
        this.txtApellidos.setText("");
        this.txtApellidos.setEditable(false);
        this.txtCorreo.setText("");
        this.txtCorreo.setEditable(false);
        this.txtTelefono.setText("");
        this.txtTelefono.setEditable(false);
        this.txtUsuario.setText("");
        this.txtUsuario.setEditable(false);
        this.txtContrasena.setText("");
        this.txtContrasena.setEditable(false);
        this.txtIdentificacionBuscar.requestFocus();
        this.usuario = null;
    }
        
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

        if (this.cbxEstado.getSelectedItem() == null || this.cbxTipoIdentificacion.getSelectedItem().toString().equals("Seleccione el estado del cliente")) {
            JOptionPane.showMessageDialog(this, "El estado es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.cbxEstado.requestFocus();
            return;
        }

        if (this.cbxTipoUsuario.getSelectedItem() == null || this.cbxTipoUsuario.getSelectedItem().toString().equals("Seleccione un tipo de usuario")) {
            JOptionPane.showMessageDialog(this, "El tipo de usuario es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.cbxTipoUsuario.requestFocus();
            return;
        }
        
        int operacion = new LUsuario().Actualizar(new Usuario(
            usuario.getIdUsuario(),
            usuario.getIdPersona(),
            this.tipoU,
            this.txtUsuario.getText().trim(),
            this.txtContrasena.getText().trim(),
            this.ObtenerEstado(),
            this.txtIdentificacion.getText().trim(),
            this.txtNombre.getText().trim(),
            this.txtApellidos.getText().trim(),
            this.txtCorreo.getText().trim(),
            this.txtTelefono.getText().trim(),
            this.tipo
        ));

        if (operacion > 0) {
            JOptionPane.showMessageDialog(this, "Se completó la actualización correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar la actualización del usuario,"
                + " intente nuevamente, verifique que exista el usuario ingresado.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

     private int ObtenerEstado() {
        String estado = (String) this.cbxEstado.getSelectedItem();
        if (estado.equals("Activo")) {
            return 1;
        } else {
            return 0;
        }
    }
     
     
    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdentificacionBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionBuscarActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void cbxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoUsuarioActionPerformed
        this.tipoU = this.tiposUsuario.stream().filter(x -> x.getNombre().equals(this.cbxTipoUsuario.getSelectedItem().toString())).findFirst().orElse(null);
    }//GEN-LAST:event_cbxTipoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox cbxTipoIdentificacion;
    private javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbIdentificacion;
    private javax.swing.JLabel lbProfesion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion1;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion10;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion3;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion4;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion5;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion6;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion7;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion8;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion9;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipoIdentificacion;
    private javax.swing.JLabel lbTituloFormulario;
    private javax.swing.JLabel lbTituloFormulario1;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtIdentificacion;
    private javax.swing.JFormattedTextField txtIdentificacionBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
