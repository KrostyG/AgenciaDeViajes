package com.company;

import java.util.Scanner;

public class Descuento extends Producto{
    private float descuento;





    public Descuento(float descuento) {
        this.descuento = descuento;
    }


    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}
