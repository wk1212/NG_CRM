package com.ngcrm.mapper;

import com.ngcrm.model.Role;
import com.ngcrm.model.ZtreeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {

    List<Role> queryAllRole();

    List<Role> queryRolePage(@Param("begin") Integer begin, @Param("limit") Integer limit, @Param("no") String no);

    Role queryRoleById(@Param("id") Integer id);

    int updateRole(Role role);

    int deleteRole(@Param("id") Integer id);

    int addRole(Role role);

    List<ZtreeVo> queryRoleZtree(@Param("rid") Integer rid);

    int deleteRoleAuthority(@Param("rid") Integer rid);

    int insertRoleAuthorityShip(@Param("rid") Integer rid, @Param("aids") Integer[] aids);
}
