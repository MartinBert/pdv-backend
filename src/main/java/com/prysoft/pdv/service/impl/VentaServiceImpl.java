package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.VentaFilter;
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
    public Page<ComprobanteFiscal> filter(String id, int page, int size) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "WHERE (c.sucursal.id) = ('"+id+"')";
        return getPage(hql , page, size, params);
    }

    @Override
    public Page<ComprobanteFiscal> filterVentas(VentaFilter request) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "WHERE (c.sucursal.id) = ('"+request.getSucursal()+"') AND (c."+request.getFilterParam()+") = ('"+request.getFilter()+"')";
        return getPage(hql , request.getPage(), request.getSize(), params);
    }

}

