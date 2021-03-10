package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PlanPagoDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.PlanPagoFilter;
import com.prysoft.pdv.models.PlanPago;
import com.prysoft.pdv.service.PlanPagoService;
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
public class PlanPagoServiceImpl extends FilterService<PlanPago> implements PlanPagoService {
    @Autowired
    private PlanPagoDao dao;

    @Override
    public PlanPago findById(Long id) {
        Optional<PlanPago> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<PlanPago> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public PlanPago saveOrUpdate(PlanPago entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<PlanPago> saveAll(ArrayList<PlanPago> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<PlanPago> filter(PlanPagoFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        if(filterParam.getSucursalId() == null){
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getPlanPagoName()+"%')";
        }else{
            hql = "WHERE (c.sucursal.id) = ('"+filterParam.getSucursalId()+"') " +
                    "AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getPlanPagoName()+"%')";
        }

        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}

