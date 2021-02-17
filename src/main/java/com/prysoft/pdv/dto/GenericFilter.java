package com.prysoft.pdv.dto;

public class GenericFilter extends PageFilter {
    private String stringParam;
    private String secondStringParam;
    private double doubleParam;
    private Long idParam;
    private Long longParam;
    private Long idSucursal;
    private Long idPerfil;
    private int page;
    private int size;

    public String getStringParam() {
        return stringParam;
    }

    public void setStringParam(String stringParam) {
        this.stringParam = stringParam;
    }

    @Override
    public int getPage() {
        return page;
    }

    @Override
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public double getDoubleParam() {
        return doubleParam;
    }

    public void setDoubleParam(double doubleParam) {
        this.doubleParam = doubleParam;
    }

    public Long getIdParam() {
        return idParam;
    }

    public void setIdParam(Long idParam) {
        this.idParam = idParam;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Long getLongParam() {
        return longParam;
    }

    public void setLongParam(Long longParam) {
        this.longParam = longParam;
    }

    public String getSecondStringParam() {
        return secondStringParam;
    }

    public void setSecondStringParam(String secondStringParam) {
        this.secondStringParam = secondStringParam;
    }

    @Override
    public String toString() {
        return "GenericFilter{" +
                "stringParam='" + stringParam + '\'' +
                ", secondStringParam='" + secondStringParam + '\'' +
                ", doubleParam=" + doubleParam +
                ", idParam=" + idParam +
                ", longParam=" + longParam +
                ", idSucursal=" + idSucursal +
                ", idPerfil=" + idPerfil +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}
