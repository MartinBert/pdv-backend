package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name="devoluciones")
public class Devolucion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private String descripcion;
    private double totalDevolucion;
    private ArrayList<PrintComprobanteDetail> productos;
    private ArrayList<PrintComprobanteDetail> productosSalientes;
    @OneToOne
    private Invoice comprobante;
    @OneToOne
    private Empresa empresa;
    @OneToOne
    private Sucursal sucursal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Invoice getComprobante() {
        return comprobante;
    }

    public void setComprobante(Invoice comprobante) {
        this.comprobante = comprobante;
    }

    public ArrayList<PrintComprobanteDetail> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<PrintComprobanteDetail> productos) {
        this.productos = productos;
    }

    public ArrayList<PrintComprobanteDetail> getProductosSalientes() {
        return productosSalientes;
    }

    public void setProductosSalientes(ArrayList<PrintComprobanteDetail> productosSalientes) {
        this.productosSalientes = productosSalientes;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public double getTotalDevolucion() {
        return totalDevolucion;
    }

    public void setTotalDevolucion(double totalDevolucion) {
        this.totalDevolucion = totalDevolucion;
    }

    @Override
    public String toString() {
        return "Devolucion{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", totalDevolucion=" + totalDevolucion +
                ", productos=" + productos +
                ", productosSalientes=" + productosSalientes +
                ", comprobante=" + comprobante +
                ", empresa=" + empresa +
                ", sucursal=" + sucursal +
                '}';
    }
}
