package com.ngcrm.service.impl;

import com.ngcrm.mapper.UserMapper;
import com.ngcrm.model.Role;
import com.ngcrm.model.TauthorityVO;
import com.ngcrm.model.User;
import com.ngcrm.service.UserService;
import com.ngcrm.utils.EncrypUtil2;
import com.ngcrm.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String no, String pass) {
        System.out.println(no+"===="+pass);
        return userMapper.queryUserByNameAndPwd(no,EncrypUtil2.md5Pass(pass));
    }

    @Override
    public boolean addUser(User user, Integer[] rids) {
        user.setHeadphoto("media/images/qf_logo.png");
        user.setFlag(1);
        user.setPassword(EncrypUtil2.md5Pass(user.getPassword()));
        userMapper.addUser(user);
        User user1 = userMapper.queryUserByNameAndPwd(user.getNo(), user.getPassword());
        userMapper.insertBatchByAndUidRids(user1.getId(),rids);
        return true;
    }
    @Override
    public boolean userRoleEdit(Integer id, Integer[] rids) {
        userMapper.deleteUserMerberShip(id);
        userMapper.insertBatchByAndUidRids(id,rids);
        return true;
    }

    @Override
    public boolean deleteUser(Integer id) {
        userMapper.deleteUser(id);
        userMapper.deleteUserMerberShip(id);
        return true;
    }

    @Override
    public User queryById(Integer id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public boolean activeUser(User user) {
        userMapper.updateUser(user);
        return true;
    }

    @Override
    public List<UserRoleVo> queryUserAll(Integer begin, Integer limit, String no, String flag) {
        List<UserRoleVo> list=userMapper.queryUserWithRoleMsg(begin,limit,no,flag);
        for (UserRoleVo r : list) {
            List<Role> roleList = r.getRoleList();
            for (Role t : roleList) {
                r.getRids().add(t.getId());
                r.getRole().add(t.getInfo());
                r.getRnames().add(t.getName());
            }

        }
        return list;
    }

    @Override
    public int updateUser(User user) {
        userMapper.updateUser(user);
        return 1;
    }



    @Override
    public List<TauthorityVO> queryMenu(Integer id) {

        List<TauthorityVO> list =userMapper.queryMenu(id);

        for (TauthorityVO t:list){
            t.setChilds(userMapper.queryChildMenu(t.getId()));
        }
        return list;
    }


}
