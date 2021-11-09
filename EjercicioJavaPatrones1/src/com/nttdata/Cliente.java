package com.nttdata;

public class Cliente {
    private int cli;
    private String nombre;
    private String telefono;
    private String mail;

    public Cliente(int cli, String nombre, String telefono, String mail) {
        this.cli = cli;
        this.nombre = nombre;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getCli() {
        return cli;
    }

    public void setCli(int cli) {
        this.cli = cli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public int getCantVentas(){
        return 0;
    }
}
