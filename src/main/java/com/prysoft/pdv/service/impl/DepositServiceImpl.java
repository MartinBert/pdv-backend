package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.DepositDao;
import com.prysoft.pdv.dto.DepositFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Deposit;
import com.prysoft.pdv.service.DepositService;
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
public class DepositServiceImpl extends FilterService<Deposit> implements DepositService {
    @Autowired
    private DepositDao dao;

    @Override
    public Deposit findById(Long id) {
        Optional<Deposit> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Deposit> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Deposit saveOrUpdate(Deposit entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Deposit> saveAll(ArrayList<Deposit> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Deposit> filter(DepositFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getPerfilId() == 1) {
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getDepositoName() + "%')";
        } else {
            hql =
                    "WHERE (c.sucursales.id) = ('" + filterParam.getSucursalId() + "') " +
                            "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getDepositoName() + "%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
