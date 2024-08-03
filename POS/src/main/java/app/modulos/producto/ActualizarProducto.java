/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.producto;

import app.pos.entities.Marca;
import app.pos.entities.Producto;
import app.pos.logica.LCliente;
import app.pos.logica.LMarca;
import app.pos.logica.LProducto;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Josh
 */
public class ActualizarProducto extends javax.swing.JInternalFrame {

    private ArrayList<Marca> marcas;
    private Marca marca;
    private Producto producto;

    public ActualizarProducto() {
        initComponents();
        CargarMarca();
        CargarEstado();
    }

    private void CargarEstado() {
        this.cbxEstado.addItem("Activo");
        this.cbxEstado.addItem("Inactivo");

    }

    private void CargarMarca() {
        this.marcas = new LMarca().Listar();
        if (this.marcas != null && !this.marcas.isEmpty()) {
            for (Marca marca : this.marcas) {
                this.cbxMarca.addItem(marca.getNombre());
            }
            AutoCompleteDecorator.decorate(cbxMarca);
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        lbTituloFormulario = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lbProfesion = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion6 = new javax.swing.JLabel();
        lbTituloFormulario1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        cbxEstado = new javax.swing.JComboBox<>();
        lbTipoIdentificacion = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox();
        lbIdentificacion = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lbRequeridoTipoIdentificacion3 = new javax.swing.JLabel();
        lbApellidos = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbRequeridoTipoIdentificacion1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lbCorreo = new javax.swing.JLabel();
        lbRequeridoTipoIdentificacion5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtCodigoBuscar = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        lbTituloFormulario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTituloFormulario.setText("Ingrese todos los campos requeridos");

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
        lbTituloFormulario1.setText("Buscar producto:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-search-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el estado del producto" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        lbTipoIdentificacion.setText("Marca:");

        lbRequeridoTipoIdentificacion.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion.setText("*");

        cbxMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una marca" }));
        cbxMarca.setToolTipText("");
        cbxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarcaActionPerformed(evt);
            }
        });

        lbIdentificacion.setText("Codigo");

        lbRequeridoTipoIdentificacion8.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion8.setText("*");

        txtCodigo.setEditable(false);

        txtDescripcion.setEditable(false);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        lbRequeridoTipoIdentificacion3.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion3.setText("*");

        lbApellidos.setText("Descripción");

        txtNombre.setEditable(false);

        lbRequeridoTipoIdentificacion1.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion1.setText("*");

        jLabel3.setText("Nombre:");

        lbTelefono.setText("Precio");

        lbRequeridoTipoIdentificacion4.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion4.setText("*");

        txtPrecio.setEditable(false);

        lbCorreo.setText("Cantidad:");

        lbRequeridoTipoIdentificacion5.setForeground(new java.awt.Color(255, 0, 0));
        lbRequeridoTipoIdentificacion5.setText("*");

