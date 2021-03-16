package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.VentaFilter;
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
    public Page<ComprobanteFiscal> filter(VentaFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getSucursalId() == null){
            hql =
            "WHERE ((c.totalVenta) = ('"+filterParam.getTotalVenta()+"') " +
            "OR (c.fechaEmision) LIKE ('"+filterParam.getFechaEmision()+"%') " +
            "OR (c.cerrado) = ('"+filterParam.getComprobanteCerrado()+"'))";
        }else{
            if(filterParam.getBlackReceiptFilter() != null && filterParam.getBlackReceiptFilter() == 999999999){
                hql =
                "WHERE (c.sucursal.id) = ('"+filterParam.getSucursalId()+"') " +
                "AND (LOWER(c.documentoComercial.letra) LIKE LOWER('x%') " +
                "OR LOWER(c.documentoComercial.letra) LIKE LOWER('nx%'))" +
                "AND (c.fechaEmision) LIKE ('"+filterParam.getFechaEmision()+"%') " +
                "AND LOWER(c.numeroCbte) LIKE LOWER('"+filterParam.getNumeroComprobante()+"%')";
            }else{
                hql =
                "WHERE (c.sucursal.id) = ('"+filterParam.getSucursalId()+"') " +
                "AND (LOWER(c.documentoComercial.letra) != ('x') " +
                "AND LOWER(c.documentoComercial.letra) != ('nx'))" +
                "AND LOWER(c.fechaEmision) LIKE LOWER('"+filterParam.getFechaEmision()+"%') " +
                "AND LOWER(c.numeroCbte) LIKE LOWER('"+filterParam.getNumeroComprobante()+"%')";
            }
        }

        return getPage(hql , filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public ArrayList<ComprobanteFiscal> filterNotCloseReceipts(VentaFilter filterParam) {
        Iterable<ComprobanteFiscal> comprobantes = dao.findAll();
        ArrayList<ComprobanteFiscal> filteredReceipts = new ArrayList<>();
        comprobantes.forEach((ComprobanteFiscal comprobante) ->
            {
                if(filterParam.getSucursalId() != null){
                    if(comprobante.getCerrado() == null && comprobante.getSucursal().getId() == filterParam.getSucursalId()){
                        comprobante.getMediosPago().forEach((MedioPago medio) -> {
                            if(medio.isSumaEnCierreDeCaja()){
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


