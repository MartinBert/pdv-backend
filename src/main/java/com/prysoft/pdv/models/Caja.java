package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "caja")
public class Caja implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double existenciaFisica;
    private double salidasNoContabilizadas;
    private double montoFacturado;
    private double diferencia;

    @OneToOne
    private Sucursal sucursal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getExistenciaFisica() {
        return existenciaFisica;
    }

    public void setExistenciaFisica(double existenciaFisica) {
        this.existenciaFisica = existenciaFisica;
    }

    public double getSalidasNoContabilizadas() {
        return salidasNoContabilizadas;
    }

    public void setSalidasNoContabilizadas(double salidasNoContabilizadas) {
        this.salidasNoContabilizadas = salidasNoContabilizadas;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    public double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "id=" + id +
                ", existenciaFisica=" + existenciaFisica +
                ", salidasNoContabilizadas=" + salidasNoContabilizadas +
                ", montoFacturado=" + montoFacturado +
                ", diferencia=" + diferencia +
                ", sucursal=" + sucursal +
                '}';
    }
}
