/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

/**
 *
 * @author Josh
 */
public class Usuario extends Persona {

    private int idUsuario;
    private int estado;
    private TipoUsuario tipoUsuario;
    private String useraccess;
    private String passwordd;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUseraccess() {
        return useraccess;
    }

    public void setUseraccess(String useraccess) {
        this.useraccess = useraccess;
    }

    public String getPasswordd() {
        return passwordd;
    }

    public void setPasswordd(String passwordd) {
        this.passwordd = passwordd;
    }
    
    

    public Usuario() {

    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, int idPersona, TipoUsuario tipoUsuario, String useraccess, String passwordd,  int estado,
            String identificacion, String nombre, String apellidos, String correo,
            String telefono, TipoIdentificacion tipoIdentificacion) {
        
        super(idPersona, tipoIdentificacion, identificacion, nombre, apellidos, correo, telefono);
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.estado = estado;
        this.useraccess = useraccess;
        this.passwordd = passwordd;
    }
}
