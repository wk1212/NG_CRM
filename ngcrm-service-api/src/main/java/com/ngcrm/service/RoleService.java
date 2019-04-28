package com.ngcrm.service;

import com.ngcrm.model.Role;
import com.ngcrm.model.ZtreeVo;

import java.util.List;

public interface RoleService {
    List<Role> queryAllRole();

    List<Role> queryRolesPage(Integer begin, Integer limit, String no);

    Role queryRoleById(Integer id);

    Boolean editRole(Role role);

    Boolean deleleRole(Integer id);

    Boolean roleAdd(Role role);

    List<ZtreeVo> queryRoleAuthority(Integer rid);

    Boolean editRoleAuthority(Integer rid, Integer[] aids);
}
