package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.models.Marca;
import com.prysoft.pdv.models.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface MarcaService {
    Marca findById(Long id);

    Page<Marca> findAll(Pageable page);

    Marca saveOrUpdate(Marca entity);

    Iterable<Marca> saveAll(ArrayList<Marca> entities);

    Page<Marca> filter(MarcaFilter filter);

    void delete(Long id);
}
