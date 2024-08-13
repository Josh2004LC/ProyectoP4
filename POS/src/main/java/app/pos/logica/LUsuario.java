/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
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
public class LUsuario {

    public ArrayList<Usuario> Listar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_listar_usuario(?)}", parametros)) {
                    while (resultado.next()) {
                        usuarios.add(new Usuario(
                                resultado.getInt("id_usuario"),
                                resultado.getInt("id_persona"),
                                new TipoUsuario(
                                        resultado.getInt("id_tipo_identificacion"),
                                        resultado.getString("nombre"),
                                        resultado.getInt("estado")
                                ),
                                resultado.getString("useraccess"),
                                resultado.getString("passwordd"),
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
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    public Usuario Consultar(int idUsuario) {
        Usuario usuario = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_usuario", idUsuario, Types.INTEGER));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_usuario(?,?)}", parametros)) {
                    if (resultado.next()) {
                        usuario = new Usuario(
                                resultado.getInt("id_usuario"),
                                resultado.getInt("id_persona"),
                                new TipoUsuario(
                                        resultado.getInt("id_tipo_identificacion"),
                                        resultado.getString("nombre"),
                                        resultado.getInt("estado")
                                ),
                                resultado.getString("useraccess"),
                                resultado.getString("password"),
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
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

    public Usuario Consultar(String identificacion) {
        Usuario usuario = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_identificacion", identificacion, Types.VARCHAR));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_usuario_identificacion(?,?)}", parametros)) {
                    if (resultado.next()) {
                        usuario = new Usuario(
                                resultado.getInt("id_usuario"),
                                resultado.getInt("id_persona"),
                                new TipoUsuario(
                                        resultado.getInt("id_tipo_usuario"),
                                        resultado.getString("nombre"),
                                        resultado.getInt("estado")
                                ),
                                resultado.getString("useraccess"),
                                resultado.getString("password"),
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
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

    public int Guardar(Usuario usuario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_usuario", usuario.getIdUsuario(), Types.INTEGER));
                parametros.add(new Parametro<>("p_id_tipo_identificacion", usuario.getTipoIdentificacion().getIdTipoIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_identificacion", usuario.getIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", usuario.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellidos", usuario.getApellidos(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo", usuario.getCorreo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono", usuario.getTelefono(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_id_tipo_usuario", usuario.getTipoUsuario().getIdTipoUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_useraccess", usuario.getUseraccess(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_passwordd", usuario.getPasswordd(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", usuario.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_guardar_usuario(?,?,?,?,?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Usuario usuario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_usuario", usuario.getIdUsuario(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_tipo_identificacion", usuario.getTipoIdentificacion().getIdTipoIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_identificacion", usuario.getIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", usuario.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellidos", usuario.getApellidos(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo", usuario.getCorreo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono", usuario.getTelefono(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_id_tipo_usuario", usuario.getTipoUsuario().getIdTipoUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_useraccess", usuario.getUseraccess(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_passwordd", usuario.getPasswordd(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", usuario.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_actualizar_usuario(?,?,?,?,?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
