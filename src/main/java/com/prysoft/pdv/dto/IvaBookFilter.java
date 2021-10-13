package com.prysoft.pdv.dto;

public class IvaBookFilter extends CommercialBranchFilter {
    private boolean facturaA;
    private boolean facturaB;
    private boolean facturaC;
    private boolean notaDebitoA;
    private boolean notaDebitoB;
    private boolean notaCreditoA;
    private boolean notaCreditoB;
    private String fechaDesdeString;
    private String fechaHastaString;

    public boolean isFacturaA() {
        return facturaA;
    }

    public void setFacturaA(boolean facturaA) {
        this.facturaA = facturaA;
    }

    public boolean isFacturaB() {
        return facturaB;
    }

    public void setFacturaB(boolean facturaB) {
        this.facturaB = facturaB;
    }

    public boolean isFacturaC() {
        return facturaC;
    }

    public boolean isNotaDebitoA() {
        return notaDebitoA;
    }

    public void setNotaDebitoA(boolean notaDebitoA) {
        this.notaDebitoA = notaDebitoA;
    }

    public boolean isNotaDebitoB() {
        return notaDebitoB;
    }

    public void setNotaDebitoB(boolean notaDebitoB) {
        this.notaDebitoB = notaDebitoB;
    }

    public boolean isNotaCreditoA() {
        return notaCreditoA;
    }

    public void setNotaCreditoA(boolean notaCreditoA) {
        this.notaCreditoA = notaCreditoA;
    }

    public boolean isNotaCreditoB() {
        return notaCreditoB;
    }

    public void setNotaCreditoB(boolean notaCreditoB) {
        this.notaCreditoB = notaCreditoB;
    }

    public void setFacturaC(boolean facturaC) {
        this.facturaC = facturaC;
    }

    public String getFechaDesdeString() {
        return fechaDesdeString;
    }

    public void setFechaDesdeString(String fechaDesdeString) {
        this.fechaDesdeString = fechaDesdeString;
    }

    public String getFechaHastaString() {
        return fechaHastaString;
    }

    public void setFechaHastaString(String fechaHastaString) {
        this.fechaHastaString = fechaHastaString;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("IvaBookFilter{");
        sb.append("facturaA=").append(facturaA);
        sb.append(", facturaB=").append(facturaB);
        sb.append(", facturaC=").append(facturaC);
        sb.append(", notaDebitoA=").append(notaDebitoA);
        sb.append(", notaDebitoB=").append(notaDebitoB);
        sb.append(", notaCreditoA=").append(notaCreditoA);
        sb.append(", notaCreditoB=").append(notaCreditoB);
        sb.append(", fechaDesdeString='").append(fechaDesdeString).append('\'');
        sb.append(", fechaHastaString='").append(fechaHastaString).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
