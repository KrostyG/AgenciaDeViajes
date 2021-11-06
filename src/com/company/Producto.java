package com.company;

import java.util.Scanner;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;
    private String fecha;
    private String compañia;
    private String destiono;
    private String nomAlojamiento;

    Pasaje pasaje = new Pasaje();
    Alojamiento alojamiento= new Alojamiento();
    Scanner sc = new Scanner(System.in);
 //DEVELOP
    public Producto(int codigo, String descripcion, float precio, String fecha, String compañia, String destino, String nomAlojamiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        this.compañia = compañia;
        this.destiono = destino;
        this.nomAlojamiento = nomAlojamiento;
    }












    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
