/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

import java.util.Date;


/**
 *
 * @author Josh
 */
public class Factura {
    private int idFactura;
    private int idUsuario;
    private int idCliente;
    private int idLocal;
    private String comentario;
    private Date fechaEmision;
    private double total;
    private int estado;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public Factura(int idFactura){
        this.idFactura = idFactura;
    }
    
    public Factura(int idFactura,int idUsuario, int idCliente, int idLocal, String comentario, 
            Date fechaEmision, double total, int estado){
        this.idFactura = idFactura;
        this.idUsuario = idUsuario;
        this.idCliente = idCliente;
        this.idLocal = idLocal;
        this.comentario = comentario;
        this.fechaEmision = fechaEmision;
        this.total = total;
        this.estado = estado;
    }
}
