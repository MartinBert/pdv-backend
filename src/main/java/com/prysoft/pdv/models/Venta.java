package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ventas")
public class Venta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="producto_id", nullable=false)
    private Producto ventap;

    @OneToOne
    private Cliente cliente;

    private int cantidadUnidades;

    @OneToOne
    private DocumentoComercial documento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getVentap() {
        return ventap;
    }

    public void setVentap(Producto ventap) {
        this.ventap = ventap;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public DocumentoComercial getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentoComercial documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", ventap=" + ventap +
                ", cliente=" + cliente +
                ", cantidadUnidades=" + cantidadUnidades +
                ", documento=" + documento +
                '}';
    }
}

