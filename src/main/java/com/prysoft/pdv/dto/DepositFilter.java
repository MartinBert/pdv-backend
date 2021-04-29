package com.prysoft.pdv.dto;

public class DepositFilter extends SucursalFilter {
    private String depositoName;

    public String getDepositoName() {
        return depositoName;
    }

    public void setDepositoName(String depositoName) {
        this.depositoName = depositoName;
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
    public Long getPerfilId() {
        return super.getPerfilId();
    }

    @Override
    public String toString() {
        return "DepositoFilter{" +
                "depositoName='" + depositoName + '\'' +
                '}';
    }
}
