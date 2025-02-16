/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.factura;

import app.pos.entities.Cliente;
import app.pos.entities.Factura;
import app.pos.entities.LineaFactura;
import app.pos.entities.Local;
import app.pos.entities.Marca;
import app.pos.entities.Producto;
import app.pos.entities.Usuario;
import app.pos.logica.LCliente;
import app.pos.logica.LFactura;
import app.pos.logica.LLineaFactura;
import app.pos.logica.LLocal;
import app.pos.logica.LProducto;
import app.pos.logica.LUsuario;
import java.awt.Cursor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josh
 */
public class GuardarFactura extends javax.swing.JInternalFrame {

    private Usuario usuario;
    private Cliente cliente;
    private Producto producto;
    private ArrayList<Local> locales;
    private int idLocal;
    private int idFactura;
    private String comentario;
    private int idCliente;
    ArrayList<LineaFactura> lineasFactura = new ArrayList<>();

    public GuardarFactura() {
        initComponents();
        this.setFechaActual();
        this.CargarCliente();
        this.CargarVendedor();
        this.CargarTabla();
        this.CargarLocal();
    }

    private void setFechaActual() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        String fechaFormateada = dateFormat.format(new Date());
        txtFecha.setText(fechaFormateada);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacionCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtNombreVendedor = new javax.swing.JTextField();
        btnAgregarLinea = new javax.swing.JButton();
        jPanelTotales = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbTotalFactura = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxLocal = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLineas = new javax.swing.JTable();
        jPanelOpciones = new javax.swing.JPanel();
        btnCobrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnComentario = new javax.swing.JButton();
        btnEliminarLinea = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Cliente");

        jLabel2.setText("Identificación");

