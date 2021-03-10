package com.prysoft.pdv.dto;

public class ModuloFilter extends PageFilter{
    private String moduloName;

    public String getModuloName() {
        return moduloName;
    }

    public void setModuloName(String moduloName) {
        this.moduloName = moduloName;
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
        return "ModuloFilter{" +
                "moduloName='" + moduloName + '\'' +
                '}';
    }
}
