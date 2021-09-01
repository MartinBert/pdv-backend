package com.prysoft.pdv.dto;

public class SaleFilter extends CommercialBranchFilter {
    private String fechaEmision;
    private String comprobanteCerrado;
    private String numeroComprobante;
    private Long blackReceiptFilter;
    private boolean validityStatus;
    private boolean facturaA;
    private boolean facturaB;
    private boolean facturaC;
    private double totalVenta;

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getComprobanteCerrado() {
        return comprobanteCerrado;
    }

    public void setComprobanteCerrado(String comprobanteCerrado) {
        this.comprobanteCerrado = comprobanteCerrado;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public Long getBlackReceiptFilter() {
        return blackReceiptFilter;
    }

    public void setBlackReceiptFilter(Long blackReceiptFilter) {
        this.blackReceiptFilter = blackReceiptFilter;
    }

    public boolean isValidityStatus() {
        return validityStatus;
    }

    public void setValidityStatus(boolean validityStatus) {
        this.validityStatus = validityStatus;
    }

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

    public void setFacturaC(boolean facturaC) {
        this.facturaC = facturaC;
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public void setSucursalId(Long sucursalId) {
        super.setSucursalId(sucursalId);
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
    public String getOrder() {
        return super.getOrder();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SaleFilter{");
        sb.append("fechaEmision='").append(fechaEmision).append('\'');
        sb.append(", comprobanteCerrado='").append(comprobanteCerrado).append('\'');
        sb.append(", numeroComprobante='").append(numeroComprobante).append('\'');
        sb.append(", blackReceiptFilter=").append(blackReceiptFilter);
        sb.append(", validityStatus=").append(validityStatus);
        sb.append(", facturaA=").append(facturaA);
        sb.append(", facturaB=").append(facturaB);
        sb.append(", facturaC=").append(facturaC);
        sb.append(", totalVenta=").append(totalVenta);
        sb.append("} AND PARENT OBJECT ");
        sb.append(super.toString());
        return sb.toString();
    }
}
