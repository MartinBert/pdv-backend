package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.IvaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Iva;
import com.prysoft.pdv.service.IvaService;
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
public class IvaServiceImpl extends FilterService<Iva> implements IvaService {

    @Autowired
    private IvaDao dao;

    @Override
    public Iva findById(Long id) {
        Optional<Iva> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Iva> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Iva saveOrUpdate(Iva entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Iva> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        hql = "";

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }

}
