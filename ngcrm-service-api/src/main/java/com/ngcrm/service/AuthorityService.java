package com.ngcrm.service;

import com.ngcrm.model.Authority;

import java.util.List;

public interface AuthorityService {
    List<Authority> queryAuthority(Integer begin, Integer limit, String no);

    Boolean deleteAuthority(Integer id);

    List<Authority> queryAllAuthority();

    Boolean addAuthority(Authority authority);

    int queryAllAuthority(String no);

    Authority queryAuthorityById(Integer id);

    Boolean updateAuthority(Authority authority);
}
