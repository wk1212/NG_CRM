package com.ngcrm.model;

public class User {
    private Integer id;
    private String no;
    private String password;
    private String name;
    private Integer flag;
    private String headphoto;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                ", headphoto='" + headphoto + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public User() {

    }
}
