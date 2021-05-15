package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ivas")
public class TaxIva implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double porcentaje;
    private boolean tipo;

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

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TaxIva{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", porcentaje=" + porcentaje +
                ", tipo=" + tipo +
                '}';
    }
}
