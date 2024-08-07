/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pos.entities;

/**
 *
 * @author Josh
 */
public class LineaFactura {

    private int idLineaFactura;
    private int idFactura;
    private String codigo;
    private String descripcion;
    private Double cantidad;
    private Double precio;
    private Double total;

    public int getIdLineaFactura() {
        return idLineaFactura;
    }

    public void setIdLineaFactura(int idLineaFactura) {
        this.idLineaFactura = idLineaFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LineaFactura() {

    }

    public LineaFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public LineaFactura(int idLineaFactura, int idFactura, String codigo, String descripcion,
            Double cantidad, Double precio, Double total) {
        this.idLineaFactura = idLineaFactura;
        this.idFactura = idFactura;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.total = total;

    }

    public LineaFactura(int idFactura, String codigo, String descripcion,
            Double cantidad, Double precio, Double total) {
        this.idFactura = idFactura;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.total = total;

    }
}
