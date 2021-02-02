package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PreguntaFrecuenteDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.PreguntaFrecuente;
import com.prysoft.pdv.service.PreguntaFrecuenteService;
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
public class PreguntaFrecuenteServiceImpl extends FilterService<PreguntaFrecuente> implements PreguntaFrecuenteService {
    @Autowired
    private PreguntaFrecuenteDao dao;

    @Override
    public PreguntaFrecuente findById(Long id) {
        Optional<PreguntaFrecuente> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<PreguntaFrecuente> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public PreguntaFrecuente saveOrUpdate(PreguntaFrecuente entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<PreguntaFrecuente> filter(GenericFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();

        String hql = "WHERE LOWER(c.pregunta) LIKE LOWER('"+filterParam.getStringParam()+"%')";

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}
