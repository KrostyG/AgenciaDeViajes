package com.company;

public class ItemVenta {

    private int cantidad;
    private String descripcion;
    private int codigoProducto;

    public ItemVenta(int cantidad, String descripcion, int codigoProducto) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.codigoProducto = codigoProducto;
    }



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
}
