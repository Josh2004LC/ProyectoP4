/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.logica;

import app.pos.db.ConnectionManager;
import app.pos.db.Parametro;
import app.pos.entities.Cliente;
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
public class LCliente {
 public ArrayList<Cliente> Listar() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call mtr.mtr_matriculas.sp_listar_estudiante(?)}", parametros)) {
                    while (resultado.next()) {
                        clientes.add(new Cliente(
                                resultado.getInt("id_persona"),
                                new TipoIdentificacion(
                                        resultado.getInt("id_tipo_identificacion"),
                                        resultado.getString("tipo_identificacion"),
                                        resultado.getString("mascara")
                                ),
                                resultado.getString("identificacion"),
                                resultado.getString("nombre"),
                                resultado.getString("apellidos"),
                                resultado.getString("correo"),
                                resultado.getString("telefono"),
                                resultado.getString("estado"),
                                resultado.getInt("id_cliente")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

    public Cliente Consultar(int idCliente) {
        Cliente cliente = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_cliente", idCliente, Types.INTEGER));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call mtr.mtr_matriculas.sp_consultar_estudiante_id(?,?)}", parametros)) {
                    if (resultado.next()) {
                        cliente = new Cliente(
                                resultado.getInt("id_persona"),
                                new TipoIdentificacion(
                                        resultado.getInt("id_tipo_identificacion"),
                                        resultado.getString("tipo_identificacion"),
                                        resultado.getString("mascara")
                                ),
                                resultado.getString("identificacion"),
                                resultado.getString("nombre"),
                                resultado.getString("apellidos"),
                                resultado.getString("correo"),
                                resultado.getString("telefono"),
                                resultado.getString("estado"),
                                resultado.getInt("id_estudiante"),
                                new LCarrera().ListarEstudiante(resultado.getInt("id_estudiante"))
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estudiante;
    }

    public Estudiante Consultar(String identificacion) {
        Estudiante estudiante = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_identificacion", identificacion, Types.VARCHAR));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call mtr.mtr_matriculas.sp_consultar_estudiante_identificacion(?,?)}", parametros)) {
                    if (resultado.next()) {
                        estudiante = new Estudiante(
                                resultado.getInt("id_persona"),
                                new TipoIdentificacion(
                                        resultado.getInt("id_tipo_identificacion"),
                                        resultado.getString("tipo_identificacion"),
                                        resultado.getString("mascara")
                                ),
                                resultado.getString("identificacion"),
                                resultado.getString("nombre"),
                                resultado.getString("apellidos"),
                                resultado.getString("correo"),
                                resultado.getString("telefono"),
                                resultado.getString("direccion"),
                                resultado.getString("estado"),
                                resultado.getInt("id_estudiante")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estudiante;
    }

    public int Guardar(Estudiante estudiante) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                // Extraer el array de números de carreras.
                Integer[] arrCarreras = estudiante.getCarreras().stream().map(Carrera::getIdCarrera).toList().toArray(new Integer[0]);

                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_tipo_identificacion", estudiante.getTipoIdentificacion().getIdTipoIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_identificacion", estudiante.getIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", estudiante.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellidos", estudiante.getApellidos(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo", estudiante.getCorreo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono", estudiante.getTelefono(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_direccion", estudiante.getDireccion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", estudiante.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_carreras", "MTR.MTR_MATRICULAS.ARR_CARRERAS", arrCarreras, Types.ARRAY));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call mtr.mtr_matriculas.sp_guardar_estudiante(?,?,?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Estudiante estudiante) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                // Extraer el array de números de carreras.
                Integer[] arrCarreras = estudiante.getCarreras().stream().map(Carrera::getIdCarrera).toList().toArray(new Integer[0]);

                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_estudiante", estudiante.getIdEstudiante(), Types.INTEGER));
                parametros.add(new Parametro<>("p_id_tipo_identificacion", estudiante.getTipoIdentificacion().getIdTipoIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_identificacion", estudiante.getIdentificacion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", estudiante.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellidos", estudiante.getApellidos(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo", estudiante.getCorreo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono", estudiante.getTelefono(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_direccion", estudiante.getDireccion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", estudiante.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_carreras", "MTR.MTR_MATRICULAS.ARR_CARRERAS", arrCarreras, Types.ARRAY));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call mtr.mtr_matriculas.sp_actualizar_estudiante(?,?,?,?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Estado(int idEstudiante, String estado) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_estudiante", idEstudiante, Types.INTEGER));
                parametros.add(new Parametro<>("p_estado", estado, Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call mtr.mtr_matriculas.sp_estado_estudiante(?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
