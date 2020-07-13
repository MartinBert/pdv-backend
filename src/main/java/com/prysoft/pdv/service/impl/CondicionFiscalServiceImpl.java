package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CondicionFiscalDao;
import com.prysoft.pdv.dto.CondicionFiscalFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.CondicionFiscal;
import com.prysoft.pdv.service.CondicionFiscalService;
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
public class CondicionFiscalServiceImpl extends FilterService<CondicionFiscal> implements CondicionFiscalService {

    @Autowired
    private CondicionFiscalDao dao;

    @Override
    public CondicionFiscal findById(Long id) {
        Optional<CondicionFiscal> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<CondicionFiscal> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public CondicionFiscal saveOrUpdate(CondicionFiscal entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<CondicionFiscal> filter(CondicionFiscalFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }
}

