package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.CarrierFilter;
import com.prysoft.pdv.models.Carrier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarrierService {

    Carrier findById(Long id);

    Page<Carrier> findAll(Pageable page);

    Carrier saveOrUpdate(Carrier entity);

    Page<Carrier> filter(CarrierFilter filterParam);

    void delete(Long id);
}
