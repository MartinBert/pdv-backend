package com.prysoft.pdv.models;

import java.io.Serializable;
import java.util.ArrayList;

public class PrintComprobante implements Serializable {
    private String barCode;
    private String cae;
    private String fechaEmision;
    private String fechaVto;
    private String clienteCondicionIva;
    private String clienteCuit;
    private String clienteDireccion;
    private String clienteRazonSocial;
    private boolean condicionVenta;
    private String letra;
    private String numeroCbte;
    private int idPuntoVenta;
    private String empresaCondicionIva;
    private String empresaCuit;
    private String empresaDireccion;
    private String empresaRazonSocial;
    private String empresaFechaInicioAct;
    private int empresaIngBruto;
    private String empresaTelefono;
    private ArrayList<PrintComprobanteDetail> productos;
    private Double totalVenta;

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

    public String getClienteCondicionIva() {
        return clienteCondicionIva;
    }

    public void setClienteCondicionIva(String clienteCondicionIva) {
        this.clienteCondicionIva = clienteCondicionIva;
    }

    public String getClienteCuit() {
        return clienteCuit;
    }

    public void setClienteCuit(String clienteCuit) {
        this.clienteCuit = clienteCuit;
    }

    public String getClienteDireccion() {
        return clienteDireccion;
    }

    public void setClienteDireccion(String clienteDireccion) {
        this.clienteDireccion = clienteDireccion;
    }

    public String getClienteRazonSocial() {
        return clienteRazonSocial;
    }

    public void setClienteRazonSocial(String clienteRazonSocial) {
        this.clienteRazonSocial = clienteRazonSocial;
    }

    public boolean isCondicionVenta() {
        return condicionVenta;
    }

    public void setCondicionVenta(boolean condicionVenta) {
        this.condicionVenta = condicionVenta;
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

    public int getIdPuntoVenta() {
        return idPuntoVenta;
    }

    public void setIdPuntoVenta(int idPuntoVenta) {
        this.idPuntoVenta = idPuntoVenta;
    }

    public String getEmpresaCondicionIva() {
        return empresaCondicionIva;
    }

    public void setEmpresaCondicionIva(String empresaCondicionIva) {
        this.empresaCondicionIva = empresaCondicionIva;
    }

    public String getEmpresaCuit() {
        return empresaCuit;
    }

    public void setEmpresaCuit(String empresaCuit) {
        this.empresaCuit = empresaCuit;
    }

    public String getEmpresaDireccion() {
        return empresaDireccion;
    }

    public void setEmpresaDireccion(String empresaDireccion) {
        this.empresaDireccion = empresaDireccion;
    }

    public String getEmpresaRazonSocial() {
        return empresaRazonSocial;
    }

    public void setEmpresaRazonSocial(String empresaRazonSocial) {
        this.empresaRazonSocial = empresaRazonSocial;
    }

    public String getEmpresaFechaInicioAct() {
        return empresaFechaInicioAct;
    }

    public void setEmpresaFechaInicioAct(String empresaFechaInicioAct) {
        this.empresaFechaInicioAct = empresaFechaInicioAct;
    }

    public String getEmpresaTelefono() {
        return empresaTelefono;
    }

    public void setEmpresaTelefono(String empresaTelefono) {
        this.empresaTelefono = empresaTelefono;
    }

    public ArrayList<PrintComprobanteDetail> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<PrintComprobanteDetail> productos) {
        this.productos = productos;
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

    public int getEmpresaIngBruto() {
        return empresaIngBruto;
    }

    public void setEmpresaIngBruto(int empresaIngBruto) {
        this.empresaIngBruto = empresaIngBruto;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "PrintComprobante{" +
                "barCode='" + barCode + '\'' +
                ", cae='" + cae + '\'' +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", fechaVto='" + fechaVto + '\'' +
                ", clienteCondicionIva='" + clienteCondicionIva + '\'' +
                ", clienteCuit='" + clienteCuit + '\'' +
                ", clienteDireccion='" + clienteDireccion + '\'' +
                ", clienteRazonSocial='" + clienteRazonSocial + '\'' +
                ", condicionVenta=" + condicionVenta +
                ", letra='" + letra + '\'' +
                ", numeroCbte='" + numeroCbte + '\'' +
                ", idPuntoVenta=" + idPuntoVenta +
                ", empresaCondicionIva='" + empresaCondicionIva + '\'' +
                ", empresaCuit='" + empresaCuit + '\'' +
                ", empresaDireccion='" + empresaDireccion + '\'' +
                ", empresaRazonSocial='" + empresaRazonSocial + '\'' +
                ", empresaFechaInicioAct=" + empresaFechaInicioAct +
                ", empresaIngBruto=" + empresaIngBruto +
                ", empresaTelefono='" + empresaTelefono + '\'' +
                ", productos=" + productos + '\'' +
                ", totalVenta=" + totalVenta +
                '}';
    }
}
