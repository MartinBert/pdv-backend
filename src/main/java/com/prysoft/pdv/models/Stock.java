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
    @Column(name = "cantidad_minima")
    private String cantidadMinima;
    @Column(name = "activo", columnDefinition = "boolean default true")
    private boolean activo;

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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stock{");
        sb.append("id=").append(id);
        sb.append(", producto=").append(producto);
        sb.append(", deposito=").append(deposito);
        sb.append(", sucursal=").append(sucursal);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", algorim='").append(algorim).append('\'');
        sb.append(", cantidadMinima='").append(cantidadMinima).append('\'');
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }
}
