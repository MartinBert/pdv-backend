package com.prysoft.pdv.dto;

public class GenericFilter extends PageFilter {
    private String stringParam;
    private String secondStringParam;
    private String thirdStringParam;
    private String fourthStringParam;
    private String fifthStringParam;
    private double doubleParam;
    private double secondDoubleParam;
    private double thirdDoubleParam;
    private Long secondLongParam;
    private Long longParam;
    private Long thirdLongParam;
    private Long fourthLongParam;
    private Long fifthLongParam;
    private int page;
    private int size;

    public String getStringParam() {
        return stringParam;
    }

    public void setStringParam(String stringParam) {
        this.stringParam = stringParam;
    }

    @Override
    public int getPage() {
        return page;
    }

    @Override
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    public Long getThirdLongParam() {
        return thirdLongParam;
    }

    public void setThirdLongParam(Long thirdLongParam) {
        this.thirdLongParam = thirdLongParam;
    }

    public double getDoubleParam() {
        return doubleParam;
    }

    public void setDoubleParam(double doubleParam) {
        this.doubleParam = doubleParam;
    }

    public Long getSecondLongParam() {
        return secondLongParam;
    }

    public void setSecondLongParam(Long secondLongParam) {
        this.secondLongParam = secondLongParam;
    }

    public Long getFourthLongParam() {
        return fourthLongParam;
    }

    public void setFourthLongParam(Long fourthLongParam) {
        this.fourthLongParam = fourthLongParam;
    }

    public Long getLongParam() {
        return longParam;
    }

    public void setLongParam(Long longParam) {
        this.longParam = longParam;
    }

    public String getSecondStringParam() {
        return secondStringParam;
    }

    public void setSecondStringParam(String secondStringParam) {
        this.secondStringParam = secondStringParam;
    }

    public String getThirdStringParam() {
        return thirdStringParam;
    }

    public void setThirdStringParam(String thirdStringParam) {
        this.thirdStringParam = thirdStringParam;
    }

    public double getSecondDoubleParam() {
        return secondDoubleParam;
    }

    public void setSecondDoubleParam(double secondDoubleParam) {
        this.secondDoubleParam = secondDoubleParam;
    }

    public double getThirdDoubleParam() {
        return thirdDoubleParam;
    }

    public void setThirdDoubleParam(double thirdDoubleParam) {
        this.thirdDoubleParam = thirdDoubleParam;
    }

    public String getFourthStringParam() {
        return fourthStringParam;
    }

    public void setFourthStringParam(String fourthStringParam) {
        this.fourthStringParam = fourthStringParam;
    }

    public String getFifthStringParam() {
        return fifthStringParam;
    }

    public void setFifthStringParam(String fifthStringParam) {
        this.fifthStringParam = fifthStringParam;
    }

    public Long getFifthLongParam() {
        return fifthLongParam;
    }

    public void setFifthLongParam(Long fifthLongParam) {
        this.fifthLongParam = fifthLongParam;
    }

    @Override
    public String toString() {
        return "GenericFilter{" +
                "stringParam='" + stringParam + '\'' +
                ", secondStringParam='" + secondStringParam + '\'' +
                ", thirdStringParam='" + thirdStringParam + '\'' +
                ", fourthStringParam='" + fourthStringParam + '\'' +
                ", fifthStringParam='" + fifthStringParam + '\'' +
                ", doubleParam=" + doubleParam +
                ", secondDoubleParam=" + secondDoubleParam +
                ", thirdDoubleParam=" + thirdDoubleParam +
                ", secondLongParam=" + secondLongParam +
                ", longParam=" + longParam +
                ", thirdLongParam=" + thirdLongParam +
                ", fourthLongParam=" + fourthLongParam +
                ", fifthLongParam=" + fifthLongParam +
                ", page=" + page +
                ", size=" + size +
                '}';
    }
}
