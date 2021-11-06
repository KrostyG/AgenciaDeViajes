package com.company;

import java.util.Scanner;

public class Pasaje {
    private String fecha;
    private String compania;
    private int destino;

    private String destCancun = "Acaculco";
    private String destIxtapa="Ixtapa";
    private String destAcapulco="Cancun";

    private String compañia1 = "Aero Mexico";
    private String compañia2="Aero bus";
    private String compañia3="Volaris";

    private String fecha1 = "2022";
    private String fecha2="2022-2023";
    private String fecha3="2022-2024";



    Scanner sc = new Scanner(System.in);

    public Pasaje() {
        this.fecha = fecha;
        this.compania = compania;
        this.destino = destino;
        this.destCancun = destCancun;
        this.destIxtapa = destIxtapa;
        this.destAcapulco = destAcapulco;
        this.compañia1 = compañia1;
        this.compañia2 = compañia2;
        this.compañia3 = compañia3;
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
        this.fecha3 = fecha3;
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

    public String getDestCancun() {
        return destCancun;
    }

    public void setDestCancun(String destCancun) {
        this.destCancun = destCancun;
    }

    public String getDestIxtapa() {
        return destIxtapa;
    }

    public void setDestIxtapa(String destIxtapa) {
        this.destIxtapa = destIxtapa;
    }

    public String getDestAcapulco() {
        return destAcapulco;
    }

    public void setDestAcapulco(String destAcapulco) {
        this.destAcapulco = destAcapulco;
    }

    public String getCompañia1() {
        return compañia1;
    }

    public void setCompañia1(String compañia1) {
        this.compañia1 = compañia1;
    }

    public String getCompañia2() {
        return compañia2;
    }

    public void setCompañia2(String compañia2) {
        this.compañia2 = compañia2;
    }

    public String getCompañia3() {
        return compañia3;
    }

    public void setCompañia3(String compañia3) {
        this.compañia3 = compañia3;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getFecha3() {
        return fecha3;
    }

    public void setFecha3(String fecha3) {
        this.fecha3 = fecha3;
    }
}
