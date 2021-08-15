package com.prysoft.pdv.dto;

public class SaleFilter extends CommercialBranchFilter {
    private String fechaEmision;
    private String comprobanteCerrado;
    private String numeroComprobante;
    private Long blackReceiptFilter;
    private boolean validityStatus;
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
        return "SaleFilter{" +
                "fechaEmision='" + fechaEmision + '\'' +
                ", comprobanteCerrado='" + comprobanteCerrado + '\'' +
                ", numeroComprobante='" + numeroComprobante + '\'' +
                ", blackReceiptFilter=" + blackReceiptFilter +
                ", validityStatus=" + validityStatus +
                ", totalVenta=" + totalVenta +
                '}';
    }
}
