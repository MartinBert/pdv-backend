package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "vendedores")
public class Seller extends Person implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vendedor_sucursal",
            joinColumns = @JoinColumn(name = "id_vendedor"),
            inverseJoinColumns = @JoinColumn(name = "id_sucursal"))
    private Set<CommercialBranch> sucursales;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<CommercialBranch> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<CommercialBranch> sucursales) {
        this.sucursales = sucursales;
    }

    @Override
    public String toString() {
        return "Seller{" +
            "id=" + id +
            ", sucursales=" + sucursales +
            '}';
    }
}
