
import app.modulos.cliente.ActualizarCliente;
import app.modulos.cliente.GuardarCliente;
import app.modulos.cliente.ListarCliente;
import app.modulos.factura.GuardarFactura;
import app.modulos.factura.ListarFactura;
import app.modulos.marca.ActualizarMarca;
import app.modulos.marca.GuardarMarca;
import app.modulos.marca.ListarMarca;
import app.modulos.producto.ActualizarProducto;
import app.modulos.producto.GuardarProducto;
import app.modulos.producto.ListarProducto;
import app.modulos.tipoIdentificacion.ListarTipoIdentificacion;
import app.modulos.usuario.ActualizarUsuario;
import app.modulos.usuario.GuardarUsuario;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Josh
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g)
            {
                g.drawImage(new ImageIcon(getClass().getResource("/recursos/imagenes/bg-system.jpg")).getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        mInicio = new javax.swing.JMenu();
        mRegistrarUsuario = new javax.swing.JMenuItem();
        mActualizarUsuario = new javax.swing.JMenuItem();
        opGrupo = new javax.swing.JMenuItem();
        opPeriodo = new javax.swing.JMenuItem();
        opCarrera = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        mInventario = new javax.swing.JMenu();
        productosMenuItem = new javax.swing.JMenuItem();
        agregarProductoMenuItem = new javax.swing.JMenuItem();
        actualizarProductoMenuItem = new javax.swing.JMenuItem();
        marcasMenuItem = new javax.swing.JMenuItem();
        agregarMarcaMenuItem = new javax.swing.JMenuItem();
        actualizarMarcaMenuItem = new javax.swing.JMenuItem();
        mFactura = new javax.swing.JMenu();
        guardarFacturaItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        mClientes = new javax.swing.JMenu();
        mRegistrarCliente = new javax.swing.JMenuItem();
        mActualizarCliente = new javax.swing.JMenuItem();
        mListarClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-system-16.png"))); // NOI18N
        mInicio.setText("Inicio");
        mInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mRegistrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-staff-16.png"))); // NOI18N
        mRegistrarUsuario.setMnemonic('o');
        mRegistrarUsuario.setText("Crear Usuario");
        mRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarUsuarioActionPerformed(evt);
            }
        });
        mInicio.add(mRegistrarUsuario);

        mActualizarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mActualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-staff-16.png"))); // NOI18N
        mActualizarUsuario.setMnemonic('s');
        mActualizarUsuario.setText("Actualizar Usuario");
        mActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarUsuarioActionPerformed(evt);
            }
        });
        mInicio.add(mActualizarUsuario);

        opGrupo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-user-groups-16.png"))); // NOI18N
        opGrupo.setMnemonic('a');
        opGrupo.setText("Grupos");
        mInicio.add(opGrupo);

        opPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-sand-timer-16.png"))); // NOI18N
        opPeriodo.setText("Periodos");
        mInicio.add(opPeriodo);

        opCarrera.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-calendar-16.png"))); // NOI18N
        opCarrera.setText("Carreras");
        mInicio.add(opCarrera);

        exitMenuItem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-close-program-16.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        mInicio.add(exitMenuItem);

        menuBar.add(mInicio);

        mInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-bookmark-16.png"))); // NOI18N
        mInventario.setMnemonic('e');
        mInventario.setText("Inventario");
        mInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        productosMenuItem.setMnemonic('t');
        productosMenuItem.setText("Productos");
        productosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosMenuItemActionPerformed(evt);
            }
        });
        mInventario.add(productosMenuItem);

        agregarProductoMenuItem.setMnemonic('y');
        agregarProductoMenuItem.setText("Agregar Producto");
        agregarProductoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoMenuItemActionPerformed(evt);
            }
        });
        mInventario.add(agregarProductoMenuItem);

        actualizarProductoMenuItem.setMnemonic('p');
        actualizarProductoMenuItem.setText("Actualizar Producto");
        actualizarProductoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarProductoMenuItemActionPerformed(evt);
            }
        });
        mInventario.add(actualizarProductoMenuItem);

        marcasMenuItem.setMnemonic('d');
        marcasMenuItem.setText("Marcas");
        marcasMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcasMenuItemActionPerformed(evt);
            }
        });
        mInventario.add(marcasMenuItem);

        agregarMarcaMenuItem.setText("Agregar Marca");
        agregarMarcaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMarcaMenuItemActionPerformed(evt);
            }
        });
        mInventario.add(agregarMarcaMenuItem);

        actualizarMarcaMenuItem.setText("Actualizar Marca");
        actualizarMarcaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMarcaMenuItemActionPerformed(evt);
            }
        });
        mInventario.add(actualizarMarcaMenuItem);

        menuBar.add(mInventario);

        mFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-user-account-16.png"))); // NOI18N
        mFactura.setMnemonic('h');
        mFactura.setText(" Facturas");
        mFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        guardarFacturaItem.setMnemonic('c');
        guardarFacturaItem.setText("Generar Factura");
        guardarFacturaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFacturaItemActionPerformed(evt);
            }
        });
        mFactura.add(guardarFacturaItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        mFactura.add(aboutMenuItem);

        menuBar.add(mFactura);

        mClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-administrator-male-16.png"))); // NOI18N
        mClientes.setText("Clientes");
        mClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        mRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-save-16.png"))); // NOI18N
        mRegistrarCliente.setText("Registrar");
        mRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mRegistrarClienteActionPerformed(evt);
            }
        });
        mClientes.add(mRegistrarCliente);

        mActualizarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-edit-property-16.png"))); // NOI18N
        mActualizarCliente.setText("Actualizar");
        mActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActualizarClienteActionPerformed(evt);
            }
        });
        mClientes.add(mActualizarCliente);

        mListarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mListarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/iconos/icons8-bullet-list-16.png"))); // NOI18N
        mListarClientes.setText("Todos");
        mListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mListarClientesActionPerformed(evt);
            }
        });
        mClientes.add(mListarClientes);

        menuBar.add(mClientes);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarClienteActionPerformed
        GuardarCliente myForm = new GuardarCliente();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarClienteActionPerformed

    private void mActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarClienteActionPerformed
        ActualizarCliente myForm = new ActualizarCliente();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarClienteActionPerformed

    private void mListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mListarClientesActionPerformed
        ListarCliente myForm = new ListarCliente();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mListarClientesActionPerformed

    private void mRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mRegistrarUsuarioActionPerformed
        GuardarUsuario myForm = new GuardarUsuario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mRegistrarUsuarioActionPerformed

    private void mActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActualizarUsuarioActionPerformed
        ActualizarUsuario myForm = new ActualizarUsuario();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_mActualizarUsuarioActionPerformed

    private void agregarProductoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoMenuItemActionPerformed
        GuardarProducto myForm = new GuardarProducto();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_agregarProductoMenuItemActionPerformed

    private void productosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosMenuItemActionPerformed
       ListarProducto myForm = new ListarProducto();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_productosMenuItemActionPerformed

    private void marcasMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcasMenuItemActionPerformed
        ListarMarca myForm = new ListarMarca();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_marcasMenuItemActionPerformed

    private void agregarMarcaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMarcaMenuItemActionPerformed
        GuardarMarca myForm = new GuardarMarca();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_agregarMarcaMenuItemActionPerformed

    private void actualizarMarcaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMarcaMenuItemActionPerformed
        ActualizarMarca myForm = new ActualizarMarca();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_actualizarMarcaMenuItemActionPerformed

    private void actualizarProductoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarProductoMenuItemActionPerformed
       ActualizarProducto myForm = new ActualizarProducto();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_actualizarProductoMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
         ListarFactura myForm = new ListarFactura();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void guardarFacturaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFacturaItemActionPerformed
        GuardarFactura myForm = new GuardarFactura();
        myForm.setLocation(
                (panelPrincipal.getSize().width - myForm.getSize().width) / 2,
                (panelPrincipal.getSize().height - myForm.getSize().height) / 2
        );
        this.panelPrincipal.add(myForm);
        myForm.show();
    }//GEN-LAST:event_guardarFacturaItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem actualizarMarcaMenuItem;
    private javax.swing.JMenuItem actualizarProductoMenuItem;
    private javax.swing.JMenuItem agregarMarcaMenuItem;
    private javax.swing.JMenuItem agregarProductoMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem guardarFacturaItem;
    private javax.swing.JMenuItem mActualizarCliente;
    private javax.swing.JMenuItem mActualizarUsuario;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenu mFactura;
    private javax.swing.JMenu mInicio;
    private javax.swing.JMenu mInventario;
    private javax.swing.JMenuItem mListarClientes;
    private javax.swing.JMenuItem mRegistrarCliente;
    private javax.swing.JMenuItem mRegistrarUsuario;
    private javax.swing.JMenuItem marcasMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem opCarrera;
    private javax.swing.JMenuItem opGrupo;
    private javax.swing.JMenuItem opPeriodo;
    private javax.swing.JDesktopPane panelPrincipal;
    private javax.swing.JMenuItem productosMenuItem;
    // End of variables declaration//GEN-END:variables
}
