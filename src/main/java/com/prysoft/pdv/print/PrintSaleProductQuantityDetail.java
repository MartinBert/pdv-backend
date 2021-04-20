package com.prysoft.pdv.print;

import java.io.Serializable;

public class PrintSaleProductQuantityDetail implements Serializable {
    private String initDate;
    private String finishDate;
    private String product;
    private double quantity;
    private double amount;

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PrintSaleProductQuantityDetail{" +
                "initDesde='" + initDate + '\'' +
                ", finishDatel='" + finishDate + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
