package com.prysoft.pdv.dto;

public class DistribuidorFilter extends PageFilter{
    private String razonSocial;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void getRazonSocial(String nombre) {
        this.razonSocial = nombre;
    }
}
