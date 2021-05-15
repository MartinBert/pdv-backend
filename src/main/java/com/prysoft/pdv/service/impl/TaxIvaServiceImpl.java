package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.TaxIvaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.TaxIvaFilter;
import com.prysoft.pdv.models.TaxIva;
import com.prysoft.pdv.service.TaxIvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TaxIvaServiceImpl extends FilterService<TaxIva> implements TaxIvaService {

    @Autowired
    private TaxIvaDao dao;

    @Override
    public TaxIva findById(Long id) {
        Optional<TaxIva> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<TaxIva> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public TaxIva saveOrUpdate(TaxIva entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<TaxIva> filter(TaxIvaFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        hql = "";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
