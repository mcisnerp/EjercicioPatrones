package com.nttdata;

public class ClienteFrecuente extends Descuento{

    private float porcentaje;

    public ClienteFrecuente(float porcentaje) {
        super(porcentaje);
    }

    public float getDescuento(Venta v){
        return 0;
    }

}
