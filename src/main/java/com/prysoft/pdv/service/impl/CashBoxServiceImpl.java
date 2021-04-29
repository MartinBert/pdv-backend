package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CashBoxDao;
import com.prysoft.pdv.dto.CashBoxFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.CashBox;
import com.prysoft.pdv.service.CashBoxService;
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
public class CashBoxServiceImpl extends FilterService<CashBox> implements CashBoxService {
    @Autowired
    private CashBoxDao dao;

    @Override
    public CashBox findById(Long id) {
        Optional<CashBox> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<CashBox> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public CashBox saveOrUpdate(CashBox entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<CashBox> filter(CashBoxFilter filterParam) {
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
