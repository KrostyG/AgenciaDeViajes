package com.company;

import java.util.Scanner;

public class Paquete extends Producto{

    private double descuento;


    public Paquete(int codigo, String descripcion, float precio, double descuento) {
        super(codigo, descripcion, precio);
        this.descuento = (precio * descuento);
    }

    Alojamiento aloj1 = new Alojamiento(4,"Hotel 1",12000,"Hotel 5 Estrellas");
    Alojamiento aloj2 = new Alojamiento(5,"Hotel 2",17000,"Hotel 4 Estrellas");
    Alojamiento aloj3 = new Alojamiento(6,"Hotel 3",20000,"Hotel 3 Estrellas");

    Paquete paq1 = new Paquete(1,"Paquete1",15000,.95);
    Paquete paq2 = new Paquete(2,"Paquete2",25000,.95);
    Paquete paq3 = new Paquete(3,"Paquete3",17500,.95);



    public void add(Producto p){


    }

    public Paquete(double descuento) {
        this.descuento = descuento;
    }



    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}


