package com.company;

public class Main {

    public static void main(String[] args) {
    //Paquete paquete = new Paquete();

        Agencia agencia = Agencia.getInstancia();

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        agencia.getListClientes().add(cliente1);
        agencia.getPasajes().add(new Pasaje());

        Agencia agencia2 = Agencia.getInstancia();

        Agencia agencia3 = Agencia.getInstancia();

        System.out.println(agencia);
        System.out.println(agencia);
    }
}
