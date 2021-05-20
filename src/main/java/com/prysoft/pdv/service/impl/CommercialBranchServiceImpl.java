package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CommercialBranchDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.CommercialBranchFilter;
import com.prysoft.pdv.models.CommercialBranch;
import com.prysoft.pdv.service.CommercialBranchService;
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
public class CommercialBranchServiceImpl extends FilterService<CommercialBranch> implements CommercialBranchService {

    @Autowired
    private CommercialBranchDao dao;

    @Override
    public CommercialBranch findById(Long id) {
        Optional<CommercialBranch> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<CommercialBranch> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public CommercialBranch saveOrUpdate(CommercialBranch entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<CommercialBranch> filter(CommercialBranchFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getSucursalName() + "%') " +
                    "AND LOWER(c.direccion) LIKE LOWER('" + filterParam.getSucursalDirection() + "%') " +
                    "AND LOWER(c.razonSocial) LIKE LOWER('" + filterParam.getSucursalSocialReason() + "%')";
        } else {
            hql = "WHERE (c.id) = ('" + filterParam.getSucursalId() + "') " +
                    "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getSucursalName() + "%') " +
                    "AND LOWER(c.razonSocial) LIKE LOWER('" + filterParam.getSucursalSocialReason() + "%') " +
                    "AND LOWER(c.direccion) LIKE LOWER('" + filterParam.getSucursalDirection() + "%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