        txtIdentificacionCliente.setText("1");
        txtIdentificacionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdentificacionClienteKeyPressed(evt);
            }
        });

        jLabel3.setText("Codigo");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        jLabel4.setText("Cantidad");

        txtCantidad.setText("1");
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadMouseClicked(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });

        jLabel5.setText("Vendedor");

        txtVendedor.setText("1");
        txtVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendedorActionPerformed(evt);
            }
        });
        txtVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVendedorKeyPressed(evt);
            }
        });

        jLabel6.setText("Fecha");

        txtFecha.setEditable(false);
        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yy"))));

        jLabel8.setText("Nombre");

        txtNombreCliente.setEditable(false);

        txtNombreVendedor.setEditable(false);
        txtNombreVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreVendedorActionPerformed(evt);
            }
        });

        btnAgregarLinea.setText("Añadir Articulo");
        btnAgregarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(txtIdentificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel8)
                                .addGap(17, 17, 17)
                                .addComponent(txtNombreCliente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                        .addComponent(btnAgregarLinea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdentificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarLinea))
                .addGap(12, 12, 12))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Total");

        lbTotalFactura.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbTotalFactura.setForeground(new java.awt.Color(51, 255, 51));
        lbTotalFactura.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel9.setText("₡");

        jLabel10.setText("Local");

        cbxLocal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un local" }));
        cbxLocal.setToolTipText("");
        cbxLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTotalesLayout = new javax.swing.GroupLayout(jPanelTotales);
        jPanelTotales.setLayout(jPanelTotalesLayout);
        jPanelTotalesLayout.setHorizontalGroup(
            jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanelTotalesLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTotalesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTotalesLayout.setVerticalGroup(
            jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTotalFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbLineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbLineas);

        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnComentario.setText("Comentario");
        btnComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentarioActionPerformed(evt);
            }
        });

        btnEliminarLinea.setText("Eliminar linea");
        btnEliminarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCobrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarLinea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnComentario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminarLinea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanelTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVendedorActionPerformed

    private void txtIdentificacionClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionClienteKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.CargarCliente();
        }
    }//GEN-LAST:event_txtIdentificacionClienteKeyPressed

    private void txtNombreVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreVendedorActionPerformed

    private void txtVendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendedorKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.CargarVendedor();
        }
    }//GEN-LAST:event_txtVendedorKeyPressed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.AgregarLinea();
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            this.AgregarLinea();
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void btnAgregarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLineaActionPerformed

        this.AgregarLinea();

    }//GEN-LAST:event_btnAgregarLineaActionPerformed

    private void cbxLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLocalActionPerformed
        idLocal = (Integer) this.cbxLocal.getSelectedItem();

    }//GEN-LAST:event_cbxLocalActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        double vuelto = 0.0;
        double dineroCliente = 0.0;
        double totalFactura = Double.parseDouble(lbTotalFactura.getText());
        String dineroClienteStr = "";
        dineroClienteStr = JOptionPane.showInputDialog(this, "Ingrese el monto dado por el cliente: ", JOptionPane.QUESTION_MESSAGE);

        try {
            dineroCliente = Double.parseDouble(dineroClienteStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El monto ingresado no es válido. Por favor, ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
            dineroClienteStr = JOptionPane.showInputDialog(this, "Ingrese el monto dado por el cliente: ", JOptionPane.QUESTION_MESSAGE);
            return;
        }

        while (dineroCliente < totalFactura) {
            double saldoPendiente = totalFactura - dineroCliente;
            JOptionPane.showMessageDialog(this, "El monto dado es insuficiente. Saldo pendiente: " + saldoPendiente, "Información", JOptionPane.INFORMATION_MESSAGE);

            // Solicitar el monto restante
            dineroClienteStr = JOptionPane.showInputDialog(this, "Ingrese el monto adicional dado por el cliente: ", JOptionPane.QUESTION_MESSAGE);

            try {
                double montoAdicional = Double.parseDouble(dineroClienteStr);
                dineroCliente += montoAdicional;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El monto ingresado no es válido. Por favor, ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        vuelto = totalFactura - dineroCliente;
        JOptionPane.showMessageDialog(this, "Monto dado por el cliente: " + dineroCliente + "\nTotal de la factura: " + totalFactura + "\nVuelto: " + vuelto, "Cobro completado", JOptionPane.INFORMATION_MESSAGE);

        try {
            this.guardarFactura();
            JOptionPane.showMessageDialog(this, "Se guardo correctamente la factura # " + idFactura);
        } catch (ParseException ex) {
            Logger.getLogger(GuardarFactura.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            this.guardarLineasFactura();
        } catch (ParseException ex) {
            Logger.getLogger(GuardarFactura.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.LimFacturaNueva();


    }//GEN-LAST:event_btnCobrarActionPerformed

    private void guardarFactura() throws ParseException {
        double totalFactura = Double.parseDouble(lbTotalFactura.getText());

        SimpleDateFormat fullDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date fechaActual = new Date();
        String fechaFormateada = fullDateFormat.format(fechaActual);
        // Si necesitas convertir la fecha formateada a un objeto java.sql.Date:
        java.sql.Date sqlDate = new java.sql.Date(fullDateFormat.parse(fechaFormateada).getTime());

        int operacion = new LFactura().Guardar(new Factura(
                0,
                Integer.parseInt(this.txtVendedor.getText().trim()),
                idCliente,
                idLocal,
                comentario,
                sqlDate,
                totalFactura,
                1
        ));

        if (operacion == -1) {
            JOptionPane.showMessageDialog(this, "No se pudo generar la factura,", "Aviso", JOptionPane.ERROR_MESSAGE);

        } else {
            idFactura = operacion;
        }
    }

    private void guardarLineasFactura() throws ParseException {

        for (LineaFactura linea : lineasFactura) {
            linea.setIdFactura(idFactura);
        }

        for (LineaFactura linea : lineasFactura) {
            try {
                int operacion = new LLineaFactura().Guardar(linea);

                if (operacion == -1) {
                    JOptionPane.showMessageDialog(this, "No se pudo generar la factura,", "Aviso", JOptionPane.ERROR_MESSAGE);

                }

                if (operacion > 0) {
                    System.out.println("Se completó el registro correctamente para la línea con ID Producto: " + linea.getIdProducto());
                } else {
                    System.out.println("No se pudo completar el registro de la línea con ID Producto: " + linea.getIdProducto());
                    System.out.println("Detalles del producto problemático: ");
                    System.out.println("ID Factura: " + linea.getIdFactura());
                    System.out.println("ID Producto: " + linea.getIdProducto());
                    System.out.println("Código: " + linea.getCodigo());
                    System.out.println("Cantidad: " + linea.getCantidad());
                    System.out.println("Precio: " + linea.getPrecio());
                    System.out.println("Total: " + linea.getTotal());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar la línea con ID Producto: " + linea.getIdProducto() + ". Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void txtCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseClicked
        txtCantidad.selectAll();
    }//GEN-LAST:event_txtCantidadMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.LimFacturaNueva();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentarioActionPerformed
        comentario = JOptionPane.showInputDialog(this, "Ingrese el comentario de la factura ", JOptionPane.QUESTION_MESSAGE);

    }//GEN-LAST:event_btnComentarioActionPerformed

    private void btnEliminarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLineaActionPerformed

        int selectedRow = tbLineas.getSelectedRow();
        if (selectedRow != -1) {
            lineasFactura.remove(selectedRow);

            this.CargarTabla();
            this.sumarTotalLineas();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar.");
        }

    }//GEN-LAST:event_btnEliminarLineaActionPerformed

    private void CargarLocal() {
        this.locales = new LLocal().Listar();
        if (this.locales != null && !this.locales.isEmpty()) {
            for (Local local : this.locales) {
                this.cbxLocal.addItem(local.getIdLocal());
            }

        }
    }

    private void CargarCliente() {
        if (this.txtIdentificacionCliente.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "La identificación es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtIdentificacionCliente.requestFocus();
            return;
        }

        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        this.cliente = new LCliente().Consultar(this.txtIdentificacionCliente.getText().trim());
        if (this.cliente != null && this.cliente.getIdCliente() > 0) {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            this.txtNombreCliente.setText(this.cliente.getNombre() + " " + this.cliente.getApellidos());
            this.txtNombreCliente.setEditable(false);
            idCliente = this.cliente.getIdCliente();

        } else {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No se encontró el cliente con esa identificación.", "Aviso", JOptionPane.ERROR_MESSAGE);
            this.txtIdentificacionCliente.requestFocus();
        }
    }

    private void CargarVendedor() {
        if (this.txtVendedor.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El id es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtVendedor.requestFocus();
            return;
        }

        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        this.usuario = new LUsuario().Consultar(Integer.parseInt(this.txtVendedor.getText().trim()));
        if (this.usuario != null && this.usuario.getIdUsuario() > 0) {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            this.txtNombreVendedor.setText(this.usuario.getNombre() + " " + this.usuario.getApellidos());
            this.txtNombreVendedor.setEditable(false);

        } else {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No se encontró el vendedor con ese codigo.", "Aviso", JOptionPane.ERROR_MESSAGE);
            this.txtVendedor.requestFocus();
        }
    }

    private void AgregarLinea() {

        if (this.txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El código es requerido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtCodigo.requestFocus();
            return;
        }

        if (this.txtCantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "La cantidad es requerida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            this.txtCantidad.requestFocus();
            return;
        }

        this.producto = new LProducto().Consultar(this.txtCodigo.getText().trim().toUpperCase());
        
        if (this.producto != null && this.producto.getIdProducto() > 0) {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } else {
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            JOptionPane.showMessageDialog(this, "No se encontró el producto con ese código.", "Aviso", JOptionPane.ERROR_MESSAGE);
            this.txtCodigo.requestFocus();
            return;
        }

        double cantidad = Double.parseDouble(this.txtCantidad.getText().trim().replace(',', '.'));
        double precio = this.producto.getPrecio();

        boolean productoExistente = false;
        for (LineaFactura linea : lineasFactura) {
            if (linea.getCodigo().equalsIgnoreCase(this.txtCodigo.getText().trim().toUpperCase())) {
                linea.setCantidad(linea.getCantidad() + cantidad);
                linea.setTotal(linea.getCantidad() * precio);
                productoExistente = true;
                break;
            }
        }

        if (!productoExistente) {
            LineaFactura nuevaLinea = new LineaFactura(
                    this.producto.getIdProducto(),
                    0,
                    this.txtCodigo.getText().trim().toUpperCase(),
                    cantidad,
                    precio,
                    precio * cantidad
            );
            lineasFactura.add(nuevaLinea);
        }

        this.CargarTabla();
        this.limpiar();
        this.sumarTotalLineas();
        txtCantidad.setText("1");
        this.txtCodigo.requestFocus();
    }

    private void CargarTabla() {

        String[] columnas = new String[]{
            "CODIGO",
            "DESCRIPCION",
            "CANTIDAD",
            "PRECIO",
            "TOTAL"
        };

        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);

        for (LineaFactura linea : lineasFactura) {
            obModelo.addRow(new Object[]{
                linea.getCodigo(),
                linea.getDescripcion(),
                linea.getCantidad(),
                linea.getPrecio(),
                linea.getTotal()
            });
        }

        this.tbLineas.setModel(obModelo);
    }

    private void sumarTotalLineas() {
        double sumaTotal = 0.0;

        // Recorremos cada objeto LineaFactura en el ArrayList
        for (LineaFactura linea : lineasFactura) {
            // Sumamos el valor del campo 'total' de cada LineaFactura al total general
            sumaTotal += linea.getTotal();
        }

        lbTotalFactura.setText(String.valueOf(sumaTotal)); // Actualizamos el JLabel con la suma
    }

    private void limpiar() {

        txtCodigo.setText("");

    }

    private void LimFacturaNueva() {
        txtCodigo.setText("");
        txtVendedor.setText("1");
        txtIdentificacionCliente.setText("1");
        lineasFactura.clear();
        lbTotalFactura.setText("0");
        this.CargarCliente();
        this.CargarVendedor();
        this.CargarTabla();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarLinea;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnComentario;
    private javax.swing.JButton btnEliminarLinea;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox cbxLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelTotales;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotalFactura;
    private javax.swing.JTable tbLineas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtIdentificacionCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreVendedor;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
