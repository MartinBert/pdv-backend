package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.dto.ComprobanteFiscalFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.ComprobanteFiscalService;
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
public class ComprobanteFiscalServiceImpl extends FilterService<ComprobanteFiscal> implements ComprobanteFiscalService {

    @Autowired
    private ComprobanteFiscalDao dao;

    @Override
    public ComprobanteFiscal findById(Long id) {
        Optional<ComprobanteFiscal> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<ComprobanteFiscal> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public ComprobanteFiscal saveOrUpdate(ComprobanteFiscal entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<ComprobanteFiscal> filter(ComprobanteFiscalFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }


}

