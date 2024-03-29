package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ProviderDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ProviderFilter;
import com.prysoft.pdv.models.Provider;
import com.prysoft.pdv.service.ProviderService;
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
public class ProviderServiceImpl extends FilterService<Provider> implements ProviderService {
    @Autowired
    private ProviderDao dao;

    @Override
    public Provider findById(Long id) {
        Optional<Provider> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Provider> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Provider saveOrUpdate(Provider entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Provider> filter(ProviderFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql =
                    "WHERE (LOWER(c.razonSocial) LIKE LOWER('" + filterParam.getPersonaSocialReason() + "%') " +
                            "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getPersonaName() + "%') " +
                            "AND LOWER(c.direccion) LIKE LOWER('" + filterParam.getPersonaDirection() + "%') " +
                            "AND LOWER(c.nombreContacto) LIKE LOWER('" + filterParam.getPersonaContactName() + "%') " +
                            "AND LOWER(c.cuit) LIKE LOWER('" + filterParam.getPersonaCuit() + "%'))";
        } else {
            hql =
                    "JOIN c.sucursales s WHERE s.id = ('" + filterParam.getSucursalId() + "') " +
                            "AND (LOWER(c.razonSocial) LIKE LOWER('" + filterParam.getPersonaSocialReason() + "%') " +
                            "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getPersonaName() + "%') " +
                            "AND LOWER(c.direccion) LIKE LOWER('" + filterParam.getPersonaDirection() + "%') " +
                            "AND LOWER(c.nombreContacto) LIKE LOWER('" + filterParam.getPersonaContactName() + "%') " +
                            "AND LOWER(c.cuit) LIKE LOWER('" + filterParam.getPersonaCuit() + "%'))";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
