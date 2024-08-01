/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

/**
 *
 * @author Josh
 */
public class TipoUsuario {
    private int idTipoUsuario;
    private String nombre;
    private int estado;

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public TipoUsuario(int idTipoUsuario, String nombre, int estado) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
        this.estado = estado;
    }
}
