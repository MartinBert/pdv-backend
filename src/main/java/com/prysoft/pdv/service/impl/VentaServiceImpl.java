package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.VentaService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@Transactional
public class VentaServiceImpl extends FilterService<ComprobanteFiscal> implements VentaService {
    @Override
    public Page<ComprobanteFiscal> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getId() == null){
            hql =
            "WHERE ((c.totalVenta) = ('"+filterParam.getDoubleParam()+"') " +
            "OR (c.fechaEmision) LIKE ('"+filterParam.getParam()+"%') " +
            "OR (c.cerrado) = ('"+filterParam.getParam()+"'))";
        }else{
            hql =
            "WHERE (c.sucursal.id) = ('"+filterParam.getId()+"') " +
            "AND ((c.totalVenta) = ('"+filterParam.getDoubleParam()+"') " +
            "OR (c.fechaEmision) LIKE ('"+filterParam.getParam()+"%') " +
            "OR (c.numeroCbte) LIKE ('"+filterParam.getParam()+"%') " +
            "OR (c.cerrado) = ('"+filterParam.getParam()+"'))";
        }

        return getPage(hql , filterParam.getPage(), filterParam.getSize(), params);
    }

    @Override
    public Page<ComprobanteFiscal> filterNotCloseReceipts(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        if(filterParam.getId() == null){
            hql ="";
        }else{
            hql = "WHERE (c.sucursal.id) = ('"+filterParam.getId()+"') AND (c.cerrado) = ('"+filterParam.getParam()+"')";
        }

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}


