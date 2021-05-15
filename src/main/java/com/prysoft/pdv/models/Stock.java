package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stocks")
public class Stock implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product producto;
    @ManyToOne
    private Deposit deposito;
    @OneToOne
    CommercialBranch sucursal;
    private double cantidad;
    private String algorim;
    @Column(name = "cantidad_minima", nullable = true)
    private String cantidadMinima;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }

    public Deposit getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposit deposito) {
        this.deposito = deposito;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    public String getAlgorim() {
        return algorim;
    }

    public void setAlgorim(String algorim) {
        this.algorim = algorim;
    }

    public String getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(String cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", producto=" + producto +
                ", deposito=" + deposito +
                ", sucursal=" + sucursal +
                ", cantidad=" + cantidad +
                ", algorim='" + algorim + '\'' +
                ", cantidadMinima='" + cantidadMinima + '\'' +
                '}';
    }
}
