package com.prysoft.pdv.dto;

public class PuntoVentaFilter extends SucursalFilter{
    private Long puntoVentaId;
    private String puntoVentaName;
    private Long puntoVentaIdFiscal;

    public Long getPuntoVentaId() {
        return puntoVentaId;
    }

    public void setPuntoVentaId(Long puntoVentaId) {
        this.puntoVentaId = puntoVentaId;
    }

    public String getPuntoVentaName() {
        return puntoVentaName;
    }

    public void setPuntoVentaName(String puntoVentaName) {
        this.puntoVentaName = puntoVentaName;
    }

    public Long getPuntoVentaIdFiscal() {
        return puntoVentaIdFiscal;
    }

    public void setPuntoVentaIdFiscal(Long puntoVentaIdFiscal) {
        this.puntoVentaIdFiscal = puntoVentaIdFiscal;
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public Long getPerfilId() {
        return super.getPerfilId();
    }

    @Override
    public void setPerfilId(Long perfilId) {
        super.setPerfilId(perfilId);
    }

    @Override
    public String getPerfilName() {
        return super.getPerfilName();
    }

    @Override
    public void setPerfilName(String perfilName) {
        super.setPerfilName(perfilName);
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
        return "PuntoVentaFilter{" +
                "puntoVentaId=" + puntoVentaId +
                ", puntoVentaName='" + puntoVentaName + '\'' +
                ", puntoVentaIdFiscal=" + puntoVentaIdFiscal +
                '}';
    }
}
