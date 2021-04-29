package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Property;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyDao extends PagingAndSortingRepository<Property, Long> {
}
