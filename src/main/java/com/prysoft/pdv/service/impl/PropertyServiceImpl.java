package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PropertyDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.PropertyFilter;
import com.prysoft.pdv.models.Property;
import com.prysoft.pdv.service.PropertyService;
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
public class PropertyServiceImpl extends FilterService<Property> implements PropertyService {
    @Autowired
    private PropertyDao dao;

    @Override
    public Property findById(Long id) {
        Optional<Property> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Property> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Property saveOrUpdate(Property entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Property> filter(PropertyFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getPropiedadName()+"%')";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
