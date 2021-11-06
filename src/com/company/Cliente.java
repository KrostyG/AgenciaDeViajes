package com.company;

public class Cliente {
    private int dni;
    private String nombre;
    private String telefono;
    private String mail;
    private int venta;

    Venta v = new Venta();


    public Cliente() {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.venta=v.getNum();
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public Venta getV() {
        return v;
    }

    public void setV(Venta v) {
        this.v = v;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
