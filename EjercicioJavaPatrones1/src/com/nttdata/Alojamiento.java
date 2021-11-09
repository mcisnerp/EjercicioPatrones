package com.nttdata;

public class Alojamiento extends Producto{

    private String nombreAlojamiento;

    public Alojamiento(int codigo, String descripcion, float precio, String nombreAlojamiento) {
        super(codigo, descripcion, precio);
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    /*public Alojamiento(int codigo, String descripcion, float precio) {
        super(codigo, descripcion, precio);
    }*/
}
