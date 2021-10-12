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
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public int findLastBySucursalId(Long sucursalId){
        List<FilterParam> params = new ArrayList<>();
        String hql =
                    "WHERE (c.sucursal.id) = ('" + sucursalId + "') " +
                    "GROUP BY c.id " +
                    "ORDER BY c.id ASC";


        List<CashBox> result = getPage(hql, 0, 1, params).getContent();

        if(result.isEmpty()){
            return 0;
        }else{
            return result.iterator().next().getNumeroCorrelativo();
        }
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
        if (filterParam.getSucursalId() == null) {
            hql=
                "WHERE c.fecha = '" + filterParam.getFecha() + "' " +
                "ORDER BY c.fecha DESC" + " GROUP BY c.fecha";
        } else {
            hql =
                    "WHERE (c.sucursal.id) = ('" + filterParam.getSucursalId() + "') " +
                    "GROUP BY c.id ";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
