package com.company;

import java.util.Scanner;

public class Pasaje extends Producto{

    private String fecha;
    private String compania;
    private String destino;


    public Pasaje(int codigo, String descripcion, float precio, String fecha, String compania, String destino) {
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


}
