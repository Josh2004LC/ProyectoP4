/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

/**
 *
 * @author Josh
 */
public class Marca {
    private int idMarca;
    private String nombre;
    private int estado;

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
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
    
    public Marca(){
        
    }
    
    public Marca(int idMarca){
        this.idMarca = idMarca;
    }
    
     public Marca(int idMarca, String nombre){
        this.idMarca = idMarca;
        this.nombre = nombre;
    }
    
    public Marca(int idMarca, String nombreM, int estado){
        this.idMarca = idMarca;
        this.nombre = nombre;
        this.estado = estado;
    }
    
}
