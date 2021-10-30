package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "venta_fast_config")
public class FastSaleConfig implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Client clientePorDefecto;
    @OneToOne
    private CommercialDocument documentoPorDefecto;
    @OneToOne
    private CommercialBranch sucursal;
    private boolean estado;

    public Client getClientePorDefecto() {
        return clientePorDefecto;
    }

    public void setClientePorDefecto(Client clientePorDefecto) {
        this.clientePorDefecto = clientePorDefecto;
    }

    public CommercialDocument getDocumentoPorDefecto() {
        return documentoPorDefecto;
    }

    public void setDocumentoPorDefecto(CommercialDocument documentoPorDefecto) {
        this.documentoPorDefecto = documentoPorDefecto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CommercialBranch getSucursal() {
        return sucursal;
    }

    public void setSucursal(CommercialBranch sucursal) {
        this.sucursal = sucursal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "FastSaleConfig{" +
                "id=" + id +
                ", clientePorDefecto=" + clientePorDefecto +
                ", documentoPorDefecto=" + documentoPorDefecto +
                ", sucursal=" + sucursal +
                ", estado=" + estado +
                '}';
    }
}
