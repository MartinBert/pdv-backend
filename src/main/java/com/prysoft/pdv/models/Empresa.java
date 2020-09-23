package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "empresas")
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaInicioAct;

    @Column(name = "ing_bruto", unique = true, nullable = false)
    private int ingBruto;

    @OneToOne
    private CondicionFiscal condicionIva; //1-Responsable Inscripto, 2-Monotributista

    @OneToMany(mappedBy = "empresa")
    private Set<Sucursal> sucursales;

    private String alias;

    @Column(name = "razon_social", unique = true, nullable = false)
    private String razonSocial;

    @Column(name = "cuit", unique = true, nullable = false)
    private String cuit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaInicioAct() {
        return fechaInicioAct;
    }

    public void setFechaInicioAct(Date fechaInicioAct) {
        this.fechaInicioAct = fechaInicioAct;
    }

    public int getIngBruto() {
        return ingBruto;
    }

    public void setIngBruto(int ingBruto) {
        this.ingBruto = ingBruto;
    }

    public CondicionFiscal getCondicionIva() {
        return condicionIva;
    }

    public void setCondicionIva(CondicionFiscal condicionIva) {
        this.condicionIva = condicionIva;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", fechaInicioAct=" + fechaInicioAct +
                ", ingBruto=" + ingBruto +
                ", condicionIva=" + condicionIva +
                ", sucursales=" + sucursales +
                ", alias='" + alias + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}
