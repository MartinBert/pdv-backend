package com.prysoft.pdv.dto;

public class CashBoxFilter extends CommercialBranchFilter {
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
        return "CashBoxFilter{" +
                "fecha='" + fecha + '\'' +
                '}';
    }
}
