package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.SucursalDao;
import com.prysoft.pdv.dto.SucursalFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Sucursal;
import com.prysoft.pdv.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
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
    public Page<Sucursal> filter(SucursalFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getSucursalId() == null){
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getSucursalName()+"%') " +
                    "AND LOWER(c.direccion) LIKE LOWER('"+filterParam.getSucursalDirection()+"%') " +
                    "AND LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getSucursalSocialReason()+"%')";
        }else{
            hql = "WHERE (c.id) = ('"+filterParam.getSucursalId()+"') " +
                    "AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getSucursalName()+"%') " +
                    "AND LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getSucursalSocialReason()+"%') " +
                    "AND LOWER(c.direccion) LIKE LOWER('"+filterParam.getSucursalDirection()+"%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