        txtCantidad.setEditable(false);

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lbProfesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRequeridoTipoIdentificacion6)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFormularioLayout.createSequentialGroup()
                            .addComponent(lbTituloFormulario1)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelFormularioLayout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(lbTituloFormulario)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(12, 12, 12))))
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(btnBuscar))
            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFormularioLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addComponent(lbTipoIdentificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRequeridoTipoIdentificacion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRequeridoTipoIdentificacion1)))
                        .addGroup(panelFormularioLayout.createSequentialGroup()
                            .addComponent(lbTelefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbRequeridoTipoIdentificacion4)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre)
                        .addComponent(txtPrecio))
                    .addGap(37, 37, 37)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFormularioLayout.createSequentialGroup()
                            .addComponent(lbIdentificacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbRequeridoTipoIdentificacion8))
                        .addGroup(panelFormularioLayout.createSequentialGroup()
                            .addComponent(lbApellidos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbRequeridoTipoIdentificacion3))
                        .addGroup(panelFormularioLayout.createSequentialGroup()
                            .addComponent(lbCorreo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbRequeridoTipoIdentificacion5)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addComponent(txtDescripcion)
                        .addComponent(txtCantidad))
                    .addContainerGap(77, Short.MAX_VALUE)))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloFormulario1)
                    .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloFormulario)
                .addGap(138, 138, 138)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProfesion)
                    .addComponent(lbRequeridoTipoIdentificacion6)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addGap(34, 34, 34))
            .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelFormularioLayout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTipoIdentificacion)
                        .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbIdentificacion)
                        .addComponent(lbRequeridoTipoIdentificacion)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbRequeridoTipoIdentificacion8))
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
                    .addContainerGap(128, Short.MAX_VALUE)))
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void LimpiarFormulario() {
        this.cbxEstado.setSelectedIndex(0);
        this.cbxEstado.setEditable(false);
        this.cbxMarca.setSelectedIndex(0);
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtDescripcion.setText("");
        this.txtCantidad.setText("");
        this.txtPrecio.setText("");
        this.txtCodigoBuscar.requestFocus();
        this.producto = null;
    }
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

        if (this.cbxEstado.getSelectedItem() == null || this.cbxEstado.getSelectedItem().toString().equals("Seleccione el estado del producto")) {
            JOptionPane.showMessageDialog(this, "El estado es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.cbxEstado.requestFocus();
            return;
        }

        double cantidad = Double.parseDouble(this.txtCantidad.getText().trim().replace(',', '.'));
        double precio = Double.parseDouble(this.txtPrecio.getText().trim().replace(',', '.'));

        int operacion = new LProducto().Actualizar(new Producto(
                producto.getIdProducto(),
                this.marca,
                this.txtCodigo.getText().trim().toUpperCase(),
                this.txtNombre.getText().trim(),
                cantidad,
                precio,
                this.txtDescripcion.getText().trim(),
                this.ObtenerEstado()
        ));

        if (operacion > 0) {
            JOptionPane.showMessageDialog(this, "Se completó la actualización correctamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.LimpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo completar la actualización del producto,"
                    + " intente nuevamente, verifique que exista el producto ingresado.", "Aviso", JOptionPane.ERROR_MESSAGE);
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


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void Buscar() {
        if (this.txtCodigoBuscar.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El codigo es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtCodigoBuscar.requestFocus();
            return;
        }

        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        this.producto = new LProducto().Consultar(this.txtCodigoBuscar.getText().trim().toUpperCase());
        if (this.producto != null && this.producto.getIdProducto() > 0) {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            this.cbxMarca.setSelectedItem(this.producto.getMarca().getNombre());
            this.cbxMarca.setEditable(true);
            this.txtCodigo.setText(this.producto.getCodigo());
            this.txtCodigo.setEditable(false);
            this.txtNombre.setText(this.producto.getNombre());
            this.txtNombre.setEditable(true);
            this.txtDescripcion.setText(this.producto.getDescripcion());
            this.txtDescripcion.setEditable(true);
            //Pasamos a string
            double precio = this.producto.getPrecio();
            this.txtPrecio.setText(Double.toString(precio));
            this.txtPrecio.setEditable(true);
            //Pasamos a string
            double cantidad = this.producto.getCantidad();
            this.txtCantidad.setText(Double.toString(cantidad));
            this.txtCantidad.setEditable(true);

            this.txtCantidad.setEditable(true);
            this.txtCodigoBuscar.setText("");
            this.btnGuardar.setEnabled(true);
        } else {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No se encontró el cliente con ese codigo.", "Aviso", JOptionPane.ERROR_MESSAGE);
            this.txtCodigoBuscar.requestFocus();
        }
    }

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void cbxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarcaActionPerformed
        this.marca = this.marcas.stream().filter(x -> x.getNombre().equals(this.cbxMarca.getSelectedItem().toString())).findFirst().orElse(null);
    }//GEN-LAST:event_cbxMarcaActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox cbxMarca;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbApellidos;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbIdentificacion;
    private javax.swing.JLabel lbProfesion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion1;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion3;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion4;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion5;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion6;
    private javax.swing.JLabel lbRequeridoTipoIdentificacion8;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipoIdentificacion;
    private javax.swing.JLabel lbTituloFormulario;
    private javax.swing.JLabel lbTituloFormulario1;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
