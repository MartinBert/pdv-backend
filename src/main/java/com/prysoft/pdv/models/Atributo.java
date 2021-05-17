package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "atributos")
public class Atributo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String valor;
    private double valorNumerico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public double getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(double valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    @Override
    public String toString() {
        return "Atributo{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                ", valorNumerico=" + valorNumerico +
                '}';
    }
}
