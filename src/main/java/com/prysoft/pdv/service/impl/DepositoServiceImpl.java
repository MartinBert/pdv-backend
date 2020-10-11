package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.DepositoDao;
import com.prysoft.pdv.dto.DepositoFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.StockFilter;
import com.prysoft.pdv.models.Deposito;
import com.prysoft.pdv.models.Stock;
import com.prysoft.pdv.service.DepositoService;
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
public class DepositoServiceImpl extends FilterService<Deposito> implements DepositoService {
    @Autowired
    private DepositoDao dao;

    @Override
    public Deposito findById(Long id) {
        Optional<Deposito> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Deposito> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Deposito saveOrUpdate(Deposito entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Deposito> saveAll(ArrayList<Deposito> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Deposito> filter(DepositoFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }

    @Override
    public Page<Deposito> filterDepositos(String id) {
        List<FilterParam> params = new ArrayList<>();

        String hql = "WHERE (c.sucursales.id) = ('"+id+"')";

        return getPage(hql, 0, 1000000, params);
    }
}
