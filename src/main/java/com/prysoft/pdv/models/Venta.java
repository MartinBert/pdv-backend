package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="ventas")
public class Venta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ventas_productos",
            joinColumns =  @JoinColumn(name = "id_venta"),
            inverseJoinColumns = @JoinColumn(name = "id_producto"))
    private Set<Producto> productos;

    @OneToOne
    private Cliente cliente;

    private int cantidadUnidades;

    @OneToOne
    private DocumentoComercial documento;

    @OneToMany(mappedBy = "venta")
    private Set<MedioPago> mediosPago;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
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

    public Set<MedioPago> getMediosPago() {
        return mediosPago;
    }

    public void setMediosPago(Set<MedioPago> mediosPago) {
        this.mediosPago = mediosPago;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", productos=" + productos +
                ", cliente=" + cliente +
                ", cantidadUnidades=" + cantidadUnidades +
                ", documento=" + documento +
                ", mediosPago=" + mediosPago +
                '}';
    }
}

