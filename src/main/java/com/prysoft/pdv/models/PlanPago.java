package com.prysoft.pdv.models;

import javax.persistence.*;

@Entity
@Table(name = "planes_pagos")
public class PlanPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cuota;
    private double porcentaje;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "PlanPago{" +
                "id=" + id +
                ", cuota='" + cuota + '\'' +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
