package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.PreguntaFrecuente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaFrecuenteDao extends PagingAndSortingRepository<PreguntaFrecuente, Long> {
}
