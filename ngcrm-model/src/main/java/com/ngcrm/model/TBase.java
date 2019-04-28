package com.ngcrm.model;

public class TBase {
    private Integer bid;

    private String btype;

    private String bitem;

    private String bvalue;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getBitem() {
        return bitem;
    }

    public void setBitem(String bitem) {
        this.bitem = bitem == null ? null : bitem.trim();
    }

    public String getBvalue() {
        return bvalue;
    }

    public void setBvalue(String bvalue) {
        this.bvalue = bvalue == null ? null : bvalue.trim();
    }
}