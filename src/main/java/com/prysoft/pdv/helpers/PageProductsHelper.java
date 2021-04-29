package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.Product;

import java.io.Serializable;
import java.util.List;

public class PageProductsHelper implements Serializable {
    private List<Product> content;
    private double totalPages;

    public List<Product> getContent() {
        return content;
    }

    public void setContent(List<Product> content) {
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
