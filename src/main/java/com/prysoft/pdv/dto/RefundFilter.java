package com.prysoft.pdv.dto;

public class RefundFilter extends CommercialBranchFilter {
    private Long blackReceiptFilter;

    public Long getBlackReceiptFilter() {
        return blackReceiptFilter;
    }

    public void setBlackReceiptFilter(Long blackReceiptFilter) {
        this.blackReceiptFilter = blackReceiptFilter;
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
        return "DevolucionFilter{" +
                "blackReceiptFilter=" + blackReceiptFilter +
                '}';
    }
}
