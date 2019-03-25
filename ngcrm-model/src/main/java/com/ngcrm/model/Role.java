package com.ngcrm.model;

public class Role {
    private Integer id;
    private String info;
    private String name;
    private Integer parentId;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Role() {

    }
}
