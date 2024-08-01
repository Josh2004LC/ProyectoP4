/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

/**
 *
 * @author Josh
 */

public class TipoIdentificacion{
    private int idTipoIdentificacion;
    private String nombre;
    private String mascara;

    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public TipoIdentificacion() {
    }

    public TipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }
    

    public TipoIdentificacion(int idTipoIdentificacion, String nombre, String mascara) {
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.nombre = nombre;
        this.mascara = mascara;
    }
}

