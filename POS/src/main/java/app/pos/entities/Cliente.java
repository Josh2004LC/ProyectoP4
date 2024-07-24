/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

/**
 *
 * @author Josh
 */
public class Cliente extends Persona{
    
    private int idCliente;
    private String estado;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

   public Cliente(int idPersona, TipoIdentificacion tipoIdentificacion, String identificacion, String nombre, String apellidos, String correo, String telefono, String estado, int idCliente) {
        super(idPersona, tipoIdentificacion, identificacion, nombre, apellidos, correo, telefono);
        this.idCliente = idCliente;
        this.estado = estado;
    }
}
