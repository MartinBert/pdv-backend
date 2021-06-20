package com.prysoft.pdv.print;

import java.io.Serializable;

public class DetailOfPaymentMethodsForPrintInZClosure implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    private String paymentMethodName;
    private Double total;
    private Double importeTotalIva;
    private Double totalIva21;
    private Double totalIva10;
    private Double totalIva27;

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
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

    @Override
    public String toString() {
        return "DetailOfPaymentMethodsForPrintInZClosure{" +
                "paymentMethodName='" + paymentMethodName + '\'' +
                ", total=" + total +
                ", importeTotalIva=" + importeTotalIva +
                ", totalIva21=" + totalIva21 +
                ", totalIva10=" + totalIva10 +
                ", totalIva27=" + totalIva27 +
                '}';
    }
}
