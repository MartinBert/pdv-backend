package com.prysoft.pdv.dto;

public class PlanPagoFilter extends SucursalFilter{
    private String planPagoName;

    public String getPlanPagoName() {
        return planPagoName;
    }

    public void setPlanPagoName(String planPagoName) {
        this.planPagoName = planPagoName;
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
        return "PlanPagoFilter{" +
                "planPagoName='" + planPagoName + '\'' +
                '}';
    }
}
