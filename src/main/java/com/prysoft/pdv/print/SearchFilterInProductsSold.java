package com.prysoft.pdv.print;

public class SearchFilterInProductsSold {
    private String search;
    private String initDate;
    private String finishDate;

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        return "SearchFilterInProductsSold{" +
                "search='" + search + '\'' +
                ", initDate='" + initDate + '\'' +
                ", finishDate='" + finishDate + '\'' +
                '}';
    }
}
