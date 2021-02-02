package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.MedioPago;
import com.prysoft.pdv.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@Transactional
public class VentaServiceImpl extends FilterService<ComprobanteFiscal> implements VentaService {

    @Autowired
    private ComprobanteFiscalDao dao;

    @Override
    public Page<ComprobanteFiscal> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getIdSucursal() == null){
            hql =
            "WHERE ((c.totalVenta) = ('"+filterParam.getDoubleParam()+"') " +
            "OR (c.fechaEmision) LIKE ('"+filterParam.getStringParam()+"%') " +
            "OR (c.cerrado) = ('"+filterParam.getStringParam()+"'))";
        }else{
            hql =
            "WHERE (c.sucursal.id) = ('"+filterParam.getIdSucursal()+"') " +
            "AND ((c.totalVenta) = ('"+filterParam.getDoubleParam()+"') " +
            "OR (c.fechaEmision) LIKE ('"+filterParam.getStringParam()+"%') " +
            "OR (c.numeroCbte) LIKE ('"+filterParam.getStringParam()+"%') " +
            "OR (c.cerrado) = ('"+filterParam.getStringParam()+"'))";
        }

        return getPage(hql , filterParam.getPage(), filterParam.getSize(), params);
    }

    @Override
    public ArrayList<ComprobanteFiscal> filterNotCloseReceipts(GenericFilter filterParam) {
        Iterable<ComprobanteFiscal> comprobantes = dao.findAll();
        ArrayList<ComprobanteFiscal> filteredReceipts = new ArrayList<>();
        comprobantes.forEach((ComprobanteFiscal comprobante) ->
            {
                if(filterParam.getIdSucursal() != null){
                    if(comprobante.getCerrado() == null && comprobante.getSucursal().getId() == filterParam.getIdSucursal()){
                        comprobante.getMediosPago().forEach((MedioPago medio) -> {
                            if(medio.getNombre().toLowerCase().equals("efectivo") || medio.getNombre().toLowerCase().equals("contado")){
                                filteredReceipts.add(comprobante);
                            }
                        });
                    }
                }else{
                    if(comprobante.getCerrado() == null){
                        filteredReceipts.add(comprobante);
                    }
                }
            }
        );

        return filteredReceipts;
    }
}


