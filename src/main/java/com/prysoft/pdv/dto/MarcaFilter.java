package com.prysoft.pdv.dto;

public class MarcaFilter extends PageFilter {
    private Long marcaId;
    private String marcaName;

    public Long getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Long marcaId) {
        this.marcaId = marcaId;
    }

    public String getMarcaName() {
        return marcaName;
    }

    public void setMarcaName(String marcaName) {
        this.marcaName = marcaName;
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public void setPage(int page) {
        super.setPage(page);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public String getOrder() {
        return super.getOrder();
    }

    @Override
    public void setOrder(String order) {
        super.setOrder(order);
    }

    @Override
    public String toString() {
        return "MarcaFilter{" +
                "marcaId=" + marcaId +
                ", marcaName='" + marcaName + '\'' +
                '}';
    }
}
