package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Venta;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public interface VentaService {

    Venta findById(Long id);

    Page<Venta> findAll(Pageable page);

    Venta saveOrUpdate(Venta entity);

    Page<Venta> filter(VentaFilter filter);

    void delete(Long id);

    JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException, SQLException, ParseException;
}

