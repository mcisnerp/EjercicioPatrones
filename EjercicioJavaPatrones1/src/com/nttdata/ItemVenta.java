package com.nttdata;

public class ItemVenta extends Producto {
    private int cantidad;
    private String description;
    private Producto producto;


    public ItemVenta(int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float getSubtotal(){
        return 0;
    }

    public boolean validarDestino(String destino){
        return false;
    }
}
