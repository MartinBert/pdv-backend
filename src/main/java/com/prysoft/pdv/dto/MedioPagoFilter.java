package com.prysoft.pdv.dto;

public class MedioPagoFilter extends SucursalFilter {
    private String medioPagoName;

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
        return "MedioPagoFilter{" +
                "medioPagoName='" + medioPagoName + '\'' +
                '}';
    }
}
