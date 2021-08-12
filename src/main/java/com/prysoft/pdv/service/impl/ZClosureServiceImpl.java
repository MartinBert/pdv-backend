package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ZClosureDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ZClosureFilter;
import com.prysoft.pdv.models.ZClosure;
import com.prysoft.pdv.service.ZClosureService;
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
public class ZClosureServiceImpl extends FilterService<ZClosure> implements ZClosureService {
    @Autowired
    private ZClosureDao dao;

    @Override
    public ZClosure findById(Long id) {
        Optional<ZClosure> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

        @Override
        public int findById(Long sucursalId) {
        Optional<ZClosure> optional = dao.findLastBySucursalId(sucursalId);
       if(optional.isPresent()){
           return optional.get().getNumeroCorrelativo();
       } else{
           return 0 ; 
       }
    }

    @Override
    public Page<ZClosure> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public ZClosure saveOrUpdate(ZClosure entity) { return dao.save(entity); }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<ZClosure> filter(ZClosureFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getDate() == null){
            if(filterParam.getSucursalId() == null){
                hql = "";
            }else{
                hql = "WHERE c.sucursal = '"+filterParam.getSucursalId()+"'";
            }
        }else{
            if(filterParam.getSucursalId() == null){
                hql = "WHERE c.fecha = '" + filterParam.getDate() + "' ORDER BY c.fecha DESC";
            }else{
                hql = "WHERE c.sucursal = '"+filterParam.getSucursalId()+"' AND c.fecha = '" + filterParam.getDate() + "' ORDER BY c.fecha DESC";
            }
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public Iterable<ZClosure> saveOrUpdateAll(ArrayList<ZClosure> entities) { return dao.saveAll(entities); }
}
