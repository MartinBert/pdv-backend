package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Perfil;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PerfilDao extends PagingAndSortingRepository<Perfil, Long> {
}
