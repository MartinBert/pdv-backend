package com.prysoft.pdv.print;

import java.io.Serializable;

public class QuantityProductsSold implements Serializable {
    private String nameOfProduct;
    private double quantity;
    private double total;

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "QuantityProductsSold{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
