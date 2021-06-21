package com.prysoft.pdv.print;

import java.io.Serializable;
import java.util.ArrayList;

public class PrintZCLosure implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    private String businessSocialReason;
    private String commercialBranchSocialReason;
    private String commercialBranchCuit;
    private String commercialBranchIvaCondition;
    private String commercialBranchDirection;
    private String issueDate;
    private String issueHour;
    private String receiptNumber;
    private ArrayList<DetailOfPaymentMethodsForPrintInZClosure> paymentMethodsDetail;
    private Double total;
    private Double totalIva;
    private Double totalIva21;
    private Double totalIva10;
    private Double totalIva27;
    private int cantidadVentas;

    public String getBusinessSocialReason() {
        return businessSocialReason;
    }

    public void setBusinessSocialReason(String businessSocialReason) {
        this.businessSocialReason = businessSocialReason;
    }

    public String getCommercialBranchSocialReason() {
        return commercialBranchSocialReason;
    }

    public void setCommercialBranchSocialReason(String commercialBranchSocialReason) {
        this.commercialBranchSocialReason = commercialBranchSocialReason;
    }

    public String getCommercialBranchCuit() {
        return commercialBranchCuit;
    }

    public void setCommercialBranchCuit(String commercialBranchCuit) {
        this.commercialBranchCuit = commercialBranchCuit;
    }

    public String getCommercialBranchIvaCondition() {
        return commercialBranchIvaCondition;
    }

    public void setCommercialBranchIvaCondition(String commercialBranchIvaCondition) {
        this.commercialBranchIvaCondition = commercialBranchIvaCondition;
    }

    public String getCommercialBranchDirection() {
        return commercialBranchDirection;
    }

    public void setCommercialBranchDirection(String commercialBranchDirection) {
        this.commercialBranchDirection = commercialBranchDirection;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueHour() {
        return issueHour;
    }

    public void setIssueHour(String issueHour) {
        this.issueHour = issueHour;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }

    public Double getTotalIva21() {
        return totalIva21;
    }

    public void setTotalIva21(Double totalIva21) {
        this.totalIva21 = totalIva21;
    }

    public Double getTotalIva10() {
        return totalIva10;
    }

    public void setTotalIva10(Double totalIva10) {
        this.totalIva10 = totalIva10;
    }

    public Double getTotalIva27() {
        return totalIva27;
    }

    public void setTotalIva27(Double totalIva27) {
        this.totalIva27 = totalIva27;
    }

    public ArrayList<DetailOfPaymentMethodsForPrintInZClosure> getPaymentMethodsDetail() {
        return paymentMethodsDetail;
    }

    public void setPaymentMethodsDetail(ArrayList<DetailOfPaymentMethodsForPrintInZClosure> paymentMethodsDetail) {
        this.paymentMethodsDetail = paymentMethodsDetail;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    @Override
    public String toString() {
        return "PrintZCLosure{" +
                "businessSocialReason='" + businessSocialReason + '\'' +
                ", commercialBranchSocialReason='" + commercialBranchSocialReason + '\'' +
                ", commercialBranchCuit='" + commercialBranchCuit + '\'' +
                ", commercialBranchIvaCondition='" + commercialBranchIvaCondition + '\'' +
                ", commercialBranchDirection='" + commercialBranchDirection + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", issueHour='" + issueHour + '\'' +
                ", receiptNumber='" + receiptNumber + '\'' +
                ", paymentMethodsDetail=" + paymentMethodsDetail +
                ", total=" + total +
                ", totalIva=" + totalIva +
                ", totalIva21=" + totalIva21 +
                ", totalIva10=" + totalIva10 +
                ", totalIva27=" + totalIva27 +
                ", cantidadVentas=" + cantidadVentas +
                '}';
    }
}
