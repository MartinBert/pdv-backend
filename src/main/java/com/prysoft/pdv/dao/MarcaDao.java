package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Marca;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MarcaDao extends PagingAndSortingRepository<Marca, Long> {
}
