package com.prysoft.pdv.dto;

public class DocumentoComercialFilter extends PageFilter {
    private String documentoComercialName;

    public String getDocumentoComercialName() {
        return documentoComercialName;
    }

    public void setDocumentoComercialName(String documentoComercialName) {
        this.documentoComercialName = documentoComercialName;
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
        return "DocumentoComercialFilter{" +
                "documentoComercialName='" + documentoComercialName + '\'' +
                '}';
    }
}
