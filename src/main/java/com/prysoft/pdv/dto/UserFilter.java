package com.prysoft.pdv.dto;

public class UserFilter extends SalePointFilter {
    private Long usuarioId;
    private String usuarioName;
    private String usuarioUserName;
    private String sucursalSocialReason;
    private String puntoVentaName;

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioName() {
        return usuarioName;
    }

    public void setUsuarioName(String usuarioName) {
        this.usuarioName = usuarioName;
    }

    public String getUsuarioUserName() {
        return usuarioUserName;
    }

    public void setUsuarioUserName(String usuarioUserName) {
        this.usuarioUserName = usuarioUserName;
    }

    @Override
    public String getPuntoVentaName() {
        return super.getPuntoVentaName();
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
    public String getSucursalName() {
        return super.getSucursalName();
    }

    @Override
    public Long getEmpresaId() {
        return super.getEmpresaId();
    }

    @Override
    public String getPerfilName() {
        return super.getPerfilName();
    }

    @Override
    public String toString() {
        return "UsuarioFilter{" +
                "usuarioId=" + usuarioId +
                ", usuarioName='" + usuarioName + '\'' +
                ", usuarioUserName='" + usuarioUserName + '\'' +
                '}';
    }
}
