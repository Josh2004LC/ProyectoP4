/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package app.modulos.marca;

import app.pos.entities.Marca;
import app.pos.entities.Producto;
import app.pos.logica.LMarca;
import app.pos.logica.LProducto;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josh
 */
public class ListarMarca extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListarMarca
     */
    public ListarMarca() {
        initComponents();
        this.CargarTabla();
    }

    private void CargarTabla() {
        ArrayList<Marca> marcas = new LMarca().Listar();

        String[] columnas = new String[]{
            "ID MARCA",
            "NOMBRE",
            "ESTADO",};

        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);

        for (Marca marca : marcas) {
            obModelo.addRow(new Object[]{
                marca.getIdMarca() + "",
                marca.getNombre(),
                this.ObtenerEstado(marca.getEstado())
            
            });
        }

        this.tbMarcas.setModel(obModelo);
    }

    private void CargarTabla(ArrayList<Marca> marcas) {
        String[] columnas = new String[]{
            "ID MARCA",
            "NOMBRE",
            "ESTADO",};

        DefaultTableModel obModelo = new DefaultTableModel(columnas, 0);

        for (Marca marca : marcas) {
            obModelo.addRow(new Object[]{
                marca.getIdMarca() + "",
                marca.getNombre(),
                this.ObtenerEstado(marca.getEstado())

            });
        }

        this.tbMarcas.setModel(obModelo);
    }

    private String ObtenerEstado(int estado) {
        if (estado == 1) {
            return "Activo";
        } else {
            return "Inactivo";
        }
    }

    private void Buscar() {
        // Obtener el valor del buscador.
        String valor = this.txtBuscar.getText().trim().toLowerCase();

        // Validar el texto a buscar
        if (!valor.isEmpty() && !valor.isBlank()) {
            // Cargar tipos identificacion
            ArrayList<Marca> marcas = new LMarca().Listar();

            if (marcas != null && !marcas.isEmpty()) {
                List<Marca> finales = marcas.stream()
                        .filter(emp -> (emp.getIdMarca() + "").contains(valor)
                        || emp.getNombre().trim().toLowerCase().contains(valor)
                        ).collect(Collectors.toList());

                this.CargarTabla((ArrayList<Marca>) finales);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        lbBuscar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMarcas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        lbBuscar.setText("Buscar:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-search-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-broom-16.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tbMarcas.setModel(new javax.swing.table.DefaultTableModel(
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
        tbMarcas.setEnabled(false);
        tbMarcas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbMarcas.setShowGrid(true);
        tbMarcas.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tbMarcas);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lbBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btnBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.txtBuscar.getText().equals("")) {
                this.txtBuscar.setText("");
                this.txtBuscar.requestFocus();
                this.CargarTabla();
            } else {
                this.Buscar();
            }
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.Buscar();
        this.txtBuscar.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtBuscar.setText("");
        this.txtBuscar.requestFocus();
        this.CargarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tbMarcas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
