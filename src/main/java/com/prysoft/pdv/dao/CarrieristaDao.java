package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Carrier;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrieristaDao extends PagingAndSortingRepository<Carrier, Long> {
}

