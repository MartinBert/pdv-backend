package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="distribuidores")
public class Distribuidor extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}