package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Devolucion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevolucionDao extends PagingAndSortingRepository<Devolucion, Long> {
}
