package com.prysoft.pdv.dto;

public class PaymentMethodFilter extends CommercialBranchFilter {
    private String medioPagoName;
    private boolean cuentacorriente;

    @Override
    public boolean isCuentacorriente() {
        return cuentacorriente;
    }

    @Override
    public void setCuentacorriente(boolean cuentacorriente) {
        this.cuentacorriente = cuentacorriente;
    }

    public String getMedioPagoName() {
        return medioPagoName;
    }

    public void setMedioPagoName(String medioPagoName) {
        this.medioPagoName = medioPagoName;
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String toString() {
        return "PaymentMethodFilter{" +
                "medioPagoName='" + medioPagoName + '\'' +
                ", cuentacorriente=" + cuentacorriente +
                '}';
    }
}
