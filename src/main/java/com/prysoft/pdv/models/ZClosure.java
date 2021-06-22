package com.prysoft.pdv.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import javax.persistence.*;
import java.io.Serializable;
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
    @OneToOne
    private Business empresa;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cierrez_comprobantes",
            joinColumns = @JoinColumn(name = "id_cierre"),
            inverseJoinColumns = @JoinColumn(name = "id_comprobante"))
    private Set<Invoice> comprobantesFiscales;
    private double total;
    private int cantidadVentas;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cierrez_medios",
            joinColumns = @JoinColumn(name = "id_medio_cierre"),
            inverseJoinColumns = @JoinColumn(name = "id_cierre_medio"))
    private Set<PaymentMethodDetail> detalleMediosPago;
    @Column(name = "total_sumatoria_iva", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalSumatoriaIva;
    @Column(name = "total_iva_21", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalIva21;
    @Column(name = "total_iva_10", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalIva10;
    @Column(name = "total_iva_27", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalIva27;
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

    public Business getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Business empresa) {
        this.empresa = empresa;
    }

    public Double getTotalSumatoriaIva() {
        return totalSumatoriaIva;
    }

    public void setTotalSumatoriaIva(Double totalSumatoriaIva) {
        this.totalSumatoriaIva = totalSumatoriaIva;
    }

    public Double getTotalIva21() {
        return totalIva21;
    }

    public void setTotalIva21(Double totalIva21) {
        this.totalIva21 = totalIva21;
    }

    public Double getTotalIva10() {
        return totalIva10;
    }

    public void setTotalIva10(Double totalIva10) {
        this.totalIva10 = totalIva10;
    }

    public Double getTotalIva27() {
        return totalIva27;
    }

    public void setTotalIva27(Double totalIva27) {
        this.totalIva27 = totalIva27;
    }

    public Set<PaymentMethodDetail> getDetalleMediosPago() {
        return detalleMediosPago;
    }

    public void setDetalleMediosPago(Set<PaymentMethodDetail> detalleMediosPago) {
        this.detalleMediosPago = detalleMediosPago;
    }

    @Override
    public String toString() {
        return "ZClosure{" +
                "id=" + id +
                ", sucursal=" + sucursal +
                ", empresa=" + empresa +
                ", comprobantesFiscales=" + comprobantesFiscales +
                ", total=" + total +
                ", cantidadVentas=" + cantidadVentas +
                ", detalleMediosPago=" + detalleMediosPago +
                ", totalSumatoriaIva=" + totalSumatoriaIva +
                ", totalIva21=" + totalIva21 +
                ", totalIva10=" + totalIva10 +
                ", totalIva27=" + totalIva27 +
                ", fecha=" + fecha +
                '}';
    }
}
