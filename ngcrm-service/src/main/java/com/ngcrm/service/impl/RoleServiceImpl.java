package com.ngcrm.service.impl;

import com.ngcrm.mapper.RoleMapper;
import com.ngcrm.model.Role;
import com.ngcrm.model.ZtreeVo;
import com.ngcrm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Boolean editRoleAuthority(Integer rid, Integer[] aids) {
        int a = roleMapper.deleteRoleAuthority(rid);
        int b = roleMapper.insertRoleAuthorityShip(rid,aids);
        return a+b>1;
    }


    @Override
    public List<ZtreeVo> queryRoleAuthority(Integer rid) {

        return roleMapper.queryRoleZtree(rid);
    }

    @Override
    public Boolean roleAdd(Role role) {
        role.setParentId(0);
        return roleMapper.addRole(role)>0;
    }

    @Override
    public Boolean deleleRole(Integer id) {
        return roleMapper.deleteRole(id)>0;
    }

    @Override
    public Boolean editRole(Role role) {
        return roleMapper.updateRole(role)>0;
    }

    @Override
    public Role queryRoleById(Integer id) {
        return  roleMapper.queryRoleById(id);
    }

    @Override
    public List<Role> queryRolesPage(Integer begin, Integer limit, String no) {
        return roleMapper.queryRolePage(begin,limit,no);
    }

    @Override
    public List<Role> queryAllRole() {
        return roleMapper.queryAllRole();
    }
}
