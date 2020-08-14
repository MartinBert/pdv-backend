package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PuntoVentaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.PuntoVentaFilter;
import com.prysoft.pdv.models.PuntoVenta;
import com.prysoft.pdv.service.PuntoVentaService;
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
public class PuntoVentaServiceImpl extends FilterService<PuntoVenta> implements PuntoVentaService {

    @Autowired
    private PuntoVentaDao dao;

    @Override
    public PuntoVenta findById(Long id) {
        Optional<PuntoVenta> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<PuntoVenta> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public PuntoVenta saveOrUpdate(PuntoVenta entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<PuntoVenta> filter(PuntoVentaFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }


}

