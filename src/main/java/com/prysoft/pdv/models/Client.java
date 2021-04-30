package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "clientes")
public class Client extends Persona implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cliente_sucursal",
            joinColumns = @JoinColumn(name = "id_cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_sucursal"))
    private Set<Sucursal> sucursales;
    @Column(name = "alic_ing_brutos", columnDefinition = "Decimal(10,2) default 0.00")
    private double alicIngBrutos;

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

    public double getAlicIngBrutos() {
        return alicIngBrutos;
    }

    public void setAlicIngBrutos(double alicIngBrutos) {
        this.alicIngBrutos = alicIngBrutos;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", sucursales=" + sucursales +
                ", alicIngBrutos=" + alicIngBrutos +
                '}';
    }
}
