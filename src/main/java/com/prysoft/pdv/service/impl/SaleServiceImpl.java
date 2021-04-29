package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.InvoiceDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.SaleFilter;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.models.MedioPago;
import com.prysoft.pdv.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@Transactional
public class SaleServiceImpl extends FilterService<Invoice> implements SaleService {

    @Autowired
    private InvoiceDao dao;

    @Override
    public Page<Invoice> filter(SaleFilter filterParam) {
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
    public ArrayList<Invoice> filterNotCloseReceipts(SaleFilter filterParam) {
        Iterable<Invoice> comprobantes = dao.findAll();
        ArrayList<Invoice> filteredReceipts = new ArrayList<>();
        Long sucursalId = filterParam.getSucursalId();
        comprobantes.forEach((Invoice comprobante) ->
            {
                if(isNotNull(sucursalId)){
                    if(passNotCloseReceiptValidations(comprobante, sucursalId)){
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

    private boolean passNotCloseReceiptValidations(Invoice comprobante, Long sucursalId){
        if(comprobante.getCerrado() != null) return false;
        if(comprobante.getSucursal().getId() != sucursalId) return false;
        return true;
    }

    private boolean isNotNull(Long value){
        if(value == null) return false;
        if(value.equals("")) return false;
        return true;
    }
}


