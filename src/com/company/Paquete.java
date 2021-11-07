package com.company;

import java.util.Scanner;

public class Paquete extends Producto{

    private float descuento;


    public Paquete(float descuento) {
        this.descuento = descuento;
    }

    public Paquete(int codigo, String descripcion, float precio, float descuento) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
    }
}


