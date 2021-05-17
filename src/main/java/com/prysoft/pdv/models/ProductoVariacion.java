package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productos_variaciones")
public class ProductoVariacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;

    private double porcentaje;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Product producto;

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

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ProductoVariacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", porcentaje=" + porcentaje +
                ", producto=" + producto +
                '}';
    }
}
