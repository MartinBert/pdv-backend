package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.Producto;

import java.io.Serializable;
import java.util.List;

public class PageProductsHelper implements Serializable {
    private List<Producto> content;
    private double totalPages;

    public List<Producto> getContent() {
        return content;
    }

    public void setContent(List<Producto> content) {
        this.content = content;
    }

    public double getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(double totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "PageModelHelper{" +
                "content=" + content +
                ", totalPages=" + totalPages +
                '}';
    }
}
