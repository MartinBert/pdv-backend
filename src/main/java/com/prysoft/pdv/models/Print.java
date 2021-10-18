package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="print")
public class Print implements Serializable {
    private final static long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String valor;
    private String nombreImpresora;
    private boolean impresoraPredeterminada;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Column(name = "estado", columnDefinition = "boolean default true")
    private boolean estado;

    @OneToOne
    private CommercialBranch sucursal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombreImpresora() {
        return nombreImpresora;
    }

    public void setNombreImpresora(String nombreImpresora) {
        this.nombreImpresora = nombreImpresora;
    }

    public boolean isImpresoraPredeterminada() {
        return impresoraPredeterminada;
    }

    public void setImpresoraPredeterminada(boolean impresoraPredeterminada) {
        this.impresoraPredeterminada = impresoraPredeterminada;
    }

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Print{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                ", nombreImpresora='" + nombreImpresora + '\'' +
                ", impresoraPredeterminada=" + impresoraPredeterminada +
                ", estado=" + estado +
                ", sucursal=" + sucursal +
                '}';
    }
}
