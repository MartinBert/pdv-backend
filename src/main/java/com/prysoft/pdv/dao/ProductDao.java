package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductDao extends PagingAndSortingRepository<Product, Long> {
    Optional<Product> findByCodigoBarra(String codigoBarra);
}
