package com.prysoft.pdv.models;

import javax.persistence.*;

@Entity
@Table(name = "documentos_comerciales")
public class DocumentoComercial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private boolean tipo; //1 fiscal, 2 no-fiscal
    private boolean activo;
    @ManyToOne
    @JoinColumn(name = "idDocumento", nullable = false)
    private DocumentoComercial documento;

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

    public DocumentoComercial getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentoComercial documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "DocumentoComercial{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", activo=" + activo +
                ", documento=" + documento +
                '}';
    }
}
