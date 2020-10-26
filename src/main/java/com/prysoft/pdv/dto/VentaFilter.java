package com.prysoft.pdv.dto;

import java.io.Serializable;

public class VentaFilter implements Serializable {
    private String sucursalId;
    private String filterParam;
    private String filter;
    private int page;
    private int size;

    public String getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(String sucursalId) {
        this.sucursalId = sucursalId;
    }

    public String getFilterParam() {
        return filterParam;
    }

    public void setFilterParam(String filterParam) {
        this.filterParam = filterParam;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

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

    @Override
    public String toString() {
        return "VentaFilter{" +
                "sucursalId='" + sucursalId + '\'' +
                ", filterParam='" + filterParam + '\'' +
                ", filter='" + filter + '\'' +
                ", page='" + page + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
