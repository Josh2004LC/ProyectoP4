/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

/**
 *
 * @author Josh
 */

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.TipoIdentificacion;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LTipoIdentificacion {
    public ArrayList<TipoIdentificacion> Listar() {
        ArrayList<TipoIdentificacion> tipos = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_tipo_identificacion(?)}", parametros)) {
                    if (resultado != null) {
                        while (resultado.next()) {
                            tipos.add(new TipoIdentificacion(
                                    resultado.getInt("id_tipo_identificacion"),
                                    resultado.getString("nombre"),
                                    resultado.getString("mascara")
                            ));
                        }
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LTipoIdentificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipos;
    }

    public TipoIdentificacion Consultar(int idTipoIdentificacion) {
        TipoIdentificacion respuesta = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_tipo_identificacion", idTipoIdentificacion, Types.INTEGER));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_tipo_identificacion(?,?)}", parametros)) {
                    if (resultado != null && resultado.next()) {
                        respuesta = new TipoIdentificacion(
                          resultado.getInt("id_tipo_identificacion"),
                          resultado.getString("nombre"),
                          resultado.getString("mascara")
                        );
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LTipoIdentificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

}

