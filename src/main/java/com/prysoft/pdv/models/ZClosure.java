package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cierres_z")
public class ZClosure implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private CommercialBranch sucursal;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cierrez_comprobantes",
            joinColumns = @JoinColumn(name = "id_cierre"),
            inverseJoinColumns = @JoinColumn(name = "id_comprobante"))
    private Set<Invoice> comprobantesFiscales;
    private double total;
    private int cantidadVentas;
    private Date fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<Invoice> getComprobantesFiscales() {
        return comprobantesFiscales;
    }

    public void setComprobantesFiscales(Set<Invoice> comprobantesFiscales) {
        this.comprobantesFiscales = comprobantesFiscales;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    @Override
    public String toString() {
        return "ZClosure{" +
                "id=" + id +
                ", sucursal=" + sucursal +
                ", comprobantesFiscales=" + comprobantesFiscales +
                ", total=" + total +
                ", cantidadVentas=" + cantidadVentas +
                ", fecha=" + fecha +
                '}';
    }
}
