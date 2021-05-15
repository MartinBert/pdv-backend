package com.prysoft.pdv.print;

import com.prysoft.pdv.models.Product;
import com.prysoft.pdv.models.ProductDescription;

import java.io.Serializable;
import java.util.ArrayList;

public class PrintSaleForSelectedProductAndDate implements Serializable {
    private String fechaDesde;
    private String fechaHasta;
    private ArrayList<Product> products;
    private ArrayList<ProductDescription> productsDescription;

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<ProductDescription> getProductsDescription() {
        return productsDescription;
    }

    public void setProductsDescription(ArrayList<ProductDescription> productsDescription) {
        this.productsDescription = productsDescription;
    }

    @Override
    public String toString() {
        return "PrintSaleForSelectedProductAndDate{" +
                "fechaDesde='" + fechaDesde + '\'' +
                ", fechaHasta='" + fechaHasta + '\'' +
                ", products=" + products +
                ", productsDescription=" + productsDescription +
                '}';
    }
}
