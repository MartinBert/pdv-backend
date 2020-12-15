package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Propiedad;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropiedadDao extends PagingAndSortingRepository<Propiedad, Long> {
}
