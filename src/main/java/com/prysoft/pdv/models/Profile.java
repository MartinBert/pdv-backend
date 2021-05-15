package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "perfiles")
public class Profile implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;

    @ManyToMany(cascade = {CascadeType.MERGE})
    private Set<Module> modulos;

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

    public Set<Module> getModulos() {
        return modulos;
    }

    public void setModulos(Set<Module> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", modulos=" + modulos +
                '}';
    }
}
