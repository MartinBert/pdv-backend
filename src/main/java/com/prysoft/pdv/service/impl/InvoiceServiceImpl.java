package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.InvoiceDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.InvoiceFilter;
import com.prysoft.pdv.helpers.DateHelper;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.*;

@Service
@Transactional
public class InvoiceServiceImpl extends FilterService<Invoice> implements InvoiceService {

    @Autowired
    private InvoiceDao dao;

    @Autowired
    private DateHelper dateHelper;

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
                    "AND LOWER(c.nombreDocumento) LIKE LOWER('" + filterParam.getComprobanteFiscalNombreDocumento() + "%')";
        } else {
            hql =
                    "WHERE (c.sucursal.id) = ('" + filterParam.getSucursalId() + "') " +
                    "AND LOWER(c.letra) LIKE LOWER('" + filterParam.getComprobanteFiscalLetra() + "') " +
                    "AND LOWER(c.fechaEmision) LIKE LOWER('" + filterParam.getComprobanteFiscalFechaEmision() + "%') " +
                    "AND LOWER(c.numeroCbte) LIKE LOWER('" + filterParam.getComprobanteFiscalNumeroCbte() + "%') " +
                    "AND LOWER(c.nombreDocumento) LIKE LOWER('" + filterParam.getComprobanteFiscalNombreDocumento() + "%') " +
                    "GROUP BY c.id ORDER BY c.id DESC";
        }
        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }

    @Override
    public  List<Invoice> getInvoicesForDateRange(InvoiceFilter filterParams){
        List<Invoice> invoices = dao.findBySucursalId(filterParams.getSucursalId());
        List<Invoice> filteredInvoices = new ArrayList<>();
        for(Invoice invoice: invoices){
            Double dateOfInvoice = dateHelper.stringDateToDoubleConvertion(invoice.getFechaEmision());
            if(dateOfInvoice >= filterParams.getFechaDesde() && dateOfInvoice <= filterParams.getFechaHasta()){
                if(invoice.getNombreDocumento().equals("FACTURAS A") || invoice.getNombreDocumento().equals("FACTURAS B") || invoice.getNombreDocumento().equals("FACTURAS C")){
                    filteredInvoices.add(invoice);
                }
            }
        }

        filteredInvoices.sort(Comparator.comparing(Invoice::getIntegerDate).reversed());

        return filteredInvoices;
    }
}

