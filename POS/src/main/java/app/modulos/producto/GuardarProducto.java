/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.producto;

import app.pos.entities.Marca;
import app.pos.entities.Producto;
import app.pos.logica.LMarca;
import app.pos.logica.LProducto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Josh
 */
public class GuardarProducto extends javax.swing.JInternalFrame {

    private ArrayList<Marca> marcas;
    private Marca marca;

    public GuardarProducto() {
        initComponents();
        CargarMarca();
        CargarSugerencias();
    }

    private void CargarMarca() {
        this.marcas = new LMarca().Listar();
        if (this.marcas != null && !this.marcas.isEmpty()) {
            for (Marca marca : this.marcas) {
                this.cbxMarca.addItem(marca.getNombre());
            }

        }
    }

    private void CargarSugerencias() {
        AutoCompleteDecorator.decorate(cbxMarca);
    }

    private void LimpiarFormulario() {
        this.cbxMarca.setSelectedIndex(0);
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtDescripcion.setText("");
        this.txtCantidad.setText("");
        this.txtDescripcion.setText("");
        this.txtPrecio.setText("");

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        lbTipoIdentificacion = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox();
        lbIdentificacion = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion = new javax.swing.JLabel();
        lbTituloFormulario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion1 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lbApellidos = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion4 = new javax.swing.JLabel();
        lbCorreo = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lbRequeridoTipoIdentificacion6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        lbTipoIdentificacion.setText("Marca:");

        cbxMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una marca" }));
        cbxMarca.setToolTipText("");
        cbxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarcaActionPerformed(evt);
            }
        });

        lbIdentificacion.setText("Codigo");

        lbRequeridoTipoIdentificacion.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion.setText("*");

        lbTituloFormulario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario.setText("Ingrese todos los campos requeridos");

        jLabel3.setText("Nombre:");

        lbRequeridoTipoIdentificacion1.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion1.setText("*");

        lbApellidos.setText("Descripción");

        lbRequeridoTipoIdentificacion3.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion3.setText("*");

        lbTelefono.setText("Precio");

        lbRequeridoTipoIdentificacion4.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion4.setText("*");

        lbCorreo.setText("Cantidad:");

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

        lbRequeridoTipoIdentificacion6.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion6.setText("*");

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelFormularioLayout.createSequentialGroup()
                                    .addComponent(lbTipoIdentificacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbRequeridoTipoIdentificacion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbRequeridoTipoIdentificacion1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(lbTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRequeridoTipoIdentificacion4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre)
                            .addComponent(txtPrecio))
                        .addGap(37, 37, 37)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(lbIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRequeridoTipoIdentificacion6))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(lbApellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRequeridoTipoIdentificacion3))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(lbCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRequeridoTipoIdentificacion5))))
                    .addComponent(lbTituloFormulario)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtDescripcion)
                    .addComponent(txtCantidad))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTituloFormulario)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoIdentificacion)
                    .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdentificacion)
                    .addComponent(lbRequeridoTipoIdentificacion)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRequeridoTipoIdentificacion6))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbRequeridoTipoIdentificacion1)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbApellidos)
                    .addComponent(lbRequeridoTipoIdentificacion3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefono)
                    .addComponent(lbRequeridoTipoIdentificacion4)
                    .addComponent(lbCorreo)
                    .addComponent(lbRequeridoTipoIdentificacion5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarcaActionPerformed
        this.marca = this.marcas.stream().filter(x -> x.getNombre().equals(this.cbxMarca.getSelectedItem().toString())).findFirst().orElse(null);
    }//GEN-LAST:event_cbxMarcaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (this.cbxMarca.getSelectedItem() == null || this.cbxMarca.getSelectedItem().toString().equals("Seleccione un tipo de identificación")) {
            JOptionPane.showMessageDialog(this, "La marca es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.cbxMarca.requestFocus();
            return;
        }

        if (this.txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "La descripción es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtDescripcion.requestFocus();
            return;
        }

        if (this.txtDescripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtDescripcion.requestFocus();
            return;
        }

        if (this.txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El codigo es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtCodigo.requestFocus();
            return;
        }

        if (this.txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El precio es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtPrecio.requestFocus();
            return;
        }

        if (this.txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "La cantidad es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtPrecio.requestFocus();
            return;
        }

        double cantidad = Double.parseDouble(this.txtCantidad.getText().trim().replace(',', '.'));
        double precio = Double.parseDouble(this.txtPrecio.getText().trim().replace(',', '.'));

        int operacion = new LProducto().Guardar(new Producto(
                0,
                this.marca,
                this.txtCodigo.getText().trim().toUpperCase(),
                this.txtNombre.getText().trim(),
                cantidad,
                precio,
                this.txtDescripcion.getText().trim(),
                1
        ));

        if (operacion > 0) {
            JOptionPane.showMessageDialog(this, "Se completó el registro correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar el registro del producto,"
                    + " intente nuevamente, verifique que no exista el producto ingresado.", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox cbxMarca;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbIdentificacion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion1;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion3;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion4;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion5;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion6;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipoIdentificacion;
    private javax.swing.JLabel lbTituloFormulario;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
