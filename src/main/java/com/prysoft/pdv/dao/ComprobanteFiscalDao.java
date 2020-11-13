package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ComprobanteFiscalDao extends PagingAndSortingRepository<ComprobanteFiscal, Long> {
    Optional<ComprobanteFiscal> findByNumeroCbte(String numero);
}
