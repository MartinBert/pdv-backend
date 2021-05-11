package com.prysoft.pdv.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "punto_ventas")
public class PuntoVenta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "sucursal_id", nullable = false)
    private Sucursal sucursal;

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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "PuntoVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sucursal=" + sucursal +
                '}';
    }
}
