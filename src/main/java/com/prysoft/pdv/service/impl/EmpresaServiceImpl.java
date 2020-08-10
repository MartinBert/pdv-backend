package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CondicionFiscalDao;
import com.prysoft.pdv.dao.EmpresaDao;
import com.prysoft.pdv.dto.EmpresaFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.CondicionFiscal;
import com.prysoft.pdv.models.Empresa;
import com.prysoft.pdv.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmpresaServiceImpl extends FilterService<Empresa> implements EmpresaService {

    @Autowired
    private EmpresaDao dao;

    @Autowired
    private CondicionFiscalDao daoc;

    @Override
    public Empresa findById(Long id) {
        Optional<Empresa> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Empresa> findAll(Pageable page) { return dao.findAll(page); }

    @Override
    public List<Object> findAllCondition() {
        List<Object> condiciones = new LinkedList<>();
        Iterable<CondicionFiscal> lista = daoc.findAll();
        for (CondicionFiscal o:lista){
            if (o.getId() != 3){
                condiciones.add(o);
            }
        }
        return condiciones;}

    @Override
    public Empresa saveOrUpdate(Empresa entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Empresa> filter(EmpresaFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }


}

