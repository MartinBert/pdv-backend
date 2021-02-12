package com.prysoft.pdv.dto;

import java.io.Serializable;

public class PuntoVentaDetail implements Serializable {
    private Long id;
    private int idFiscal;
    private String nombre;
    private String razonSocial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdFiscal() {
        return idFiscal;
    }

    public void setIdFiscal(int idFiscal) {
        this.idFiscal = idFiscal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "PuntoVentaDetail{" +
                "id=" + id +
                ", idFiscal=" + idFiscal +
                ", nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                '}';
    }
}
