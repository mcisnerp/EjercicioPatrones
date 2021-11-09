package com.nttdata;

import java.util.List;

public class Venta {
    private int num;
    private List<ItemVenta> items;
    private Cliente cliente;
    private float total;

    public Venta(int num, List<ItemVenta> items, Cliente cliente, float total) {
        this.num = num;
        this.items = items;
        this.cliente = cliente;
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<ItemVenta> getItems() {
        return items;
    }

    public void setItems(List<ItemVenta> items) {
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    //public float getTotal(){}

    public boolean validarDestino(String destino){
        return false;
    }
    public void confirmarVentas(){

    }
}
