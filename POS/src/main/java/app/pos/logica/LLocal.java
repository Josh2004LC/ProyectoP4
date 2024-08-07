/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.Local;
import app.pos.entities.Marca;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josh
 */
public class LLocal {

    public ArrayList<Local> Listar() {
        ArrayList<Local> locales = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_local(?)}", parametros)) {
                    if (resultado != null) {
                        while (resultado.next()) {
                            locales.add(new Local(
                                    resultado.getInt("id_local"),
                                    resultado.getString("direccion"),
                                    resultado.getString("descripcion"),
                                    resultado.getInt("estado")
                            ));
                        }
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return locales;
    }

    public Local Consultar(int idLocal) {
        Local respuesta = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_local", idLocal, Types.INTEGER));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_local(?,?)}", parametros)) {
                    if (resultado != null && resultado.next()) {
                        respuesta = new Local(
                                resultado.getInt("id_local"),
                                resultado.getString("direccion"),
                                resultado.getString("descripcion"),
                                resultado.getInt("estado")
                        );
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LLocal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
}
