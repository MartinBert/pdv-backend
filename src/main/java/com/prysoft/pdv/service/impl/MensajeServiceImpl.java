package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.MensajeDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Mensaje;
import com.prysoft.pdv.service.MensajeService;
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
public class MensajeServiceImpl extends FilterService<Mensaje> implements MensajeService {
    @Autowired
    private MensajeDao dao;

    @Override
    public Mensaje findById(Long id) {
        Optional<Mensaje> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Mensaje> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Mensaje saveOrUpdate(Mensaje entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Mensaje> filter(GenericFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();

        String hql = "WHERE LOWER(c.nameAndLastName) LIKE LOWER('"+filterParam.getStringParam()+"%') OR LOWER(c.date) LIKE LOWER('"+filterParam.getStringParam()+"')";

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}
