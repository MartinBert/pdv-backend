package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Brand;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BrandDao extends PagingAndSortingRepository<Brand, Long> {
}
