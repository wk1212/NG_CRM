package com.ngcrm.model;

import java.util.Date;

public class TChance {
    private Long chno;

    private String chsource;

    private String chcustname;

    private String chtitle;

    private Integer chrate;

    private String chlinkman;

    private String chtel;

    private String chdesc;

    private Integer chcreateid;

    private String chcreateby;

    private Date chcreatedate;

    private Integer chdueid;

    private String chdueto;

    private Date chduedate;

    private String chstatus;

    public Long getChno() {
        return chno;
    }

    public void setChno(Long chno) {
        this.chno = chno;
    }

    public String getChsource() {
        return chsource;
    }

    public void setChsource(String chsource) {
        this.chsource = chsource == null ? null : chsource.trim();
    }

    public String getChcustname() {
        return chcustname;
    }

    public void setChcustname(String chcustname) {
        this.chcustname = chcustname == null ? null : chcustname.trim();
    }

    public String getChtitle() {
        return chtitle;
    }

    public void setChtitle(String chtitle) {
        this.chtitle = chtitle == null ? null : chtitle.trim();
    }

    public Integer getChrate() {
        return chrate;
    }

    public void setChrate(Integer chrate) {
        this.chrate = chrate;
    }

    public String getChlinkman() {
        return chlinkman;
    }

    public void setChlinkman(String chlinkman) {
        this.chlinkman = chlinkman == null ? null : chlinkman.trim();
    }

    public String getChtel() {
        return chtel;
    }

    public void setChtel(String chtel) {
        this.chtel = chtel == null ? null : chtel.trim();
    }

    public String getChdesc() {
        return chdesc;
    }

    public void setChdesc(String chdesc) {
        this.chdesc = chdesc == null ? null : chdesc.trim();
    }

    public Integer getChcreateid() {
        return chcreateid;
    }

    public void setChcreateid(Integer chcreateid) {
        this.chcreateid = chcreateid;
    }

    public String getChcreateby() {
        return chcreateby;
    }

    public void setChcreateby(String chcreateby) {
        this.chcreateby = chcreateby == null ? null : chcreateby.trim();
    }

    public Date getChcreatedate() {
        return chcreatedate;
    }

    public void setChcreatedate(Date chcreatedate) {
        this.chcreatedate = chcreatedate;
    }

    public Integer getChdueid() {
        return chdueid;
    }

    public void setChdueid(Integer chdueid) {
        this.chdueid = chdueid;
    }

    public String getChdueto() {
        return chdueto;
    }

    public void setChdueto(String chdueto) {
        this.chdueto = chdueto == null ? null : chdueto.trim();
    }

    public Date getChduedate() {
        return chduedate;
    }

    public void setChduedate(Date chduedate) {
        this.chduedate = chduedate;
    }

    public String getChstatus() {
        return chstatus;
    }

    public void setChstatus(String chstatus) {
        this.chstatus = chstatus == null ? null : chstatus.trim();
    }
}