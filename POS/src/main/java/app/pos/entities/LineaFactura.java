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
    private int idProducto;
    private int idFactura;
    private String descripcion;
    private String codigo;
    private Double cantidad;
    private Double precio;
    private Double total;

    public int getIdLineaFactura() {
        return idLineaFactura;
    }

    public void setIdLineaFactura(int idLineaFactura) {
        this.idLineaFactura = idLineaFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public LineaFactura(int idLineaFactura,int idProducto, int idFactura, String codigo,
            Double cantidad, Double precio, Double total) {
        this.idLineaFactura = idLineaFactura;
        this.idProducto = idProducto;
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.precio = precio;
        this.total = total;

    }

    public LineaFactura(int idProducto, int idFactura, String codigo, Double cantidad, Double precio, 
            Double total) {
        this.idProducto = idProducto;
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.precio = precio;
        this.total = total;

    }
    
    public LineaFactura(int idFactura, String codigo, String descripcion, Double cantidad, 
            Double precio, Double total) {
        this.idFactura = idFactura;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.total = total;

    }
}
