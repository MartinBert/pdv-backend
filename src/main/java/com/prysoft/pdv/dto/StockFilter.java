package com.prysoft.pdv.dto;
import com.prysoft.pdv.models.Sucursal;

public class StockFilter extends PageFilter{
    private Sucursal sucursal;

    public Long getSucursal() {
        return sucursal.getId();
    }
}
