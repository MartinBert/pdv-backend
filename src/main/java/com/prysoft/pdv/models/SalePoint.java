package com.prysoft.pdv.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "punto_ventas")
public class SalePoint implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_fiscal", nullable = false)
    private int idFiscal;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "sucursal_id", nullable = false)
    private CommercialBranch sucursal;

    private String ipLocal;

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

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    public String getIpLocal() {
        return ipLocal;
    }

    public void setIpLocal(String ipLocal) {
        this.ipLocal = ipLocal;
    }

    @Override
    public String toString() {
        return "PuntoVenta{" +
                "id=" + id +
                ", idFiscal=" + idFiscal +
                ", nombre='" + nombre + '\'' +
                ", sucursal=" + sucursal +
                ", ipLocal='" + ipLocal + '\'' +
                '}';
    }
}