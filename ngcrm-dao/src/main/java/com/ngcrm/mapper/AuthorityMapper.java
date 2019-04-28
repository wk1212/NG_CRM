package com.ngcrm.mapper;

import com.ngcrm.model.Authority;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorityMapper {
    List<Authority> queryAuthority(@Param("begin") Integer begin, @Param("limit") Integer limit, @Param("no") String no);

    int deleteAuthority(@Param("id") Integer id);

    List<Authority> queryAllAuthority();

    int addAuthority(Authority authority);


    int queryAuthority_count(@Param("no") String no);

    Authority queryAuthorityById(@Param("id") Integer id);

    int updateAuthority(Authority authority);
}
