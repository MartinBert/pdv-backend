package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.RefundDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.RefundFilter;
import com.prysoft.pdv.models.Refund;
import com.prysoft.pdv.service.RefundService;
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
public class RefundServiceImpl extends FilterService<Refund> implements RefundService {
    @Autowired
    private RefundDao dao;

    @Override
    public Refund findById(Long id) {
        Optional<Refund> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Refund> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Refund saveOrUpdate(Refund entity) {
        return dao.save(entity);
    }

    @Override
    public Page<Refund> filter(RefundFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql = "";
        } else {
            if (filterParam.getBlackReceiptFilter() != null && filterParam.getBlackReceiptFilter() == 999999999) {
                hql = "WHERE c.sucursal.id = ('" + filterParam.getSucursalId() + "')";
            } else {
                hql =
                    "WHERE c.sucursal.id = ('" + filterParam.getSucursalId() + "') " +
                    "AND LOWER(c.comprobante.letra) NOT LIKE LOWER('nx') " +
                    "GROUP BY c.id ORDER BY c.id DESC";
            }
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}

