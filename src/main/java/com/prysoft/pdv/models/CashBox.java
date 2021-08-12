package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "caja")
public class CashBox implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String fecha;
    private double existenciaInicial;
    private double existenciaFisica;
    private double salidasNoContabilizadas;
    private double montoFacturado;
    private double diferencia;
    @Column(name = "numero_correlativo", columnDefinition = "int default 0")
    private int numeroCorrelativo;
    @OneToOne
    private CommercialBranch sucursal;

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

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getExistenciaInicial() {
        return existenciaInicial;
    }

    public void setExistenciaInicial(double existenciaInicial) {
        this.existenciaInicial = existenciaInicial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroCorrelativo() {
        return numeroCorrelativo;
    }

    public void setNumeroCorrelativo(int numeroCorrelativo) {
        this.numeroCorrelativo = numeroCorrelativo;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", existenciaInicial=" + existenciaInicial +
                ", existenciaFisica=" + existenciaFisica +
                ", salidasNoContabilizadas=" + salidasNoContabilizadas +
                ", montoFacturado=" + montoFacturado +
                ", diferencia=" + diferencia +
                ", numeroCorrelativo=" + numeroCorrelativo +
                ", sucursal=" + sucursal +
                '}';
    }
}
