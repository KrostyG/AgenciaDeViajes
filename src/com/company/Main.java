package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Venta venta = new Venta();
        System.out.println("Bienvenido A la agencia de Viajes **[Krosty Fly]**");
        System.out.println("Por favor ingresa tu numero de cliente");
        cliente.setDni(sc.nextInt());
        System.out.println("Ingresa tu nombre completo");
        cliente.setNombre(sc.next());
        System.out.println("Ingresa tu numero telefonico");
        cliente.setTelefono(sc.next());
        System.out.println("Ingresa tu Mail");
        cliente.setMail(sc.next());
        venta.generarVenta();
        System.out.println(venta.getCountVenta());
















        /*Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);
        cliente.setDni(sc.nextInt());
        System.out.println(cliente.getDni());*/
    }
}
