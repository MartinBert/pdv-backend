package com.prysoft.pdv.dto;

public class RubroFilter extends PageFilter{
    private Long rubroId;
    private String rubroName;

    public Long getRubroId() {
        return rubroId;
    }

    public void setRubroId(Long rubroId) {
        this.rubroId = rubroId;
    }

    public String getRubroName() {
        return rubroName;
    }

    public void setRubroName(String rubroName) {
        this.rubroName = rubroName;
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
        return "RubroFilter{" +
                "rubroId=" + rubroId +
                ", rubroName='" + rubroName + '\'' +
                '}';
    }
}
