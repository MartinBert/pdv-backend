package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.DevolucionDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Devolucion;
import com.prysoft.pdv.service.DevolucionService;
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
public class DevolucionServiceImpl extends FilterService<Devolucion> implements DevolucionService {

    @Autowired
    private DevolucionDao dao;

    @Override
    public Devolucion findById(Long id) {
        Optional<Devolucion> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Devolucion> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Devolucion saveOrUpdate(Devolucion entity) {return dao.save(entity);}

    @Override
    public Page<Devolucion> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getIdSucursal() == null){
            hql = "";
        }else{
            if(filterParam.getLongParam() != null && filterParam.getLongParam() == 999999999){
                hql = "WHERE c.sucursal.id = ('"+filterParam.getIdSucursal()+"') AND LOWER(c.comprobante.letra) = LOWER('nx')";
            }else{
                hql = "WHERE c.sucursal.id = ('"+filterParam.getIdSucursal()+"') AND LOWER(c.comprobante.letra) != LOWER('nx')";
            }
        }

        return getPage(hql,filterParam.getPage(),filterParam.getSize(),params);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}

