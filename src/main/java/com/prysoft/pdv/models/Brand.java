package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "marcas")
public class Brand implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", unique = true, nullable = false)
    private String nombre;
    @Column(name = "estado", columnDefinition = "boolean default true")
    private Boolean estado;

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

    public Boolean getEstado() {
      return estado;
   }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Brand{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
