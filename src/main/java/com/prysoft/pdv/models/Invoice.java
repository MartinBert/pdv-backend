package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "comprobantes_fiscales")
public class Invoice implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String letra;
    @Column(name = "numero_cbte", nullable = false)
    private String numeroCbte;
    private String correlativoComprobante;
    private String fechaEmision;
    private String fechaVto;
    private Boolean condicionVenta;
    private String logoUrl;
    private ArrayList<PrintComprobanteDetail> productos;
    private ArrayList<Product> productosDetalle;
    private ArrayList<ProductoDescription> productoDescription;
    private String barCode;
    private String cae;
    private Double totalVenta;
    @Column(name = "sub_total", columnDefinition = "Decimal(10,2) default 0.00")
    private Double subTotal;
    @Column(name = "porcentaje_descuento_global", columnDefinition = "Decimal(10,2) default 0.00")
    private Double porcentajeDescuentoGlobal;
    @Column(name = "total_descuento_global", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalDescuentoGlobal;
    @Column(name = "porcentaje_recargo_global", columnDefinition = "Decimal(10,2) default 0.00")
    private Double porcentajeRecargoGlobal;
    @Column(name = "total_recargo_global", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalRecargoGlobal;
    @Column(name = "total_iva_21", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalIva21;
    @Column(name = "total_iva_10", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalIva10;
    @Column(name = "total_iva_27", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalIva27;
    @Column(name = "porcentaje_recargo_plan", columnDefinition = "Decimal(10,2) default 0.00")
    private Double porcentajeRecargoPlan;
    @Column(name = "total_recargo_plan", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalRecargoPlan;
    @Column(name = "porcentaje_descuento_plan", columnDefinition = "Decimal(10,2) default 0.00")
    private Double porcentajeDescuentoPlan;
    @Column(name = "total_descuento_plan", columnDefinition = "Decimal(10,2) default 0.00")
    private Double totalDescuentoPlan;
    private double ingresosBrutos;
    private String nombreDocumento;
    @ManyToMany
    @JoinTable(name = "comprobantes_medios",
            joinColumns = @JoinColumn(name = "id_comprobante"),
            inverseJoinColumns = @JoinColumn(name = "id_medio"))
    private Set<PaymentMethod> mediosPago;
    @ManyToMany
    @JoinTable(name = "comprobantes_planes",
            joinColumns = @JoinColumn(name = "id_comprobante"),
            inverseJoinColumns = @JoinColumn(name = "id_plan"))
    private Set<PaymentPlan> planesPago;
    @OneToOne
    private SalePoint puntoVenta;
    @OneToOne
    private CommercialBranch sucursal;
    @OneToOne
    private CommercialDocument documentoComercial;
    @OneToOne
    private Business empresa;
    @OneToOne
    private Client cliente;
    private String cerrado;
    @Column(name = "cerrado_en_cierre_z", columnDefinition = "boolean default false")
    private boolean cerradoEnCierreZ;
    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;
    // 'vencido o vigente representa el estado de los presupuestos en el sistema, el campo puede ser nulo en otros tipos de comprobantes'
    private String vencido;

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

    public Set<PaymentMethod> getMediosPago() {
        return mediosPago;
    }

    public void setMediosPago(Set<PaymentMethod> mediosPago) {
        this.mediosPago = mediosPago;
    }

    public SalePoint getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(SalePoint puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    public CommercialDocument getDocumentoComercial() {
        return documentoComercial;
    }

    public void setDocumentoComercial(CommercialDocument documentoComercial) {
        this.documentoComercial = documentoComercial;
    }

    public Business getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Business empresa) {
        this.empresa = empresa;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Set<PaymentPlan> getPlanesPago() {
        return planesPago;
    }

    public void setPlanesPago(Set<PaymentPlan> planesPago) {
        this.planesPago = planesPago;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getCerrado() {
        return cerrado;
    }

    public void setCerrado(String cerrado) {
        this.cerrado = cerrado;
    }

    public double getIngresosBrutos() {
        return ingresosBrutos;
    }

    public void setIngresosBrutos(double ingresosBrutos) {
        this.ingresosBrutos = ingresosBrutos;
    }

    public ArrayList<Product> getProductosDetalle() {
        return productosDetalle;
    }

    public void setProductosDetalle(ArrayList<Product> productosDetalle) {
        this.productosDetalle = productosDetalle;
    }

    public ArrayList<ProductoDescription> getProductoDescription() {
        return productoDescription;
    }

    public void setProductoDescription(ArrayList<ProductoDescription> productoDescription) {
        this.productoDescription = productoDescription;
    }

    public boolean isCerradoEnCierreZ() {
        return cerradoEnCierreZ;
    }

    public void setCerradoEnCierreZ(boolean cerradoEnCierreZ) {
        this.cerradoEnCierreZ = cerradoEnCierreZ;
    }

    public Double getPorcentajeDescuentoGlobal() {
        return porcentajeDescuentoGlobal;
    }

    public void setPorcentajeDescuentoGlobal(Double porcentajeDescuentoGlobal) {
        this.porcentajeDescuentoGlobal = porcentajeDescuentoGlobal;
    }

    public Double getTotalDescuentoGlobal() {
        return totalDescuentoGlobal;
    }

    public void setTotalDescuentoGlobal(Double totalDescuentoGlobal) {
        this.totalDescuentoGlobal = totalDescuentoGlobal;
    }

    public Double getPorcentajeRecargoGlobal() {
        return porcentajeRecargoGlobal;
    }

    public void setPorcentajeRecargoGlobal(Double porcentajeRecargoGlobal) {
        this.porcentajeRecargoGlobal = porcentajeRecargoGlobal;
    }

    public Double getTotalRecargoGlobal() {
        return totalRecargoGlobal;
    }

    public void setTotalRecargoGlobal(Double totalRecargoGlobal) {
        this.totalRecargoGlobal = totalRecargoGlobal;
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

    public Double getPorcentajeRecargoPlan() {
        return porcentajeRecargoPlan;
    }

    public void setPorcentajeRecargoPlan(Double porcentajeRecargoPlan) {
        this.porcentajeRecargoPlan = porcentajeRecargoPlan;
    }

    public Double getTotalRecargoPlan() {
        return totalRecargoPlan;
    }

    public void setTotalRecargoPlan(Double totalRecargoPlan) {
        this.totalRecargoPlan = totalRecargoPlan;
    }

    public Double getPorcentajeDescuentoPlan() {
        return porcentajeDescuentoPlan;
    }

    public void setPorcentajeDescuentoPlan(Double porcentajeDescuentoPlan) {
        this.porcentajeDescuentoPlan = porcentajeDescuentoPlan;
    }

    public Double getTotalDescuentoPlan() {
        return totalDescuentoPlan;
    }

    public void setTotalDescuentoPlan(Double totalDescuentoPlan) {
        this.totalDescuentoPlan = totalDescuentoPlan;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getVencido() {
        return vencido;
    }

    public void setVencido(String vencido) {
        this.vencido = vencido;
    }

    public String getCorrelativoComprobante() {
        return correlativoComprobante;
    }

    public void setCorrelativoComprobante(String correlativoComprobante) {
        this.correlativoComprobante = correlativoComprobante;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", letra='" + letra + '\'' +
                ", numeroCbte='" + numeroCbte + '\'' +
                ", correlativoComprobante='" + correlativoComprobante + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", fechaVto='" + fechaVto + '\'' +
                ", condicionVenta=" + condicionVenta +
                ", logoUrl='" + logoUrl + '\'' +
                ", productos=" + productos +
                ", productosDetalle=" + productosDetalle +
                ", productoDescription=" + productoDescription +
                ", barCode='" + barCode + '\'' +
                ", cae='" + cae + '\'' +
                ", totalVenta=" + totalVenta +
                ", subTotal=" + subTotal +
                ", porcentajeDescuentoGlobal=" + porcentajeDescuentoGlobal +
                ", totalDescuentoGlobal=" + totalDescuentoGlobal +
                ", porcentajeRecargoGlobal=" + porcentajeRecargoGlobal +
                ", totalRecargoGlobal=" + totalRecargoGlobal +
                ", totalIva21=" + totalIva21 +
                ", totalIva10=" + totalIva10 +
                ", totalIva27=" + totalIva27 +
                ", porcentajeRecargoPlan=" + porcentajeRecargoPlan +
                ", totalRecargoPlan=" + totalRecargoPlan +
                ", porcentajeDescuentoPlan=" + porcentajeDescuentoPlan +
                ", totalDescuentoPlan=" + totalDescuentoPlan +
                ", ingresosBrutos=" + ingresosBrutos +
                ", nombreDocumento='" + nombreDocumento + '\'' +
                ", mediosPago=" + mediosPago +
                ", planesPago=" + planesPago +
                ", puntoVenta=" + puntoVenta +
                ", sucursal=" + sucursal +
                ", documentoComercial=" + documentoComercial +
                ", empresa=" + empresa +
                ", cliente=" + cliente +
                ", cerrado='" + cerrado + '\'' +
                ", cerradoEnCierreZ=" + cerradoEnCierreZ +
                ", fechaVencimiento=" + fechaVencimiento +
                ", vencido='" + vencido + '\'' +
                '}';
    }
}
