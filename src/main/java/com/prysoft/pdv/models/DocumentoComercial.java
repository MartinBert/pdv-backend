package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "documentos_comerciales")
public class DocumentoComercial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String codigoDocumento;
    private String letra;
    private boolean tipo;
    private int ivaCat;
    private boolean activo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getIvaCat() {
        return ivaCat;
    }

    public void setIvaCat(int ivaCat) {
        this.ivaCat = ivaCat;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "DocumentoComercial{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigoDocumento='" + codigoDocumento + '\'' +
                ", letra='" + letra + '\'' +
                ", tipo=" + tipo +
                ", ivaCat=" + ivaCat +
                ", activo=" + activo +
                '}';
    }
}
