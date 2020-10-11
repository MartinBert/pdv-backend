package com.prysoft.pdv.dto;

import com.prysoft.pdv.models.Sucursal;

public class DepositoFilter extends PageFilter{
    private String nombre;
    private Sucursal sucursal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getSucursales() {
        return sucursal.getId();
    }
}
