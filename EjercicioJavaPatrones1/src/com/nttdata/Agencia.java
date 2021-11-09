package com.nttdata;

import java.util.List;

public class Agencia {
    private List<Cliente> clientes;
    private List<Pasaje> pasajes;
    private List<Alojamiento> alojamientos;
    private List<Venta> ventas;
    private List<Descuento> descuentos;
    private static Agencia instancia;

    public Agencia() {
    }

    public Agencia(List<Cliente> clientes, List<Pasaje> pasajes, List<Alojamiento> alojamientos, List<Venta> ventas, List<Descuento> descuentos) {
        this.clientes = clientes;
        this.pasajes = pasajes;
        this.alojamientos = alojamientos;
        this.ventas = ventas;
        this.descuentos = descuentos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Pasaje> getPasajes() {
        return pasajes;
    }

    public void setPasajes(List<Pasaje> pasajes) {
        this.pasajes = pasajes;
    }

    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public void setAlojamientos(List<Alojamiento> alojamientos) {
        this.alojamientos = alojamientos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public List<Descuento> getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(List<Descuento> descuentos) {
        this.descuentos = descuentos;
    }

    public static Agencia getInstancia(){
        if (instancia==null){
            instancia=new Agencia();
        }
        return instancia;
    }

}
