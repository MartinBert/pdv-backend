package com.prysoft.pdv.dto;

public class InvoiceFilter extends CommercialBranchFilter {
    private String comprobanteFiscalLetra;
    private String comprobanteFiscalNumeroCbte;
    private String comprobanteFiscalFechaEmision;
    private String comprobanteFiscalNombreDocumento;
    private double fechaDesde;
    private double fechaHasta;

    public String getComprobanteFiscalLetra() {
        return comprobanteFiscalLetra;
    }

    public String getComprobanteFiscalNumeroCbte() {
        return comprobanteFiscalNumeroCbte;
    }

    public String getComprobanteFiscalFechaEmision() {
        return comprobanteFiscalFechaEmision;
    }

    public String getComprobanteFiscalNombreDocumento() {
        return comprobanteFiscalNombreDocumento;
    }

    public double getFechaDesde() {
        return fechaDesde;
    }

    public double getFechaHasta() {
        return fechaHasta;
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
        return "InvoiceFilter{" +
                "comprobanteFiscalLetra='" + comprobanteFiscalLetra + '\'' +
                ", comprobanteFiscalNumeroCbte='" + comprobanteFiscalNumeroCbte + '\'' +
                ", comprobanteFiscalFechaEmision='" + comprobanteFiscalFechaEmision + '\'' +
                ", comprobanteFiscalNombreDocumento='" + comprobanteFiscalNombreDocumento + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                '}';
    }
}
