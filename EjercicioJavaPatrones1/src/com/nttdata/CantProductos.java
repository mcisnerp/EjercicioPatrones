package com.nttdata;

public class CantProductos extends Descuento{

    private float porcentaje;

    public CantProductos(float porcentaje) {
        super(porcentaje);
    }

    public float getDescuento(Venta v){
        return 0;
    }
}
