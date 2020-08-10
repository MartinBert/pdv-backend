package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empresas")
public class Empresa extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                '}';
    }
}
