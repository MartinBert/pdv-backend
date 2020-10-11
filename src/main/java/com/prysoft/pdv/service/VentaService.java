package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Venta;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.IOException;
import java.sql.SQLException;

public interface VentaService {

    Venta findById(Long id);

    Page<Venta> findAll(Pageable page);

    Venta saveOrUpdate(Venta entity);

    Page<Venta> filter(VentaFilter filter);

    JasperPrint closeSaleReport(ComprobanteFiscal request) throws IOException, JRException, SQLException;

    void delete(Long id);
}

