package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "propiedades")
public class Propiedad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "propiedades_atributos",
            joinColumns =  @JoinColumn(name = "id_propiedad"),
            inverseJoinColumns = @JoinColumn(name = "id_atributo"))
    private Set<Atributo> atributos;

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

    public Set<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(Set<Atributo> atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", atributos=" + atributos +
                '}';
    }
}
