package com.nttdata;

public class DestinoEuropeo extends Descuento{

    private float porcentaje;

    public DestinoEuropeo(float porcentaje) {
        super(porcentaje);
    }

    public float getDescuento(Venta v){
        return 0;
    }
}
