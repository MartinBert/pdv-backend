package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ProductFilter;
import com.prysoft.pdv.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface ProductService {
    Product findById(Long id);

    Product findByCodigoBarra(String codigoBarra);

    Page<Product> findAll(Pageable page);

    Product saveOrUpdate(Product entity);

    Iterable<Product> saveOrUpdateAll(ArrayList<Product> entities);

    Page<Product> filter(ProductFilter filterParam);

    void delete(Long id);
}
