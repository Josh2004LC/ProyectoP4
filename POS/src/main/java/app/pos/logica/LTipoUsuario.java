/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.TipoIdentificacion;
import app.pos.entities.TipoUsuario;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josh
 */
public class LTipoUsuario {
    
    public ArrayList<TipoUsuario> Listar() {
        ArrayList<TipoUsuario> tipos = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_tipo_usuario(?)}", parametros)) {
                    if (resultado != null) {
                        while (resultado.next()) {
                            tipos.add(new TipoUsuario(
                                    resultado.getInt("id_tipo_usuario"),
                                    resultado.getString("nombre"),
                                    resultado.getInt("estado")
                            ));
                        }
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipos;
    }

    public TipoUsuario Consultar(int idTipoUsuario) {
        TipoUsuario respuesta = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_tipo_usuario", idTipoUsuario, Types.INTEGER));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_tipo_usuario(?,?)}", parametros)) {
                    if (resultado != null && resultado.next()) {
                        respuesta = new TipoUsuario(
                           resultado.getInt("id_tipo_usuario"),
                                    resultado.getString("nombre"),
                                    resultado.getInt("estado")
                        );
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
}
