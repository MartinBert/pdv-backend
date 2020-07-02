package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CondicionIvaDao;
import com.prysoft.pdv.dto.CondicionIvaFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.CondicionIva;
import com.prysoft.pdv.service.CondicionIvaService;
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
public class CondicionIvaServiceImpl extends FilterService<CondicionIva> implements CondicionIvaService {

    @Autowired
    private CondicionIvaDao dao;

    @Override
    public CondicionIva findById(Long id) {
        Optional<CondicionIva> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<CondicionIva> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public CondicionIva saveOrUpdate(CondicionIva entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<CondicionIva> filter(CondicionIvaFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }


}

