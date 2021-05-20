package com.prysoft.pdv.dto;

public class CommercialBranchFilter extends BusinessFilter {
    private Long sucursalId;
    private String sucursalName;
    private String sucursalSocialReason;
    private String sucursalCuit;
    private String sucursalDirection;

    public Long getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Long sucursalId) {
        this.sucursalId = sucursalId;
    }

    public String getSucursalName() {
        return sucursalName;
    }

    public void setSucursalName(String sucursalName) {
        this.sucursalName = sucursalName;
    }

    public String getSucursalSocialReason() {
        return sucursalSocialReason;
    }

    public void setSucursalSocialReason(String sucursalSocialReason) {
        this.sucursalSocialReason = sucursalSocialReason;
    }

    public String getSucursalDirection() {
        return sucursalDirection;
    }

    public void setSucursalDirection(String sucursalDirection) {
        this.sucursalDirection = sucursalDirection;
    }

    public String getSucursalCuit() {
        return sucursalCuit;
    }

    public void setSucursalCuit(String sucursalCuit) {
        this.sucursalCuit = sucursalCuit;
    }

    @Override
    public Long getPerfilId() {
        return super.getPerfilId();
    }

    @Override
    public void setPerfilId(Long perfilId) {
        super.setPerfilId(perfilId);
    }

    @Override
    public String getPerfilName() {
        return super.getPerfilName();
    }

    @Override
    public void setPerfilName(String perfilName) {
        super.setPerfilName(perfilName);
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public void setPage(int page) {
        super.setPage(page);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public String getOrder() {
        return super.getOrder();
    }

    @Override
    public void setOrder(String order) {
        super.setOrder(order);
    }

    @Override
    public String toString() {
        return "SucursalFilter{" +
                "sucursalId=" + sucursalId +
                ", sucursalName='" + sucursalName + '\'' +
                ", sucursalSocialReason='" + sucursalSocialReason + '\'' +
                ", sucursalCuit='" + sucursalCuit + '\'' +
                '}';
    }
}
