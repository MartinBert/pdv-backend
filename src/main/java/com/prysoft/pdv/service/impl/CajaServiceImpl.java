package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CajaDao;
import com.prysoft.pdv.dto.CajaFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Caja;
import com.prysoft.pdv.service.CajaService;
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
public class CajaServiceImpl extends FilterService<Caja> implements CajaService {
    @Autowired
    private CajaDao dao;

    @Override
    public Caja findById(Long id) {
        Optional<Caja> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Caja> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Caja saveOrUpdate(Caja entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Caja> filter(CajaFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getSucursalId() == null){
            hql ="";
        }else{
            hql = "WHERE (c.sucursal.id) = ('"+filterParam.getSucursalId()+"')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
