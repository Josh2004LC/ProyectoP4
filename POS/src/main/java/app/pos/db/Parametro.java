/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.db;

/**
 *
 * @author Josh
 * @param <T>
 */
public class Parametro<T> {
    private String nombre;
    private String nombreTipo;
    private T value;
    private int tipoSQL;
    private boolean respuesta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getTipoSQL() {
        return tipoSQL;
    }

    public void setTipoSQL(int tipoSQL) {
        this.tipoSQL = tipoSQL;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Parametro(String nombre, T value, int tipoSQL) {
        this.nombre = nombre;
        this.value = value;
        this.tipoSQL = tipoSQL;
    }

    public Parametro(String nombre, String nombreTipo, T value, int tipoSQL) {
        this.nombre = nombre;
        this.nombreTipo = nombreTipo;
        this.value = value;
        this.tipoSQL = tipoSQL;
    }

    public Parametro(String nombre, T value, int tipoSQL, boolean respuesta) {
        this.nombre = nombre;
        this.value = value;
        this.tipoSQL = tipoSQL;
        this.respuesta = respuesta;
    }
}
