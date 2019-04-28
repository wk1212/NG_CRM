package com.ngcrm.service;


import com.ngcrm.model.TauthorityVO;
import com.ngcrm.model.User;
import com.ngcrm.vo.UserRoleVo;

import java.util.List;

public interface UserService {
    User login(String no,String pass);
    List<TauthorityVO> queryMenu(Integer id);

    int updateUser(User user);

    List<UserRoleVo> queryUserAll(Integer begin, Integer limit, String no, String flag);

    boolean activeUser(User user);

    User queryById(Integer id);

    boolean deleteUser(Integer id);

    boolean userRoleEdit(Integer id, Integer[] rids);

    boolean addUser(User user, Integer[] rids);
}
