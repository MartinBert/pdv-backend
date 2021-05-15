package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ModuleDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ModuleFilter;
import com.prysoft.pdv.models.Module;
import com.prysoft.pdv.service.ModuleService;
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
public class ModuleServiceImpl extends FilterService<Module> implements ModuleService {

    @Autowired
    private ModuleDao dao;

    @Override
    public Module findById(Long id) {
        Optional<Module> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Module> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Module saveOrUpdate(Module entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Module> filter(ModuleFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getModuloName() + "%')";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
