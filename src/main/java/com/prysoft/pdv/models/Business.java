package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "empresas")
public class Business implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaInicioAct;

    @Column(name = "ing_bruto", unique = true, nullable = false)
    private int ingBruto;

    @OneToOne
    private FiscalCondition condicionIva; //1-Responsable Inscripto, 2-Monotributista

    @OneToMany(mappedBy = "empresa")
    private Set<CommercialBranch> sucursales;

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

    public FiscalCondition getCondicionIva() {
        return condicionIva;
    }

    public void setCondicionIva(FiscalCondition condicionIva) {
        this.condicionIva = condicionIva;
    }

    public Set<CommercialBranch> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<CommercialBranch> sucursales) {
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
        return "Business{" +
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
