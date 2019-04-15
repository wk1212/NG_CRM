package com.ngcrm.service.impl;

import com.ngcrm.mapper.UserMapper;
import com.ngcrm.model.User;
import com.ngcrm.service.UserService;
import com.ngcrm.utils.EncrypUtil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String no, String pass) {
        System.out.println(no+"===="+pass);
        return userMapper.queryUserByNameAndPwd(no,EncrypUtil2.md5Pass(pass));
    }
}
