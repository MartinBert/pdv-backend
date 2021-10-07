package com.prysoft.pdv.dto;

import org.springframework.stereotype.Service;

@Service
public class PrintFilter extends PageFilter{

    private Long id;
    private String valor;
    private String nombreImpresora;


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

    public String getNombreImpresora() {
        return nombreImpresora;
    }

    public void setNombreImpresora(String nombreImpresora) {
        this.nombreImpresora = nombreImpresora;
    }

    @Override
    public String toString() {
        return "Print{" +
                "id=" + id +
                ", valor='" + valor + '\'' +
                ", nombreImpresora='" + nombreImpresora + '\'' +
                '}';
    }
}
