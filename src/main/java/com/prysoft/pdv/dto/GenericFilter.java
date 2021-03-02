package com.prysoft.pdv.dto;

public class GenericFilter extends PageFilter {
    private String stringParam;
    private String secondStringParam;
    private String thirdStringParam;
    private double doubleParam;
    private double secondDoubleParam;
    private double thirdDoubleParam;
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

    public String getThirdStringParam() {
        return thirdStringParam;
    }

    public void setThirdStringParam(String thirdStringParam) {
        this.thirdStringParam = thirdStringParam;
    }

    public double getSecondDoubleParam() {
        return secondDoubleParam;
    }

    public void setSecondDoubleParam(double secondDoubleParam) {
        this.secondDoubleParam = secondDoubleParam;
    }

    public double getThirdDoubleParam() {
        return thirdDoubleParam;
    }

    public void setThirdDoubleParam(double thirdDoubleParam) {
        this.thirdDoubleParam = thirdDoubleParam;
    }

    @Override
    public String toString() {
        return "GenericFilter{" +
                "stringParam='" + stringParam + '\'' +
                ", secondStringParam='" + secondStringParam + '\'' +
                ", thirdStringParam='" + thirdStringParam + '\'' +
                ", doubleParam=" + doubleParam +
                ", secondDoubleParam=" + secondDoubleParam +
                ", thirdDoubleParam=" + thirdDoubleParam +
                ", idParam=" + idParam +
                ", longParam=" + longParam +
                ", idSucursal=" + idSucursal +
                ", idPerfil=" + idPerfil +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}
