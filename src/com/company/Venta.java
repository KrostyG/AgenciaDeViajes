package com.company;

public class Venta {
    private int num;
    private int cliente;
    private float total;
    private int countVenta;


    public Venta() {
        this.num = 1;
        this.cliente = cliente;
        this.total = total;
    }

    public void generarVenta(){

        countVenta=countVenta+1;
    }


    public int getCountVenta() {
        return countVenta;
    }

    public void setCountVenta(int countVenta) {
        this.countVenta = countVenta;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
