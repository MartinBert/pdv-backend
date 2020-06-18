package com.prysoft.pdv.dto;

public abstract class PageFilter {
    private int page = 0;
    private int size = 10;
    private String order = "id,desc";

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
