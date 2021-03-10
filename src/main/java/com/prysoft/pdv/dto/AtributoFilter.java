package com.prysoft.pdv.dto;

public class AtributoFilter extends PageFilter {
    private String atributoValor;

    public String getAtributoValor() {
        return atributoValor;
    }

    public void setAtributoValor(String atributoValor) {
        this.atributoValor = atributoValor;
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
        return "AtributoFilter{" +
                "atributoValor='" + atributoValor + '\'' +
                '}';
    }
}
