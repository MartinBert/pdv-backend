package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Transportista;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransportistaDao extends PagingAndSortingRepository<Transportista, Long> {
}

