package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Table(name = "comprobantes_fiscales")
public class ComprobanteFiscal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String letra;

    @Column(name = "numero_cbte", nullable = false)
    private String numeroCbte;

    private String fechaEmision;
    private String fechaVto;
    private Boolean condicionVenta;

    private ArrayList<PrintComprobanteDetail> productos;

    private String barCode;
    private String cae;
    private Double totalVenta;
    private String nombreDocumento;

    @ManyToMany
    @JoinTable(name = "comprobantes_medios",
            joinColumns = @JoinColumn(name = "id_comprobante"),
            inverseJoinColumns = @JoinColumn(name = "id_medio"))
    private Set<MedioPago> mediosPago;

    @ManyToMany
    @JoinTable(name = "comprobantes_planes",
            joinColumns = @JoinColumn(name = "id_comprobante"),
            inverseJoinColumns = @JoinColumn(name = "id_plan"))
    private Set<PlanPago> planesPago;

    @OneToOne
    private PuntoVenta puntoVenta;

    @OneToOne
    private Sucursal sucursal;

    @OneToOne
    private DocumentoComercial documentoComercial;

    @OneToOne
    private Empresa empresa;

    @OneToOne
    private Cliente cliente;

    private String cerrado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getNumeroCbte() {
        return numeroCbte;
    }

    public void setNumeroCbte(String numeroCbte) {
        this.numeroCbte = numeroCbte;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(String fechaVto) {
        this.fechaVto = fechaVto;
    }

    public Boolean getCondicionVenta() {
        return condicionVenta;
    }

    public void setCondicionVenta(Boolean condicionVenta) {
        this.condicionVenta = condicionVenta;
    }

    public ArrayList<PrintComprobanteDetail> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<PrintComprobanteDetail> productos) {
        this.productos = productos;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getCae() {
        return cae;
    }

    public void setCae(String cae) {
        this.cae = cae;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Set<MedioPago> getMediosPago() {
        return mediosPago;
    }

    public void setMediosPago(Set<MedioPago> mediosPago) {
        this.mediosPago = mediosPago;
    }

    public PuntoVenta getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(PuntoVenta puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public DocumentoComercial getDocumentoComercial() {
        return documentoComercial;
    }

    public void setDocumentoComercial(DocumentoComercial documentoComercial) {
        this.documentoComercial = documentoComercial;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<PlanPago> getPlanesPago() {
        return planesPago;
    }

    public void setPlanesPago(Set<PlanPago> planesPago) {
        this.planesPago = planesPago;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String isCerrado() {
        return cerrado;
    }

    public void setCerrado(String cerrado) {
        this.cerrado = cerrado;
    }

    @Override
    public String toString() {
        return "ComprobanteFiscal{" +
                "id=" + id +
                ", letra='" + letra + '\'' +
                ", numeroCbte='" + numeroCbte + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", fechaVto='" + fechaVto + '\'' +
                ", condicionVenta=" + condicionVenta +
                ", productos=" + productos +
                ", barCode='" + barCode + '\'' +
                ", cae='" + cae + '\'' +
                ", totalVenta=" + totalVenta +
                ", nombreDocumento='" + nombreDocumento + '\'' +
                ", mediosPago=" + mediosPago +
                ", planesPago=" + planesPago +
                ", puntoVenta=" + puntoVenta +
                ", sucursal=" + sucursal +
                ", documentoComercial=" + documentoComercial +
                ", empresa=" + empresa +
                ", cliente=" + cliente +
                ", cerrado='" + cerrado + '\'' +
                '}';
    }
}
