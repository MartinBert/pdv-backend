package com.prysoft.pdv.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sucursales")
public class CommercialBranch  implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @OneToOne
    private FiscalCondition condicionIva; //1-Responsable Inscripto, 2-Monotributista
    private String email;
    private String telefono;
    private String telefonoAlternativo;
    private String nombreContacto;
    private String provincia;
    private String ciudad;
    private String logo;
    @Column(name = "fecha_inicio_act")
    private Date fechaInicioAct;
    @Column(name = "ing_bruto")
    private int ingBruto;
    @Column(name = "razon_social")
    private String razonSocial;
    @Column(name = "cuit")
    private String cuit;
    @OneToMany(mappedBy = "sucursal")
    private Set<SalePoint> puntosVenta;
    @OneToMany(mappedBy = "sucursales")
    @JsonBackReference(value = "depositos")
    private Set<Deposit> depositos;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "empresa_id", nullable = false)
    private Business empresa;
    @Column(name = "variacion_ganancia")
    private double variacionGanancia;

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

    public FiscalCondition getCondicionIva() {
        return condicionIva;
    }

    public void setCondicionIva(FiscalCondition condicionIva) {
        this.condicionIva = condicionIva;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoAlternativo() {
        return telefonoAlternativo;
    }

    public void setTelefonoAlternativo(String telefonoAlternativo) {
        this.telefonoAlternativo = telefonoAlternativo;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaInicioAct() {
        return fechaInicioAct;
    }

    public void setFechaInicioAct(Date fechaInicioAct) {
        this.fechaInicioAct = fechaInicioAct;
    }

    public int getIngBruto() {
        return ingBruto;
    }

    public void setIngBruto(int ingBruto) {
        this.ingBruto = ingBruto;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Set<SalePoint> getPuntosVenta() {
        return puntosVenta;
    }

    public void setPuntosVenta(Set<SalePoint> puntosVenta) {
        this.puntosVenta = puntosVenta;
    }

    public Set<Deposit> getDepositos() {
        return depositos;
    }

    public void setDepositos(Set<Deposit> depositos) {
        this.depositos = depositos;
    }

    public Business getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Business empresa) {
        this.empresa = empresa;
    }

    public double getVariacionGanancia() {
        return variacionGanancia;
    }

    public void setVariacionGanancia(double variacionGanancia) {
        this.variacionGanancia = variacionGanancia;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "CommercialBranch{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", condicionIva=" + condicionIva +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", telefonoAlternativo='" + telefonoAlternativo + '\'' +
                ", nombreContacto='" + nombreContacto + '\'' +
                ", provincia='" + provincia + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", logo='" + logo + '\'' +
                ", fechaInicioAct=" + fechaInicioAct +
                ", ingBruto=" + ingBruto +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit='" + cuit + '\'' +
                ", variacionGanancia=" + variacionGanancia +
                '}';
    }
}
