package com.ngcrm.model;

import java.util.Date;

public class TPlan {
    private Integer pid;

    private Integer chid;

    private Date pdate;

    private String ptodo;

    private String presult;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getChid() {
        return chid;
    }

    public void setChid(Integer chid) {
        this.chid = chid;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getPtodo() {
        return ptodo;
    }

    public void setPtodo(String ptodo) {
        this.ptodo = ptodo == null ? null : ptodo.trim();
    }

    public String getPresult() {
        return presult;
    }

    public void setPresult(String presult) {
        this.presult = presult == null ? null : presult.trim();
    }
}