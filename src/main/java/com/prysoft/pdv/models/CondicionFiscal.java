package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Table
@Entity(name = "condiciones_fiscales")
public class CondicionFiscal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "condiciones_documentos",
            joinColumns = @JoinColumn(name = "id_condicion"),
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
                ", documentos=" + documentos +
                '}';
    }
}
