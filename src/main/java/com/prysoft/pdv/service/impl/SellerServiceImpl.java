package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.SellerDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.SellerFilter;
import com.prysoft.pdv.models.Seller;
import com.prysoft.pdv.service.SellerService;
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
public class SellerServiceImpl extends FilterService<Seller> implements SellerService {
    @Autowired
    private SellerDao dao;

    @Override
    public Seller findById(Long id) {
        Optional<Seller> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Seller> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Seller saveOrUpdate(Seller entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Seller> filter(SellerFilter filterParam) {
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
