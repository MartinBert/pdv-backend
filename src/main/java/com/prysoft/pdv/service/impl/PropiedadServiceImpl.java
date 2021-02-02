package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PropiedadDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Propiedad;
import com.prysoft.pdv.service.PropiedadService;
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
public class PropiedadServiceImpl extends FilterService<Propiedad> implements PropiedadService {
    @Autowired
    private PropiedadDao dao;

    @Override
    public Propiedad findById(Long id) {
        Optional<Propiedad> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Propiedad> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Propiedad saveOrUpdate(Propiedad entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Propiedad> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%')";

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}
