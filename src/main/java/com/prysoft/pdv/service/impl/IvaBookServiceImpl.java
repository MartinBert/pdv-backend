package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.IvaBookFilter;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.service.IvaBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class IvaBookServiceImpl extends FilterService<Invoice> implements IvaBookService{

    @Autowired
    private EntityManager entityManager;

    @Override
    public Page<Invoice> filter(IvaBookFilter filterParams) {
        if(
            filterParams.getFechaDesdeString() == null ||
            filterParams.getFechaHastaString() == null ||
            filterParams.getFechaHastaString() == "" ||
            filterParams.getFechaHastaString() == ""
        ){
            List<FilterParam> params = new ArrayList<>();
            StringBuilder hql = new StringBuilder();
            hql.append("JOIN c.sucursal s ");
            hql.append("JOIN c.documentoComercial d ");
            hql.append("WHERE s.id = '" + filterParams.getSucursalId() + "' ");
            hql.append("AND d.letra <> 'X'");
            hql.append("AND d.letra <> 'NX'");
            hql.append("AND d.letra <> 'P'");
            hql.append(buildHql(filterParams.isFacturaA(), filterParams.isFacturaB(), filterParams.isFacturaC()));
            return getPage(hql.toString(), filterParams.getPage() - 1, filterParams.getSize(), params);
        }else{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try{
                Date fechaDesde = simpleDateFormat.parse(filterParams.getFechaDesdeString());
                Date fechaHasta = simpleDateFormat.parse(filterParams.getFechaHastaString());
                StringBuilder HqlBuilder = new StringBuilder();
                HqlBuilder.append("SELECT c FROM Invoice c ");
                HqlBuilder.append("JOIN c.sucursal s ");
                HqlBuilder.append("JOIN c.documentoComercial d ");
                HqlBuilder.append("WHERE s.id = ");
                HqlBuilder.append(filterParams.getSucursalId());
                HqlBuilder.append("AND d.letra <> 'X' ");
                HqlBuilder.append("AND d.letra <> 'NX' ");
                HqlBuilder.append("AND d.letra <> 'P' ");
                HqlBuilder.append(buildHql(filterParams.isFacturaA(), filterParams.isFacturaB(), filterParams.isFacturaC()));
                HqlBuilder.append("AND to_date(c.fechaEmision, 'dd/MM/yyyy') BETWEEN '");
                HqlBuilder.append(fechaDesde);
                HqlBuilder.append("' AND '");
                HqlBuilder.append(fechaHasta);
                HqlBuilder.append("' ");
                HqlBuilder.append("ORDER BY trim(trailing '0' from c.numeroCbte) DESC");
                String HQL = HqlBuilder.toString();
                return getPaginateDateRangeResults(HQL, filterParams.getPage() - 1, filterParams.getSize());
            }catch (Exception err){
                System.err.println(err);
            }
            return null;
        }
    }

    private String buildHql (boolean facturaA, boolean facturaB, boolean facturaC) {
        String stringForFacturaA = "AND (c.nombreDocumento = 'FACTURAS A') ";
        String stringForFacturaB = "AND (c.nombreDocumento = 'FACTURAS B') ";
        String stringForFacturaC = "AND (c.nombreDocumento = 'FACTURAS C') ";
        StringBuilder stringToHql = new StringBuilder();
        if(facturaA) stringToHql.append(stringForFacturaA);
        if(facturaB) stringToHql.append(stringForFacturaB);
        if(facturaC) stringToHql.append(stringForFacturaC);
        String formattedString = stringToHql.toString();
        List<String> list = List.of(formattedString.split(" "));
        int count = 0;
        for(String l: list){
            if(l.equals("AND")){
                count++;
            }
        }
        if(count > 1){
            String firstReplacedString = formattedString.replaceAll("AND", "OR");
            String secondReplacedString = firstReplacedString.replaceFirst("OR", "AND");
            String thirdReplacedString = secondReplacedString.replaceFirst("AND ", "AND (") + ")";
            return thirdReplacedString;
        }
        return formattedString;
    }

    private Page<Invoice> getPaginateDateRangeResults(String HQL, int page, int size){
        int totalObjects = entityManager.createQuery(HQL, Invoice.class).getResultList().size();
        Pageable pageable = PageRequest.of(page, size);
        int limit = pageable.getPageSize();
        TypedQuery<Invoice> query = entityManager.createQuery(HQL, Invoice.class);
        query.setFirstResult(page * limit);
        query.setMaxResults(limit);
        for(Invoice fecha: query.getResultList()){
            System.out.println(fecha.getFechaEmision());
        }
        return new PageImpl<>(query.getResultList(), pageable, totalObjects);
    }

}
