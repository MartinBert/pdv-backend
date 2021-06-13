package com.prysoft.pdv.dto;

import java.util.Date;

public class ZClosureFilter extends CommercialBranchFilter {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public String toString() {
        return "ZClosureFilter{" +
                "date=" + date +
                '}';
    }
}
