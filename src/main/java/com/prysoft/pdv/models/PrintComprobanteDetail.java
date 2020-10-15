package com.prysoft.pdv.models;

import java.io.Serializable;

public class PrintComprobanteDetail implements Serializable {
    private String nombre;
    private String cantUnidades;
    private double precioUnitario;
    private double precioTotal;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getCantUnidades() {return cantUnidades;}
    public void setCantUnidades(String cantUnidades) {this.cantUnidades = cantUnidades;}
    public double getPrecioUnitario() { return precioUnitario;}
    public void setPrecioUnitario(double precioUnitario) {this.precioUnitario = precioUnitario;}
    public double getPrecioTotal() {return precioTotal;}
    public void setPrecioTotal(double precioTotal) {this.precioTotal = precioTotal;}

    @Override
    public String toString() {
        return "PrintComprobanteDetail{" +
                "nombre='" + nombre + '\'' +
                ", cantUnidades='" + cantUnidades + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", precioTotal=" + precioTotal +
                '}';
    }
}
