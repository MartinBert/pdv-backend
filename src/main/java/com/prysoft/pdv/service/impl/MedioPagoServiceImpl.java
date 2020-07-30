package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.MedioPagoDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.MedioPagoFilter;
import com.prysoft.pdv.models.MedioPago;
import com.prysoft.pdv.service.MedioPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MedioPagoServiceImpl extends FilterService<MedioPago> implements MedioPagoService {
    @Autowired
    private MedioPagoDao dao;

    @Override
    public MedioPago findById(Long id) {
        Optional<MedioPago> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<MedioPago> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public MedioPago saveOrUpdate(MedioPago entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<MedioPago> filter(MedioPagoFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }
}

