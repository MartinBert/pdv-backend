package com.prysoft.pdv.dto;

public class HistorialMovimientosStockFilter extends SucursalFilter {
    private String historialMovimientosStockDescripcion;
    private String historialMovimientosStockFecha;
    private String historialMovimientosStockUsuario;

    public String getHistorialMovimientosStockDescripcion() {
        return historialMovimientosStockDescripcion;
    }

    public void setHistorialMovimientosStockDescripcion(String historialMovimientosStockDescripcion) {
        this.historialMovimientosStockDescripcion = historialMovimientosStockDescripcion;
    }

    public String getHistorialMovimientosStockFecha() {
        return historialMovimientosStockFecha;
    }

    public void setHistorialMovimientosStockFecha(String historialMovimientosStockFecha) {
        this.historialMovimientosStockFecha = historialMovimientosStockFecha;
    }

    public String getHistorialMovimientosStockUsuario() {
        return historialMovimientosStockUsuario;
    }

    public void setHistorialMovimientosStockUsuario(String historialMovimientosStockUsuario) {
        this.historialMovimientosStockUsuario = historialMovimientosStockUsuario;
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String toString() {
        return "HistorialMovimientosStockFilter{" +
                "historialMovimientosStockDescripcion='" + historialMovimientosStockDescripcion + '\'' +
                ", historialMovimientosStockFecha='" + historialMovimientosStockFecha + '\'' +
                ", historialMovimientosStockUsuario='" + historialMovimientosStockUsuario + '\'' +
                '}';
    }
}
