package com.prysoft.pdv.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "condiciones_fiscales")
public class CondicionFiscal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipoDocumento;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "condiciones_documentos",
            joinColumns =  @JoinColumn(name = "id_condicion"),
            inverseJoinColumns = @JoinColumn(name = "id_documento"))
    private Set<DocumentoComercial> documentos;

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

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Set<DocumentoComercial> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<DocumentoComercial> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return "CondicionFiscal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", documentos=" + documentos +
                '}';
    }
}
