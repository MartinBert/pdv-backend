package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Business;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BusinessDao extends PagingAndSortingRepository<Business, Long> {
}
