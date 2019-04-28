package com.ngcrm.mapper;


import com.ngcrm.model.TauthorityVO;
import com.ngcrm.model.User;
import com.ngcrm.vo.UserRoleVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User queryUserByNameAndPwd(@Param("no") String no,@Param("pass") String pass);
    List<TauthorityVO> queryMenu(@Param("uid") Integer id);

    List<TauthorityVO> queryChildMenu(@Param("pid") Integer id);

    void updateUser(User user);

    List<UserRoleVo> queryUserWithRoleMsg(@Param("begin") Integer begin, @Param("limit") Integer limit,
                                          @Param("no") String no,
                                          @Param("flag") String flag);

    void updateUser(Integer id, Integer flag);

    User queryUserById(@Param("id") Integer id);

    void deleteUser(@Param("id") Integer id);

    void deleteUserMerberShip(@Param("id") Integer id);

    void insertBatchByAndUidRids(@Param("id") Integer id,@Param("list") Integer[] rids);

    int addUser(User user);
}
