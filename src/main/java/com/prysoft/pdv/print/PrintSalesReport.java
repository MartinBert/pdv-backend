package com.prysoft.pdv.print;

import java.io.Serializable;

public class PrintSalesReport implements Serializable {
    private String fechaEmision;
    private String nombreDocumento;
    private String cliente;
    private String puntoVenta;
    private String medioPago;
    private double totalVenta;

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(String puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "PrintSalesReport{" +
                "fechaEmision='" + fechaEmision + '\'' +
                ", nombreDocumento='" + nombreDocumento + '\'' +
                ", cliente='" + cliente + '\'' +
                ", puntoVenta='" + puntoVenta + '\'' +
                ", medioPago='" + medioPago + '\'' +
                ", totalVenta=" + totalVenta +
                '}';
    }
}
