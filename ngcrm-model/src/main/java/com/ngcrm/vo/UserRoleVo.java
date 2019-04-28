package com.ngcrm.vo;

import com.ngcrm.model.Role;
import com.ngcrm.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRoleVo extends User {
    //用户拥有的角色名字    ex:超管
    private List<String> role=new ArrayList<>();
    //用户所用的角色id      ex:1
    private List<Integer> rids=new ArrayList<>();
    //用户拥有的角色name  ex:root
    private List<String> rnames=new ArrayList<>();

    private List<Role> roleList=new ArrayList<>();

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public List<Integer> getRids() {
        return rids;
    }

    public void setRids(List<Integer> rids) {
        this.rids = rids;
    }

    public List<String> getRnames() {
        return rnames;
    }

    public void setRnames(List<String> rnames) {
        this.rnames = rnames;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public UserRoleVo() {

    }
}
