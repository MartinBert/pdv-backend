package com.prysoft.pdv.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "usuarios")
public class User implements UserDetails, Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;
    private String username;
    private String password;
    @OneToOne
    @JoinColumn(name = "perfil_id")
    private Profile perfil;
    @OneToOne
    @JoinColumn(name = "empresa_id")
    private Business empresa;
    @OneToOne
    @JoinColumn(name = "sucursal_id")
    private CommercialBranch sucursal;
    @OneToOne
    @JoinColumn(name = "punto_venta_id")
    private SalePoint puntoVenta;

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

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getPerfil() {
        return perfil;
    }

    public void setPerfil(Profile perfil) {
        this.perfil = perfil;
    }

    public Business getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Business empresa) {
        this.empresa = empresa;
    }

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    public SalePoint getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(SalePoint puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", perfil=" + perfil +
                ", empresa=" + empresa +
                ", sucursal=" + sucursal +
                ", puntoVenta=" + puntoVenta +
                '}';
    }

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
