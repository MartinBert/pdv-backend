package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ModuleFilter;
import com.prysoft.pdv.models.Module;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ModuleService {
    Module findById(Long id);

    Page<Module> findAll(Pageable page);

    Module saveOrUpdate(Module entity);

    void delete(Long id);

    Page<Module> filter(ModuleFilter filterParam);
}
