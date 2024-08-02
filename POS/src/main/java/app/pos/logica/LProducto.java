/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.Cliente;
import app.pos.entities.Marca;
import app.pos.entities.Producto;
import app.pos.entities.TipoIdentificacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josh
 */
public class LProducto {
    public ArrayList<Producto> Listar() {
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_producto(?)}", parametros)) {
                    while (resultado.next()) {
                        productos.add(new Producto(
                                resultado.getInt("id_producto"),
                                new Marca(
                                    resultado.getInt("id_marca"),
                                    resultado.getString("nombre_marca")
                                ),
                                resultado.getString("codigo"),
                                resultado.getString("nombre_producto"),
                                resultado.getDouble("cantidad"),
                                resultado.getDouble("precio"),
                                resultado.getString("descripcion"),
                                resultado.getInt("estado")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }

    public Cliente Consultar(int idCliente) {
        Cliente cliente = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_cliente", idCliente, Types.INTEGER));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_cliente_id(?,?)}", parametros)) {
                    if (resultado.next()) {
                        cliente = new Cliente(
                                resultado.getInt("id_cliente"),
                                resultado.getInt("id_persona"),
                                resultado.getInt("estado"),
                                resultado.getString("identificacion"),
                                resultado.getString("nombre"),
                                resultado.getString("apellidos"),
                                resultado.getString("correo"),
                                resultado.getString("telefono"),
                                new TipoIdentificacion(
                                        resultado.getInt("id_tipo_identificacion"),
                                        resultado.getString("nombre"),
                                        resultado.getString("mascara")
                                )
                                
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public Cliente Consultar(String identificacion) {
        Cliente cliente = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_identificacion", identificacion, Types.VARCHAR));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_cliente_identificacion(?,?)}", parametros)) {
                    if (resultado.next()) {
                        cliente = new Cliente(
                                resultado.getInt("id_cliente"),
                                resultado.getInt("id_persona"),
                                resultado.getInt("estado"),
                                resultado.getString("identificacion"),
                                resultado.getString("nombre"),
                                resultado.getString("apellidos"),
                                resultado.getString("correo"),
                                resultado.getString("telefono"),
                                new TipoIdentificacion(
                                        resultado.getInt("id_tipo_identificacion"),
                                        resultado.getString("nombre"),
                                        resultado.getString("mascara")
                                )
                                
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public int Guardar(Cliente cliente) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_tipo_identificacion", cliente.getTipoIdentificacion().getIdTipoIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_identificacion", cliente.getIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", cliente.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellidos", cliente.getApellidos(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo", cliente.getCorreo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono", cliente.getTelefono(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", cliente.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_guardar_cliente(?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Cliente cliente) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_cliente", cliente.getIdCliente(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_tipo_identificacion", cliente.getTipoIdentificacion().getIdTipoIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_identificacion", cliente.getIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", cliente.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellidos", cliente.getApellidos(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo", cliente.getCorreo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono", cliente.getTelefono(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", cliente.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_actualizar_cliente(?,?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

}
