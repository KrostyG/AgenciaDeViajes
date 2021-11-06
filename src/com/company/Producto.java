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
    private int descuento;

    Pasaje pasaje = new Pasaje();
    Alojamiento alojamiento= new Alojamiento();
    Scanner sc = new Scanner(System.in);

    //VUELO//
    public Producto(int codigo, String descripcion, float precio, String fecha, String compañia, String destiono) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        this.compañia = compañia;
        this.destiono = destiono;
    }
    //ALOJAMIENTO//
    public Producto(int codigo, String descripcion, float precio, String nomAlojamiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nomAlojamiento = nomAlojamiento;
    }
    //Paquete
    public Producto(int codigo, String descripcion, float precio, String fecha, String compañia, String destino, int descuento){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        this.compañia = compañia;
        this.destiono = destino;
        this.descuento=descuento;
    }


    //Producto pr1 = new Producto(1,"Este es un vuelo a Acapulco a un Hotel 5 Estrellas",15000,pasaje.getFecha1(),pasaje.getCompañia1(),pasaje.getDestAcapulco(),alojamiento.getAlojamiento1());

   /*public Producto(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = pasaje.getFecha1();
        this.compañia = pasaje.getCompañia1();
        this.destiono = pasaje.getDestAcapulco();
        this.nomAlojamiento = alojamiento.getAlojamiento1();*/

    /*public Producto (){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        this.compañia = compañia;
        this.destiono = destiono;
        this.nomAlojamiento = nomAlojamiento;
    }*/

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getDestiono() {
        return destiono;
    }

    public void setDestiono(String destiono) {
        this.destiono = destiono;
    }

    public String getNomAlojamiento() {
        return nomAlojamiento;
    }

    public void setNomAlojamiento(String nomAlojamiento) {
        this.nomAlojamiento = nomAlojamiento;
    }
}
