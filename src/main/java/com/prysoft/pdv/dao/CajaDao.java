package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Caja;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CajaDao extends PagingAndSortingRepository<Caja, Long> {
}
