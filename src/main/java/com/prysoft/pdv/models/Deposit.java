package com.prysoft.pdv.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "depositos")
public class Deposit implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;
    @Column(name = "direccion", unique = true, nullable = false)
    private String direccion;
    @ManyToOne
    private CommercialBranch sucursales;
    private String telefono;
    @OneToMany(mappedBy = "deposito")
    @JsonBackReference
    private Set<Stock> stock;
    private String defaultDeposit;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CommercialBranch getSucursales() {
        return sucursales;
    }

    public void setSucursales(CommercialBranch sucursales) {
        this.sucursales = sucursales;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Set<Stock> getStock() {
        return stock;
    }

    public void setStock(Set<Stock> stock) {
        this.stock = stock;
    }

    public String getDefaultDeposit() {
        return defaultDeposit;
    }

    public void setDefaultDeposit(String defaultDeposit) {
        this.defaultDeposit = defaultDeposit;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", sucursales=" + sucursales +
                ", telefono='" + telefono + '\'' +
                ", stock=" + stock +
                ", defaultDeposit='" + defaultDeposit + '\'' +
                '}';
    }
}
