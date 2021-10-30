package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.FastSaleConfig;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FastSaleConfigDao extends PagingAndSortingRepository<FastSaleConfig, Long> {
    Optional<FastSaleConfig> findBySucursalIdAndSeleccionado(Long sucursalId, Boolean seleccionado);
}
