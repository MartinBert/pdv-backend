package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.InvoiceDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.InvoiceFilter;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.service.InvoiceService;
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
public class InvoiceServiceImpl extends FilterService<Invoice> implements InvoiceService {

    @Autowired
    private InvoiceDao dao;

    @Override
    public Invoice findById(Long id) {
        Optional<Invoice> optional = dao.findById(id);
        if (optional.isEmpty()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Invoice findByNumeroCbte(String numero) {
        Optional<Invoice> optional = dao.findByNumeroCbte(numero);
        if (optional.isEmpty()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Invoice> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Invoice saveOrUpdate(Invoice entity) {
        System.out.println(entity);
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<Invoice> saveOrUpdateAll(ArrayList<Invoice> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public Page<Invoice> filter(InvoiceFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql =
                    "WHERE LOWER(c.letra) LIKE LOWER('" + filterParam.getComprobanteFiscalLetra() + "') " +
                    "AND LOWER(c.fechaEmision) LIKE LOWER('" + filterParam.getComprobanteFiscalFechaEmision() + "%') " +
                    "AND LOWER(c.numeroCbte) LIKE LOWER('" + filterParam.getComprobanteFiscalNumeroCbte() + "%') " +
                    "AND LOWER(c.nombreDocumento) LIKE LOWER('" + filterParam.getComprobanteFiscalNombreDocumento() + "%') ";
        } else {
            hql =
                    "WHERE (c.sucursal.id) = ('" + filterParam.getSucursalId() + "') " +
                    "AND LOWER(c.letra) LIKE LOWER('" + filterParam.getComprobanteFiscalLetra() + "') " +
                    "AND LOWER(c.fechaEmision) LIKE LOWER('" + filterParam.getComprobanteFiscalFechaEmision() + "%') " +
                    "AND LOWER(c.numeroCbte) LIKE LOWER('" + filterParam.getComprobanteFiscalNumeroCbte() + "%') " +
                    "AND LOWER(c.nombreDocumento) LIKE LOWER('" + filterParam.getComprobanteFiscalNombreDocumento() + "%') ";
        }
        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}

