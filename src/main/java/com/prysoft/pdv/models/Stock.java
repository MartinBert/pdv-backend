package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stocks")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Deposito deposito;

    @OneToOne Sucursal sucursal;

    private double cantidad;

    private String algorim;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public String getAlgorim() {
        return algorim;
    }

    public void setAlgorim(String algorim) {
        this.algorim = algorim;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", producto=" + producto +
                ", deposito=" + deposito +
                ", cantidad=" + cantidad +
                ", sucursal=" + sucursal +
                ", algorim=" + algorim +
                '}';
    }
}
