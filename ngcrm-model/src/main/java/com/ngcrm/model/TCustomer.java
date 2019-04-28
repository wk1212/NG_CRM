package com.ngcrm.model;

import java.util.Date;

public class TCustomer {
    private Integer cno;

    private String cname;

    private String ctel;

    private String cdesc;

    private Date ccre;

    private Date ctime;

    private String cnation;

    private String caddress;

    private String cemail;

    private String cincome;

    private String ctype;

    private Integer cempnumber;

    private String cstatus;

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCtel() {
        return ctel;
    }

    public void setCtel(String ctel) {
        this.ctel = ctel == null ? null : ctel.trim();
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc == null ? null : cdesc.trim();
    }

    public Date getCcre() {
        return ccre;
    }

    public void setCcre(Date ccre) {
        this.ccre = ccre;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getCnation() {
        return cnation;
    }

    public void setCnation(String cnation) {
        this.cnation = cnation == null ? null : cnation.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail == null ? null : cemail.trim();
    }

    public String getCincome() {
        return cincome;
    }

    public void setCincome(String cincome) {
        this.cincome = cincome == null ? null : cincome.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public Integer getCempnumber() {
        return cempnumber;
    }

    public void setCempnumber(Integer cempnumber) {
        this.cempnumber = cempnumber;
    }

    public String getCstatus() {
        return cstatus;
    }

    public void setCstatus(String cstatus) {
        this.cstatus = cstatus == null ? null : cstatus.trim();
    }
}