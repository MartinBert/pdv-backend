package com.prysoft.pdv.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "condiciones_iva")
public class CondicionIva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    @OneToMany(mappedBy="documento")
    private Set<DocumentoComercial> idDocumento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Set<DocumentoComercial> getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Set<DocumentoComercial> idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Override
    public String toString() {
        return "CondicionIva{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

