package com.company;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List <Cliente> listClientes;
    private List <Pasaje> pasajes;
    private static Agencia instancia;


    private Agencia(List<Cliente> listClientes, List<Pasaje> pasajes) {
        this.listClientes = listClientes;
        this.pasajes = pasajes;
    }

    private Agencia(){
    listClientes = new ArrayList <Cliente>();
    pasajes = new ArrayList<>();
    }
     public static Agencia getInstancia(){
        if (instancia==null){
            instancia = new Agencia();
        }
            return instancia;
     }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    public List <Pasaje> getPasajes() {
        return pasajes;
    }

    public void setPasajes(List <Pasaje> pasajes) {
        this.pasajes = pasajes;
    }
}
