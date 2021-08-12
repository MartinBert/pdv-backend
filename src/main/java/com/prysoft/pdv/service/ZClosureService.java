package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ZClosureFilter;
import com.prysoft.pdv.models.ZClosure;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface ZClosureService {
    ZClosure findById(Long id);

    int getLastCorrelativeNumber(Long sucursalId);

    Page<ZClosure> findAll(Pageable page);

    ZClosure saveOrUpdate(ZClosure entity);

    void delete(Long id);

    Iterable<ZClosure> saveOrUpdateAll(ArrayList<ZClosure> entities);

    Page<ZClosure> filter(ZClosureFilter filterParam);
}
