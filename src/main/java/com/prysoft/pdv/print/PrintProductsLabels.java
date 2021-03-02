package com.prysoft.pdv.print;

import java.io.Serializable;

public class PrintProductsLabels implements Serializable {
    private String nombre;
    private String codigoBarra;
    private String attributes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "PrintProductsLabels{" +
                "nombre='" + nombre + '\'' +
                ", codigoBarra='" + codigoBarra + '\'' +
                ", atributes='" + attributes + '\'' +
                '}';
    }
}
