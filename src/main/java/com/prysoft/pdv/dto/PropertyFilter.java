package com.prysoft.pdv.dto;

public class PropertyFilter extends PageFilter{
    private String propiedadName;

    public String getPropiedadName() {
        return propiedadName;
    }

    public void setPropiedadName(String propiedadName) {
        this.propiedadName = propiedadName;
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
        return "PropiedadFilter{" +
                "propiedadName='" + propiedadName + '\'' +
                '}';
    }
}
