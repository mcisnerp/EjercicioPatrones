package com.nttdata;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Paquete extends Producto {
    private float descuento;
    private List <Producto> productos;

    public Paquete(int codigo, String descripcion, float precio, float descuento, List<Producto> productos) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
        this.productos = productos;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

