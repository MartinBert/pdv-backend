package com.prysoft.pdv.print;

import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.models.ProductoDescription;

import java.io.Serializable;
import java.util.ArrayList;

public class PrintSaleForSelectedProductAndDate implements Serializable {
    private String fechaDesde;
    private String fechaHasta;
    private ArrayList<Producto> products;
    private ArrayList<ProductoDescription> productsDescription;

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

    public ArrayList<Producto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Producto> products) {
        this.products = products;
    }

    public ArrayList<ProductoDescription> getProductsDescription() {
        return productsDescription;
    }

    public void setProductsDescription(ArrayList<ProductoDescription> productsDescription) {
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
