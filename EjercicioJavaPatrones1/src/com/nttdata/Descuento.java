package com.nttdata;

public class Descuento {
    private float porcentaje;

    public Descuento(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
    public float getDescuento(Venta v){
        return 0;
    }
}
