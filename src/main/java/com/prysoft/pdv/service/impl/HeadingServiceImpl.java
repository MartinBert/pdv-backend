package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.HeadingDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.HeadingFilter;
import com.prysoft.pdv.models.Heading;
import com.prysoft.pdv.service.HeadingService;
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
public class HeadingServiceImpl extends FilterService<Heading> implements HeadingService {
    @Autowired
    private HeadingDao dao;

    @Override
    public Heading findById(Long id) {
        Optional<Heading> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Heading> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Heading saveOrUpdate(Heading entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Heading> saveAll(ArrayList<Heading> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Heading> filter(HeadingFilter filterParams) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "WHERE LOWER(c.nombre) LIKE LOWER ('"+filterParams.getRubroName()+"%')";
        return getPage(hql, filterParams.getPage() - 1, filterParams.getSize(), params);
    }
}
