package com.prysoft.pdv.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "codigo_barra", nullable = false, unique = true)
    private String codigoBarra;
    @Column(name = "codigo_producto", nullable = false)
    private String codigoProducto;
    private double precioCosto;
    private int propiedad;
    private double ivaVenta;
    private double costoBruto;
    private double ivaCompra;
    private double costoNeto;
    private double ganancia;
    private double precioSinIva;
    private int estado;
    private double precioTotal;
    @Column(name = "editable", columnDefinition = "boolean default false")
    private boolean editable;
    @OneToOne
    private Marca marca;
    @OneToOne
    private Iva ivaComprasObject;
    @OneToOne
    private Iva ivaVentasObject;
    @OneToMany(mappedBy = "producto")
    private Set<ProductoVariacion> variaciones;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "productos_distribuidores",
            joinColumns = @JoinColumn(name = "id_producto"),
            inverseJoinColumns = @JoinColumn(name = "id_distribuidor"))
    private Set<Proveedor> distribuidores;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "productos_depositos",
            joinColumns = @JoinColumn(name = "id_producto"),
            inverseJoinColumns = @JoinColumn(name = "id_deposito"))
    private Set<Deposito> depositos;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "productos_propiedades",
            joinColumns = @JoinColumn(name = "id_producto"),
            inverseJoinColumns = @JoinColumn(name = "id_propiedad"))
    private Set<Propiedad> propiedades;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "productos_atributos",
            joinColumns = @JoinColumn(name = "id_producto"),
            inverseJoinColumns = @JoinColumn(name = "id_atributo"))
    private Set<Atributo> atributos;
    @OneToMany(mappedBy = "producto")
    @JsonBackReference
    private Set<Stock> stocks;
    @OneToOne
    private Rubro rubro;

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

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(int propiedad) {
        this.propiedad = propiedad;
    }

    public double getIvaVenta() {
        return ivaVenta;
    }

    public void setIvaVenta(double ivaVenta) {
        this.ivaVenta = ivaVenta;
    }

    public double getCostoBruto() {
        return costoBruto;
    }

    public void setCostoBruto(double costoBruto) {
        this.costoBruto = costoBruto;
    }

    public double getIvaCompra() {
        return ivaCompra;
    }

    public void setIvaCompra(double ivaCompra) {
        this.ivaCompra = ivaCompra;
    }

    public double getCostoNeto() {
        return costoNeto;
    }

    public void setCostoNeto(double costoNeto) {
        this.costoNeto = costoNeto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Iva getIvaComprasObject() {
        return ivaComprasObject;
    }

    public void setIvaComprasObject(Iva ivaComprasObject) {
        this.ivaComprasObject = ivaComprasObject;
    }

    public Iva getIvaVentasObject() {
        return ivaVentasObject;
    }

    public void setIvaVentasObject(Iva ivaVentasObject) {
        this.ivaVentasObject = ivaVentasObject;
    }

    public Set<ProductoVariacion> getVariaciones() {
        return variaciones;
    }

    public void setVariaciones(Set<ProductoVariacion> variaciones) {
        this.variaciones = variaciones;
    }

    public Set<Proveedor> getDistribuidores() {
        return distribuidores;
    }

    public void setDistribuidores(Set<Proveedor> distribuidores) {
        this.distribuidores = distribuidores;
    }

    public Set<Deposito> getDepositos() {
        return depositos;
    }

    public void setDepositos(Set<Deposito> depositos) {
        this.depositos = depositos;
    }

    public Set<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Set<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public Set<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(Set<Atributo> atributos) {
        this.atributos = atributos;
    }

    public Set<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigoBarra='" + codigoBarra + '\'' +
                ", codigoProducto='" + codigoProducto + '\'' +
                ", precioCosto=" + precioCosto +
                ", propiedad=" + propiedad +
                ", ivaVenta=" + ivaVenta +
                ", costoBruto=" + costoBruto +
                ", ivaCompra=" + ivaCompra +
                ", costoNeto=" + costoNeto +
                ", ganancia=" + ganancia +
                ", precioSinIva=" + precioSinIva +
                ", estado=" + estado +
                ", precioTotal=" + precioTotal +
                ", editable=" + editable +
                ", marca=" + marca +
                ", ivaComprasObject=" + ivaComprasObject +
                ", ivaVentasObject=" + ivaVentasObject +
                ", variaciones=" + variaciones +
                ", distribuidores=" + distribuidores +
                ", depositos=" + depositos +
                ", propiedades=" + propiedades +
                ", atributos=" + atributos +
                ", stocks=" + stocks +
                ", rubro=" + rubro +
                '}';
    }
}
