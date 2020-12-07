package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Mensaje;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeDao extends PagingAndSortingRepository<Mensaje, Long> {
}
