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
        final StringBuffer sb = new StringBuffer("InvoiceFilter{");
        sb.append("comprobanteFiscalLetra='").append(comprobanteFiscalLetra).append('\'');
        sb.append(", comprobanteFiscalNumeroCbte='").append(comprobanteFiscalNumeroCbte).append('\'');
        sb.append(", comprobanteFiscalFechaEmision='").append(comprobanteFiscalFechaEmision).append('\'');
        sb.append(", comprobanteFiscalNombreDocumento='").append(comprobanteFiscalNombreDocumento).append('\'');
        sb.append(", fechaDesde=").append(fechaDesde);
        sb.append(", fechaHasta=").append(fechaHasta);
        sb.append('}');
        return sb.toString();
    }
}
