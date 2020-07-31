package com.prysoft.pdv.models;

import javax.persistence.*;

@Entity
@Table(name = "planes_pagos")
public class PlanPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int cuotas;
    private double porcentaje;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
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
                ", nombre='" + nombre + '\'' +
                ", cuotas='" + cuotas + '\'' +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
