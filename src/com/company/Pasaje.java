package com.company;

import java.util.Scanner;

public class Pasaje extends Producto{

    private String fecha;
    private String compania;
    private int destino;

    Scanner sc = new Scanner(System.in);

    public Pasaje(String fecha, String compania, int destino) {
        this.fecha = fecha;
        this.compania = compania;
        this.destino = destino;
    }

    public Pasaje(int codigo, String descripcion, float precio, String fecha, String compania, int destino) {
        super(codigo, descripcion, precio);
        this.fecha = fecha;
        this.compania = compania;
        this.destino = destino;
    }

    public Pasaje() {

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }


}
