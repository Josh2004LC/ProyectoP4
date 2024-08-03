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
            Logger.getLogger(LProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }

    public Producto Consultar(String codigo) {
        Producto producto = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_codigo", codigo, Types.VARCHAR));
                parametros.add(new Parametro<>("p_resultado", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call p4proyec.pos_op.op_consultar_producto(?,?)}", parametros)) {
                    if (resultado.next()) {
                        producto = new Producto(
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
                                
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producto;
    }

    public int Guardar(Producto producto) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_marca", producto.getMarca().getIdMarca(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_codigo", producto.getCodigo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", producto.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_cantidad", producto.getCantidad(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_precio", producto.getPrecio(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_descripcion", producto.getDescripcion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", producto.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_guardar_producto(?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LProducto.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Producto producto) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_producto", producto.getIdProducto(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_marca", producto.getMarca().getIdMarca(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_codigo", producto.getCodigo(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_nombre", producto.getNombre(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_cantidad", producto.getCantidad(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_precio", producto.getPrecio(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_descripcion", producto.getDescripcion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_estado", producto.getEstado(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call p4proyec.pos_op.op_actualizar_producto(?,?,?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LProducto.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

}
