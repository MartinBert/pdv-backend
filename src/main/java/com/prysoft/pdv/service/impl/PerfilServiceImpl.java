package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PerfilDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.PerfilFilter;
import com.prysoft.pdv.models.Perfil;
import com.prysoft.pdv.service.PerfilService;
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
public class PerfilServiceImpl extends FilterService<Perfil> implements PerfilService {
    @Autowired
    private PerfilDao dao;

    @Override
    public Perfil findById(Long id) {
        Optional<Perfil> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Perfil> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Perfil saveOrUpdate(Perfil entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Perfil> filter(PerfilFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getPerfilId() == 1){
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getPerfilName()+"%')";
        }else{
            hql = "WHERE (c.id) != ('1') AND (c.nombre) LIKE LOWER('"+filterParam.getPerfilName()+"%')";
        }
        return getPage(hql , filterParam.getPage() - 1, filterParam.getSize(), params);
    }

}
