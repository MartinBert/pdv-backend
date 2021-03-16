package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "medios_pagos")
public class MedioPago implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "medios_planes",
            joinColumns =  @JoinColumn(name = "id_medio"),
            inverseJoinColumns = @JoinColumn(name = "id_plan"))
    private Set<PlanPago> planPago;

    @OneToOne
    private Sucursal sucursal;

    @Column(name = "suma_en_cierre_de_caja", columnDefinition = "boolean default false")
    private boolean sumaEnCierreDeCaja;

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

    public Set<PlanPago> getPlanPago() {
        return planPago;
    }

    public void setPlanPago(Set<PlanPago> planPago) {
        this.planPago = planPago;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isSumaEnCierreDeCaja() {
        return sumaEnCierreDeCaja;
    }

    public void setSumaEnCierreDeCaja(boolean sumaEnCierreDeCaja) {
        this.sumaEnCierreDeCaja = sumaEnCierreDeCaja;
    }

    @Override
    public String toString() {
        return "MedioPago{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", planPago=" + planPago +
                ", sucursal=" + sucursal +
                ", sumaEnCierreDeCaja=" + sumaEnCierreDeCaja +
                '}';
    }
}
