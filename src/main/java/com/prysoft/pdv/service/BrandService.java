package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.models.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface BrandService {
    Brand findById(Long id);

    Page<Brand> findAll(Pageable page);

    Brand saveOrUpdate(Brand entity);

    Iterable<Brand> saveAll(ArrayList<Brand> entities);

    Page<Brand> filter(MarcaFilter filterParam);

    void delete(Long id);
}
