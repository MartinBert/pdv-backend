package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.MedioPagoDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.dto.MedioPagoFilter;
import com.prysoft.pdv.models.MedioPago;
import com.prysoft.pdv.models.PlanPago;
import com.prysoft.pdv.service.MedioPagoService;
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
public class MedioPagoServiceImpl extends FilterService<MedioPago> implements MedioPagoService {
    @Autowired
    private MedioPagoDao dao;

    @Override
    public MedioPago findById(Long id) {
        Optional<MedioPago> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<MedioPago> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public MedioPago saveOrUpdate(MedioPago entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<MedioPago> saveAll(ArrayList<MedioPago> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<MedioPago> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        if(filterParam.getId() == null){
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getParam()+"%')";
        }else{
            hql = "WHERE (c.sucursal.id) = ('"+filterParam.getId()+"') AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getParam()+"%')";
        }

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}

