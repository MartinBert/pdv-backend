package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.SucursalDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Sucursal;
import com.prysoft.pdv.service.SucursalService;
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
public class SucursalServiceImpl extends FilterService<Sucursal> implements SucursalService {

    @Autowired
        private SucursalDao dao;

    @Override
        public Sucursal findById(Long id) {
            Optional<Sucursal> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
        public Page<Sucursal> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
            public Sucursal saveOrUpdate(Sucursal entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Sucursal> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getId() == null){
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getParam()+"%') OR LOWER(c.direccion) LIKE LOWER('"+filterParam.getParam()+"%')";
        }else{
            hql = "WHERE (c.id) = ('"+filterParam.getId()+"') AND (LOWER(c.nombre) LIKE LOWER('"+filterParam.getParam()+"%') OR LOWER(c.direccion) LIKE LOWER('"+filterParam.getParam()+"%'))";
        }

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }


}
