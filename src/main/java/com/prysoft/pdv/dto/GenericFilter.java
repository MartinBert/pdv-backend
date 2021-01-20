package com.prysoft.pdv.dto;

public class GenericFilter extends PageFilter {
    private String param;
    private double doubleParam;
    private Long idParam;
    private Long id;
    private int page;
    private int size;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "GenericFilter{" +
                "param='" + param + '\'' +
                ", doubleParam=" + doubleParam +
                ", idParam=" + idParam +
                ", id=" + id +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}
