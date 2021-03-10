package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ModuloDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ModuloFilter;
import com.prysoft.pdv.models.Modulo;
import com.prysoft.pdv.service.ModuloService;
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
public class ModuloServiceImpl extends FilterService<Modulo> implements ModuloService {

    @Autowired
    private ModuloDao dao;

    @Override
    public Modulo findById(Long id) {
        Optional<Modulo> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Modulo> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Modulo saveOrUpdate(Modulo entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Modulo> filter(ModuloFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getModuloName()+"%')";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
