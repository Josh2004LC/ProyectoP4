/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.Cliente;
import app.pos.entities.Factura;
import app.pos.entities.TipoIdentificacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josh
 */
public class LFactura {

    public ArrayList<Factura> Listar() {
        ArrayList<Factura> facturas = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_factura(?)}", parametros)) {
                    while (resultado.next()) {
                        facturas.add(new Factura(
                                resultado.getInt("id_factura"),
                                resultado.getInt("id_usuario"),
                                resultado.getInt("id_cliente"),
                                resultado.getInt("id_local"),
                                resultado.getString("comentario"),
                                resultado.getDate("fecha_emision"),
                                resultado.getDouble("total"),
                                resultado.getInt("estado")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return facturas;
    }

    public Factura Consultar(int idFactura) {
        Factura factura = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_factura", idFactura, Types.INTEGER));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_factura(?,?)}", parametros)) {
                    if (resultado.next()) {
                        factura = new Factura(
                                resultado.getInt("id_factura"),
                                resultado.getInt("id_usuario"),
                                resultado.getInt("id_cliente"),
                                resultado.getInt("id_local"),
                                resultado.getString("comentario"),
                                resultado.getDate("fecha_emision"),
                                resultado.getDouble("total"),
                                resultado.getInt("estado")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return factura;
    }

    public int Guardar(Factura factura) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_usuario", factura.getIdUsuario(), Types.INTEGER));
                parametros.add(new Parametro<>("p_id_cliente", factura.getIdCliente(), Types.INTEGER));
                parametros.add(new Parametro<>("p_id_local", factura.getIdLocal(), Types.INTEGER));
                parametros.add(new Parametro<>("p_comentario", factura.getComentario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_fecha_emision", factura.getFechaEmision(), Types.DATE));
                parametros.add(new Parametro<>("p_total", factura.getTotal(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_estado", factura.getEstado(), Types.INTEGER));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_guardar_factura(?,?,?,?,?,?,?,?)}", parametros);

            }

            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Factura factura) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_factura", factura.getIdFactura(), Types.INTEGER));
                parametros.add(new Parametro<>("p_id_usuario", factura.getIdUsuario(), Types.INTEGER));
                parametros.add(new Parametro<>("p_id_cliente", factura.getIdCliente(), Types.INTEGER));
                parametros.add(new Parametro<>("p_id_local", factura.getIdLocal(), Types.INTEGER));
                parametros.add(new Parametro<>("p_comentario", factura.getComentario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_fecha_emision", factura.getFechaEmision(), Types.DATE));
                parametros.add(new Parametro<>("p_total", factura.getTotal(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_estado", factura.getEstado(), Types.INTEGER));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_actualizar_factura(?,?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

}
