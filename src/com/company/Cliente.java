package com.company;

import java.util.Scanner;

public class Cliente {
    private int dni;
    private String nombre;
    private String telefono;
    private String mail;
    private int venta;

    Venta v = new Venta();
    Scanner sc = new Scanner(System.in);

    public Cliente() {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
        this.venta=v.getNum();
    }
    public void ingresarCliente(){
        System.out.println("Bienvenido A la agencia de Viajes **[Krosty Fly]**");

       System.out.println("Por favor ingresa tu numero de cliente");
        int dni= sc.nextInt();
        setDni(dni);
        sc.skip("\n");

        System.out.println("Ingresa tu nombre completo");
        String s= sc.nextLine();
        setNombre(s);

        System.out.println("Ingresa tu numero telefonico");
        String telefono= sc.nextLine();
        setTelefono(telefono);

        System.out.println("Ingresa tu Mail");
        String mail= sc.nextLine();
        setMail(mail);
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
