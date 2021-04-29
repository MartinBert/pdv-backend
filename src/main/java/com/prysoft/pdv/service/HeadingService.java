package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.HeadingFilter;
import com.prysoft.pdv.models.Heading;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface HeadingService {
    Heading findById(Long id);

    Page<Heading> findAll(Pageable page);

    Heading saveOrUpdate(Heading entity);

    Page<Heading> filter(HeadingFilter filterParams);

    Iterable<Heading> saveAll(ArrayList<Heading> entities);

    void delete(Long id);
}
