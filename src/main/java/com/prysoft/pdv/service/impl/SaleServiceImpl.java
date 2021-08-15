package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.InvoiceDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.SaleFilter;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.models.PaymentMethod;
import com.prysoft.pdv.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SaleServiceImpl extends FilterService<Invoice> implements SaleService {
    @Autowired
    private InvoiceDao dao;

    @Override
    public Page<Invoice> filter(SaleFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql =
                    "WHERE ((c.totalVenta) = ('" + filterParam.getTotalVenta() + "') " +
                    "OR (c.fechaEmision) LIKE ('%" + filterParam.getFechaEmision() + "%') " +
                    "OR (c.cerrado) = ('" + filterParam.getComprobanteCerrado() + "'))";
        } else {
            if (filterParam.getBlackReceiptFilter() != null && filterParam.getBlackReceiptFilter() == 999999999) {
                hql =
                        "JOIN c.sucursal s " +
                        "JOIN c.documentoComercial d " +
                        "WHERE (s.id) = ('" + filterParam.getSucursalId() + "') " +
                        "AND (LOWER(d.letra) LIKE LOWER('x%') " +
                        "OR LOWER(d.letra) LIKE LOWER('nx%'))" +
                        "AND LOWER(d.letra) <> ('p') " +
                        "AND (c.fechaEmision) LIKE ('" + filterParam.getFechaEmision() + "%') " +
                        "AND LOWER(c.numeroCbte) LIKE LOWER('" + filterParam.getNumeroComprobante() + "%') " +
                        "GROUP BY c.id ORDER BY c.id DESC";
            } else {
                hql =
                        "JOIN c.sucursal s " +
                        "JOIN c.documentoComercial d " +
                        "WHERE (s.id) = ('" + filterParam.getSucursalId() + "') " +
                        "AND LOWER(d.letra) <> ('x') " +
                        "AND LOWER(d.letra) <> ('nx') " +
                        "AND LOWER(d.letra) <> ('p') " +
                        "AND LOWER(c.fechaEmision) LIKE LOWER('%" + filterParam.getFechaEmision() + "%')" +
                        "AND LOWER(c.numeroCbte) LIKE LOWER('%" + filterParam.getNumeroComprobante() + "%') " +
                        "GROUP BY c.id ORDER BY c.id DESC";
            }
        }

        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public ArrayList<Invoice> filterNotCloseReceipts(SaleFilter filterParam) {
        Iterable<Invoice> comprobantes = dao.findAll();
        ArrayList<Invoice> filteredReceipts = new ArrayList<>();
        Long sucursalId = filterParam.getSucursalId();
        comprobantes.forEach((Invoice comprobante) ->
                {
                    if (isNotNull(sucursalId)) {
                        if (passNotCloseReceiptValidations(comprobante, sucursalId)) {
                            comprobante.getMediosPago().forEach((PaymentMethod medio) -> {
                                if (medio.isSumaEnCierreDeCaja() && !comprobante.getLetra().equals("P")) {
                                    filteredReceipts.add(comprobante);
                                }
                            });
                        }
                    } else {
                        if (comprobante.getCerrado() == null) {
                            filteredReceipts.add(comprobante);
                        }
                    }
                }
        );
        return filteredReceipts;
    }

    @Override
    public Page<Invoice> getUniqueDateSales(SaleFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql = "";
        } else {
            hql =
                    "JOIN c.mediosPago m " +
                    "JOIN c.documentoComercial d " +
                    "JOIN c.sucursal s " +
                    "WHERE (s.id) = ('" + filterParam.getSucursalId() + "') " +
                    "AND LOWER(d.letra) NOT IN ('%x%', '%nx%') " +
                    "AND LOWER(c.fechaEmision) LIKE LOWER('%" + filterParam.getFechaEmision() + "%') " +
                    "AND c.cerradoEnCierreZ = false " +
                    "AND m.aplicaCierreZ = true";
        }

        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public String getPreviousCorrelativeDocumentNumber(Long sucursalId, String codigoDocumento) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (sucursalId == null) {
            hql = "";
        } else {
            hql =
                    "JOIN c.documentoComercial d " +
                    "JOIN c.sucursal s " +
                    "WHERE (s.id) = ('" + sucursalId + "') " +
                    "AND LOWER(d.codigoDocumento) LIKE LOWER('%" + codigoDocumento + "%') " +
                    "GROUP BY c.id ORDER BY c.id DESC";
        }
        Page<Invoice> result = getPage(hql, 0, 1, params);
        if(result.getContent().isEmpty()){
            return "0";
        }else{
            String correlativoComprobante = result.getContent().get(0).getCorrelativoComprobante();
            if(correlativoComprobante != null){
                return correlativoComprobante;
            }else {
                return "0";
            }
        }
    }

    @Override
    public Page<Invoice> getPresupuestos(SaleFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql = "";
        } else {
            if(filterParam.isValidityStatus()){
                hql =
                        "JOIN c.documentoComercial d " +
                                "JOIN c.sucursal s " +
                                "WHERE (s.id) = ('" + filterParam.getSucursalId() + "') " +
                                "AND (d.presupuesto) = true " +
                                "AND LOWER(c.vencido) LIKE LOWER('%vigente%') " +
                                "AND LOWER(c.fechaEmision) LIKE LOWER('%" + filterParam.getFechaEmision() + "%')" +
                                "AND LOWER(c.numeroCbte) LIKE LOWER('%" + filterParam.getNumeroComprobante() + "%') " +
                                "GROUP BY c.id ORDER BY c.id DESC";
            }else{
                hql =
                        "JOIN c.documentoComercial d " +
                                "JOIN c.sucursal s " +
                                "WHERE (s.id) = ('" + filterParam.getSucursalId() + "') " +
                                "AND (d.presupuesto) = true " +
                                "AND LOWER(c.vencido) LIKE LOWER('%vencido%') " +
                                "AND LOWER(c.fechaEmision) LIKE LOWER('%" + filterParam.getFechaEmision() + "%')" +
                                "AND LOWER(c.numeroCbte) LIKE LOWER('%" + filterParam.getNumeroComprobante() + "%') " +
                                "GROUP BY c.id ORDER BY c.id DESC";
            }
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    private boolean passNotCloseReceiptValidations(Invoice comprobante, Long sucursalId) {
        if (comprobante.getCerrado() != null) return false;
        return comprobante.getSucursal().getId() == sucursalId;
    }

    private boolean isNotNull(Long value) {
        if (value == null) return false;
        return !value.equals("");
    }
}


