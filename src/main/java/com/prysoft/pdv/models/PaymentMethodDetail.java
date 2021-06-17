package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalles_medios_pago")
public class PaymentMethodDetail implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private PaymentMethod medioPago;
    private Double total;
    private Double importeTotalIva;
    private Double totalIva21;
    private Double totalIva10;
    private Double totalIva27;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentMethod getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(PaymentMethod medioPago) {
        this.medioPago = medioPago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getImporteTotalIva() {
        return importeTotalIva;
    }

    public void setImporteTotalIva(Double importeTotalIva) {
        this.importeTotalIva = importeTotalIva;
    }

    public Double getTotalIva21() {
        return totalIva21;
    }

    public void setTotalIva21(Double totalIva21) {
        this.totalIva21 = totalIva21;
    }

    public Double getTotalIva10() {
        return totalIva10;
    }

    public void setTotalIva10(Double totalIva10) {
        this.totalIva10 = totalIva10;
    }

    public Double getTotalIva27() {
        return totalIva27;
    }

    public void setTotalIva27(Double totalIva27) {
        this.totalIva27 = totalIva27;
    }
}
