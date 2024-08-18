/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.LineaFactura;
import app.pos.entities.TipoIdentificacion;
import app.pos.entities.TipoUsuario;
import app.pos.entities.Usuario;
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
public class LLineaFactura {

    public ArrayList<LineaFactura> Listar() {
        ArrayList<LineaFactura> lineas = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_linea_factura(?)}", parametros)) {
                    while (resultado.next()) {
                        lineas.add(new LineaFactura(
                                resultado.getInt("id_factura"),
                                resultado.getString("codigo"),
                                resultado.getString("descripcion"),
                                resultado.getDouble("cantidad"),
                                resultado.getDouble("precio"),
                                resultado.getDouble("total")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LLineaFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lineas;
    }

    public LineaFactura Consultar(int idFactura) {
        LineaFactura linea = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_factura", idFactura, Types.INTEGER));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_linea_factura(?,?)}", parametros)) {
                    if (resultado.next()) {
                        linea = new LineaFactura(
                                resultado.getInt("id_factura"),
                                resultado.getString("codigo"),
                                resultado.getString("descripcion"),
                                resultado.getDouble("cantidad"),
                                resultado.getDouble("precio"),
                                resultado.getDouble("total")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LLineaFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return linea;
    }

    public int Guardar(LineaFactura linea) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_producto", linea.getIdProducto(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_id_factura", linea.getIdFactura(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_codigo", linea.getCodigo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_cantidad", linea.getCantidad(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_precio", linea.getPrecio(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_total", linea.getTotal(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_guardar_linea_factura(?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LLineaFactura.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(LineaFactura linea) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_linea_factura", linea.getIdLineaFactura(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_id_producto", linea.getIdProducto(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_id_factura", linea.getIdFactura(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_codigo", linea.getCodigo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_cantidad", linea.getCantidad(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_precio", linea.getPrecio(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_total", linea.getTotal(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_actualizar_linea_factura(?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LLineaFactura.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
