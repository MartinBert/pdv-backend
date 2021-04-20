package com.prysoft.pdv.models;

import java.io.Serializable;
import java.util.ArrayList;

public class ProductoDescription implements Serializable {
    private String name;
    private String barCode;
    private String code;
    private String tradeMarkName;
    private Long tradeMarkId;
    private String rubroName;
    private Long rubroId;
    private ArrayList<Atributo> attributes;
    private ArrayList<Propiedad> properties;
    private double quantity;
    private double costPrice;
    private double salePrice;
    private double buyIvaPercent;
    private double saleIvaPercent;
    private double buyIvaAmount;
    private double saleIvaAmount;
    private ArrayList<Proveedor> providersData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTradeMarkName() {
        return tradeMarkName;
    }

    public void setTradeMarkName(String tradeMarkName) {
        this.tradeMarkName = tradeMarkName;
    }

    public String getRubroName() {
        return rubroName;
    }

    public void setRubroName(String rubroName) {
        this.rubroName = rubroName;
    }

    public ArrayList<Atributo> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Atributo> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<Propiedad> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Propiedad> properties) {
        this.properties = properties;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getBuyIvaPercent() {
        return buyIvaPercent;
    }

    public void setBuyIvaPercent(double buyIvaPercent) {
        this.buyIvaPercent = buyIvaPercent;
    }

    public double getSaleIvaPercent() {
        return saleIvaPercent;
    }

    public void setSaleIvaPercent(double saleIvaPercent) {
        this.saleIvaPercent = saleIvaPercent;
    }

    public double getBuyIvaAmount() {
        return buyIvaAmount;
    }

    public void setBuyIvaAmount(double buyIvaAmount) {
        this.buyIvaAmount = buyIvaAmount;
    }

    public double getSaleIvaAmount() {
        return saleIvaAmount;
    }

    public void setSaleIvaAmount(double saleIvaAmount) {
        this.saleIvaAmount = saleIvaAmount;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Long getTradeMarkId() {
        return tradeMarkId;
    }

    public void setTradeMarkId(Long tradeMarkId) {
        this.tradeMarkId = tradeMarkId;
    }

    public Long getRubroId() {
        return rubroId;
    }

    public void setRubroId(Long rubroId) {
        this.rubroId = rubroId;
    }

    public ArrayList<Proveedor> getProvidersData() {
        return providersData;
    }

    public void setProvidersData(ArrayList<Proveedor> providersData) {
        this.providersData = providersData;
    }

    @Override
    public String toString() {
        return "ProductoDescription{" +
                "name='" + name + '\'' +
                ", barCode='" + barCode + '\'' +
                ", code='" + code + '\'' +
                ", tradeMarkName='" + tradeMarkName + '\'' +
                ", tradeMarkId=" + tradeMarkId +
                ", rubroName='" + rubroName + '\'' +
                ", rubroId=" + rubroId +
                ", attributes=" + attributes +
                ", properties=" + properties +
                ", quantity=" + quantity +
                ", costPrice=" + costPrice +
                ", salePrice=" + salePrice +
                ", buyIvaPercent=" + buyIvaPercent +
                ", saleIvaPercent=" + saleIvaPercent +
                ", buyIvaAmount=" + buyIvaAmount +
                ", saleIvaAmount=" + saleIvaAmount +
                ", providersData=" + providersData +
                '}';
    }
}
