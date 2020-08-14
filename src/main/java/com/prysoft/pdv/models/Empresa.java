package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "empresas")
public class Empresa extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "empresa")
    private Set<PuntoVenta> puntosVenta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<PuntoVenta> getPuntosVenta() {
        return puntosVenta;
    }

    public void setPuntosVenta(Set<PuntoVenta> puntosVenta) {
        this.puntosVenta = puntosVenta;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", puntosVenta=" + puntosVenta +
                '}';
    }
}
