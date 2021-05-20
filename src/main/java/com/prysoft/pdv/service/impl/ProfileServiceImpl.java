package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ProfileDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ProfileFilter;
import com.prysoft.pdv.models.Profile;
import com.prysoft.pdv.service.ProfileService;
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
public class ProfileServiceImpl extends FilterService<Profile> implements ProfileService {
    @Autowired
    private ProfileDao dao;

    @Override
    public Profile findById(Long id) {
        Optional<Profile> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Profile> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Profile saveOrUpdate(Profile entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Profile> filter(ProfileFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getPerfilId() == 1) {
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getPerfilName() + "%')";
        } else {
            hql = "WHERE (c.id) != ('1') AND (c.nombre) LIKE LOWER('" + filterParam.getPerfilName() + "%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

}
