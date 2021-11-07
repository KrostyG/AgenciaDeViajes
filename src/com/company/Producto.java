package com.company;

import java.util.Scanner;

public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;


    Pasaje pasaje = new Pasaje();
    Alojamiento alojamiento= new Alojamiento();
    Scanner sc = new Scanner(System.in);

    public Producto(){

    };

    //VUELO//
    public Producto(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;

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
