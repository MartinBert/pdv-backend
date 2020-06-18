package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "perfiles")
public class Perfil  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToMany(cascade= {CascadeType.MERGE})
    private Set<Modulo> modulos;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Set<Modulo> getModulos() { return modulos; }

    public void setModulos(Set<Modulo> modulos) { this.modulos = modulos; }
}
