package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ProviderFilter;
import com.prysoft.pdv.models.Provider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProviderService {

    Provider findById(Long id);

    Page<Provider> findAll(Pageable page);

    Provider saveOrUpdate(Provider entity);

    Page<Provider> filter(ProviderFilter filterParam);

    void delete(Long id);
}
