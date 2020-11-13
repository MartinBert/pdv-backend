package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ComprobanteFiscalFilter;
import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.data.domain.Page;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public interface VentaService {
    JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException, SQLException, ParseException;
    Page<ComprobanteFiscal> filter(String id, int page, int size);

    Page<ComprobanteFiscal> filterVentas(VentaFilter request);
}

