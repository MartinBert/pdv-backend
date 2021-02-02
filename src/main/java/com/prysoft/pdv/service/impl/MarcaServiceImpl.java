package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.MarcaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Marca;
import com.prysoft.pdv.service.MarcaService;
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
public class MarcaServiceImpl extends FilterService<Marca> implements MarcaService {
    @Autowired
    private MarcaDao dao;

    @Override
    public Marca findById(Long id) {
        Optional<Marca> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Marca> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Marca saveOrUpdate(Marca entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Marca> saveAll(ArrayList<Marca> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Marca> filter(GenericFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();

        String hql = "WHERE LOWER(c.nombre) LIKE LOWER ('"+filterParam.getStringParam()+"%')";

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}
