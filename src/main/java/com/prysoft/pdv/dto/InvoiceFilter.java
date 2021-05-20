package com.prysoft.pdv.dto;

public class InvoiceFilter extends CommercialBranchFilter {
    private String comprobanteFiscalLetra;
    private String comprobanteFiscalNumeroCbte;
    private String comprobanteFiscalFechaEmision;
    private String comprobanteFiscalNombreDocumento;

    public String getComprobanteFiscalLetra() {
        return comprobanteFiscalLetra;
    }

    public void setComprobanteFiscalLetra(String comprobanteFiscalLetra) {
        this.comprobanteFiscalLetra = comprobanteFiscalLetra;
    }

    public String getComprobanteFiscalNumeroCbte() {
        return comprobanteFiscalNumeroCbte;
    }

    public void setComprobanteFiscalNumeroCbte(String comprobanteFiscalNumeroCbte) {
        this.comprobanteFiscalNumeroCbte = comprobanteFiscalNumeroCbte;
    }

    public String getComprobanteFiscalFechaEmision() {
        return comprobanteFiscalFechaEmision;
    }

    public void setComprobanteFiscalFechaEmision(String comprobanteFiscalFechaEmision) {
        this.comprobanteFiscalFechaEmision = comprobanteFiscalFechaEmision;
    }

    public String getComprobanteFiscalNombreDocumento() {
        return comprobanteFiscalNombreDocumento;
    }

    public void setComprobanteFiscalNombreDocumento(String comprobanteFiscalNombreDocumento) {
        this.comprobanteFiscalNombreDocumento = comprobanteFiscalNombreDocumento;
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
        return "ComprobanteFiscalFilter{" +
                "comprobanteFiscalLetra='" + comprobanteFiscalLetra + '\'' +
                ", comprobanteFiscalNumeroCbte='" + comprobanteFiscalNumeroCbte + '\'' +
                ", comprobanteFiscalFechaEmision='" + comprobanteFiscalFechaEmision + '\'' +
                ", comprobanteFiscalNombreDocumento='" + comprobanteFiscalNombreDocumento + '\'' +
                '}';
    }
}
