package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "comprobantes_fiscales")
public class ComprobanteFiscal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String letra;
    private int numeroCbte;
    private Date fechaEmision;
    private Date fechaVto;
    private Boolean condicionVenta;
    private ArrayList<Producto> productos;
    private int barCode;
    private int cae;

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

    public int getNumeroCbte() {
        return numeroCbte;
    }

    public void setNumeroCbte(int numeroCbte) {
        this.numeroCbte = numeroCbte;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(Date fechaVto) {
        this.fechaVto = fechaVto;
    }

    public Boolean getCondicionVenta() {
        return condicionVenta;
    }

    public void setCondicionVenta(Boolean condicionVenta) {
        this.condicionVenta = condicionVenta;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getCae() {
        return cae;
    }

    public void setCae(int cae) {
        this.cae = cae;
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

    @Override
    public String toString() {
        return "ComprobanteFiscal{" +
                "id=" + id +
                ", letra='" + letra + '\'' +
                ", numeroCbte=" + numeroCbte +
                ", fechaEmision=" + fechaEmision +
                ", fechaVto=" + fechaVto +
                ", condicionVenta=" + condicionVenta +
                ", productos=" + productos +
                ", barCode=" + barCode +
                ", cae=" + cae +
                ", puntoVenta=" + puntoVenta +
                ", sucursal=" + sucursal +
                ", documentoComercial=" + documentoComercial +
                ", empresa=" + empresa +
                ", cliente=" + cliente +
                '}';
    }
}
