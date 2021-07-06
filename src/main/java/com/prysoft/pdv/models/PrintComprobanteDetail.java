package com.prysoft.pdv.models;

import java.io.Serializable;

public class PrintComprobanteDetail implements Serializable {
    private static final long serialVersionUID = 6840527842564211059L;

    private String nombre;
    private String codigoBarra;
    private String cantUnidades;
    private double precioUnitario;
    private double precioTotal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantUnidades() {
        return cantUnidades;
    }

    public void setCantUnidades(String cantUnidades) {
        this.cantUnidades = cantUnidades;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public String toString() {
        return "PrintComprobanteDetail{" +
                "nombre='" + nombre + '\'' +
                ", codigoBarra='" + codigoBarra + '\'' +
                ", cantUnidades='" + cantUnidades + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
