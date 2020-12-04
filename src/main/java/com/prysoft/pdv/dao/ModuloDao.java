package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Modulo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloDao extends PagingAndSortingRepository<Modulo, Long> {
}
