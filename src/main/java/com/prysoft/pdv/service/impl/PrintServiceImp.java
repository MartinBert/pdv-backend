package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PrintDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.PrintFilter;
import com.prysoft.pdv.models.Print;
import com.prysoft.pdv.service.PrintService;
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
public class PrintServiceImp extends FilterService<Print> implements PrintService {

    @Autowired
    private PrintDao dao;

    @Override
    public Print findById(Long id) {
        Optional<Print> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Print> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Print saveOrUpdate(Print entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Print> saveAll(Iterable<Print> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Print> filter(PrintFilter filterParam) {
        String hql = "";
        if(filterParam.getSucursalId() != null){
            hql =
                "WHERE c.sucursal.id = ('"+filterParam.getSucursalId()+"')" +
                "AND LOWER(c.nombreImpresora) LIKE LOWER('" + filterParam.getNombreImpresora() + "%') " +
                "OR (c.valor) LIKE LOWER('" + filterParam.getValor() + "%')";
        }
        List<FilterParam> params = new ArrayList<>();
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
