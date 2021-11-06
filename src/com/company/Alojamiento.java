package com.company;

import java.util.Scanner;

public class Alojamiento {
    private String nombreAlojamiento;
    private String alojamiento1= "Hotel 5 estrellas";
    private String alojamiento2= "Hotel 4 estrellas";
    private String alojamiento3= "Hotel 3 estrellas";
    private String alojamiento4= "Hotel 2 estrellas";


    public Alojamiento() {
        this.nombreAlojamiento = nombreAlojamiento;
        this.alojamiento1 = alojamiento1;
        this.alojamiento2 = alojamiento2;
        this.alojamiento3 = alojamiento3;
        this.alojamiento4 = alojamiento4;
    }


    public String getAlojamiento1() {
        return alojamiento1;
    }

    public void setAlojamiento1(String alojamiento1) {
        this.alojamiento1 = alojamiento1;
    }

    public String getAlojamiento2() {
        return alojamiento2;
    }

    public void setAlojamiento2(String alojamiento2) {
        this.alojamiento2 = alojamiento2;
    }

    public String getAlojamiento3() {
        return alojamiento3;
    }

    public void setAlojamiento3(String alojamiento3) {
        this.alojamiento3 = alojamiento3;
    }

    public String getAlojamiento4() {
        return alojamiento4;
    }

    public void setAlojamiento4(String alojamiento4) {
        this.alojamiento4 = alojamiento4;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {

        this.nombreAlojamiento = nombreAlojamiento;
    }
}
