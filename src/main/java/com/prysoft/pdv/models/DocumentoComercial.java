package com.prysoft.pdv.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "documentos_comerciales")
public class DocumentoComercial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String codigoDocumento;
    private boolean tipo;
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

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
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
                ", tipo=" + tipo +
                ", activo=" + activo +
                '}';
    }
}
