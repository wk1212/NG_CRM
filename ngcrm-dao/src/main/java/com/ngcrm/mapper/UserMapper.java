package com.ngcrm.mapper;


import com.ngcrm.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserByNameAndPwd(@Param("no") String no,@Param("pass") String pass);
}
