package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.RubroDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.RubroFilter;
import com.prysoft.pdv.models.Rubro;
import com.prysoft.pdv.service.RubroService;
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
public class RubroServiceImpl extends FilterService<Rubro> implements RubroService {
    @Autowired
    private RubroDao dao;

    @Override
    public Rubro findById(Long id) {
        Optional<Rubro> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Rubro> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Rubro saveOrUpdate(Rubro entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Rubro> saveAll(ArrayList<Rubro> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Rubro> filter(RubroFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }
}
