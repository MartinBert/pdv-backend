package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="distribuidores")
public class Proveedor extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "proveedor_sucursal",
            joinColumns =  @JoinColumn(name = "id_proveedor"),
            inverseJoinColumns = @JoinColumn(name = "id_sucursal"))
    private Set<Sucursal> sucursales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", sucursales=" + sucursales +
                '}';
    }
}