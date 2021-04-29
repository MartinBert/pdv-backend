package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "propiedades")
public class Property implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "propiedades_atributos",
            joinColumns =  @JoinColumn(name = "id_propiedad"),
            inverseJoinColumns = @JoinColumn(name = "id_atributo"))
    private Set<Attribute> atributos;

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

    public Set<Attribute> getAtributos() {
        return atributos;
    }

    public void setAtributos(Set<Attribute> atributos) {
        this.atributos = atributos;
    }
}
