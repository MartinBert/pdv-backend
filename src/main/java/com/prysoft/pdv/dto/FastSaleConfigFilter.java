package com.prysoft.pdv.dto;

public class FastSaleConfigFilter extends CommercialBranchFilter{
    private String clientName;
    private String documentName;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public String toString() {
        return "FastSaleConfigFilter{" +
                "clientName='" + clientName + '\'' +
                ", documentName='" + documentName + '\'' +
                '}';
    }
}
