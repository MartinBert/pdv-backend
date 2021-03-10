package com.prysoft.pdv.dto;

public class CondicionFiscalFilter extends PageFilter {
    private String condicionFiscalName;

    public String getCondicionFiscalName() {
        return condicionFiscalName;
    }

    public void setCondicionFiscalName(String condicionFiscalName) {
        this.condicionFiscalName = condicionFiscalName;
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
        return "CondicionFiscalFilter{" +
                "condicionFiscalName='" + condicionFiscalName + '\'' +
                '}';
    }
}
