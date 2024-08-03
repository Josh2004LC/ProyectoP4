/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.Marca;
import app.pos.entities.TipoIdentificacion;
import app.pos.entities.Usuario;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josh
 */
public class LMarca {
    public ArrayList<Marca> Listar() {
        ArrayList<Marca> marcas = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_marca(?)}", parametros)) {
                    if (resultado != null) {
                        while (resultado.next()) {
                            marcas.add(new Marca(
                                    resultado.getInt("id_marca"),
                                    resultado.getString("nombre"),
                                    resultado.getInt("estado")
                            ));
                        }
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LMarca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return marcas;
    }

    public Marca Consultar(String nombre) {
        Marca respuesta = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_nombre", nombre, Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_marca(?,?)}", parametros)) {
                    if (resultado != null && resultado.next()) {
                        respuesta = new Marca(
                          resultado.getInt("id_marca"),
                          resultado.getString("nombre"),
                          resultado.getInt("estado")
                        );
                    }
                }
                con.Disconnect();
            }
        } catch (Exception ex) {
            Logger.getLogger(LMarca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    
    public int Guardar(Marca marca) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("nombre", marca.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", marca.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_guardar_marca(?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LMarca.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Marca marca) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_marca", marca.getIdMarca(), Types.VARCHAR));
                parametros.add(new Parametro<>("nombre", marca.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", marca.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_actualizar_marca(?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LMarca.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
}
