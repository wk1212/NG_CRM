package com.ngcrm.model;

public class ZtreeVo {  //Ztree类
    /**
     *     { id:1, pId:0, name:"随意勾选 1", open:true},  Ztree数据格式
     */
    private Integer id;//当前节点id
    private Integer pId;//父节点id
    private String name;//节点名字
    private Boolean open;
    private Boolean checked;

    @Override
    public String toString() {
        return "ZtreeVo{" +
                "id=" + id +
                ", pId=" + pId +
                ", name='" + name + '\'' +
                ", open=" + open +
                ", checked=" + checked +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public ZtreeVo() {

    }
}
