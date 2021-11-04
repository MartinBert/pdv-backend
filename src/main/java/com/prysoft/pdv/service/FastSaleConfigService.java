package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.FastSaleConfigFilter;
import com.prysoft.pdv.models.FastSaleConfig;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface FastSaleConfigService {
    FastSaleConfig findById(Long id);

    Page<FastSaleConfig> findAll(Pageable page);

    FastSaleConfig saveOrUpdate(FastSaleConfig entity);

    void delete(Long id);

    Iterable<FastSaleConfig> saveOrUpdateAll(ArrayList<FastSaleConfig> entities);

    Page<FastSaleConfig> filter(FastSaleConfigFilter filterParam);

    FastSaleConfig filterBySucursalAndSeleccionado(Long sucursalId);
}
