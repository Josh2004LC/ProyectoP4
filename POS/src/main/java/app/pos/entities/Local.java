/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

/**
 *
 * @author Josh
 */
public class Local {
    private int idLocal;
    private String direccion;
    private String descripcion;
    private int estado;

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public Local(int idLocal){
        this.idLocal = idLocal;
        
    }
    
     public Local(int idLocal, String direccion, String descripcion, int estado){
        this.idLocal = idLocal;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.estado = estado;
    }
}
