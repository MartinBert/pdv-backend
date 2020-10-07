package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class Persona implements Serializable {

    private int tipoPersona; //1-Fisica , 2-Juridica

    @OneToOne
    private CondicionFiscal condicionIva; //1-Responsable Inscripto, 2-Monotributista, 3-Consumidor Final

    private String nombre;
    private String razonSocial;
    private String cuit;
    private String direccion;
    private String email;
    private String telefono;
    private String telefonoAlternativo;
    private String nombreContacto;
    private String pais;
    private String estado;
    private String region;
    public Persona(){

    }

    public Persona(int tipoPersona, CondicionFiscal condicionIva,
                   String nombre, String razonSocial,
                   String cuit, String direccion,
                   String email, String telefono,
                   String telefonoAlternativo, String nombreContacto,
                   String pais, String estado, String region)
    {
        this.tipoPersona = tipoPersona;
        this.condicionIva = condicionIva;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.telefonoAlternativo = telefonoAlternativo;
        this.nombreContacto = nombreContacto;
        this.pais = pais;
        this.estado = estado;
        this.region = region;
    }

    @Column(name="tipoPersona", nullable = false)
    public int getTipoPersona() {
        return this.tipoPersona;
    }

    public void setTipoPersona(int tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    @Column(name="condicionIva", unique = true, nullable = false)
    public CondicionFiscal getCondicionIva() {
        return this.condicionIva;
    }

    public void setCondicionIva(CondicionFiscal condicionIva) {
        this.condicionIva = condicionIva;
    }

    @Column(name="nombre", nullable = false)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="razonSocial", nullable = false)
    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Column(name="cuit", nullable = false, unique = true)
    public String getCuit() {
        return this.cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    @Column(name="direccion", unique = true)
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name="email", unique = true)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="telefono")
    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Column(name="telefonoAlternativo")
    public String getTelefonoAlternativo() {
        return this.telefonoAlternativo;
    }

    public void setTelefonoAlternativo(String telefonoAlternativo) {
        this.telefonoAlternativo = telefonoAlternativo;
    }

    @Column(name="nombreContacto")
    public String getNombreContacto() {
        return this.nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    @Column(name="pais")
    public String getNombrePais() {
        return this.pais;
    }

    public void setNombrePais(String pais) {
        this.pais = pais;
    }

    @Column(name="estado")
    public String getNombreEstado() {
        return this.estado;
    }

    public void setNombreEstado(String estado) {
        this.estado = estado;
    }

    @Column(name="region")
    public String getNombreRegion() {
        return this.region;
    }

    public void setNombreRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "tipoPersona=" + tipoPersona +
                ", condicionIva=" + condicionIva +
                ", nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuit='" + cuit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", telefonoAlternativo='" + telefonoAlternativo + '\'' +
                ", nombreContacto='" + nombreContacto + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
