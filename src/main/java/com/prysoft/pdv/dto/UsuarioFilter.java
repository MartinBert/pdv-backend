package com.prysoft.pdv.dto;

public class UsuarioFilter extends PageFilter{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void getNombre(String nombre) {
        this.nombre = nombre;
    }
}
