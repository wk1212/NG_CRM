package com.ngcrm.service.impl;

import com.ngcrm.mapper.AuthorityMapper;
import com.ngcrm.model.Authority;
import com.ngcrm.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {


    @Autowired
    private AuthorityMapper authorityMapper;


    @Override
    public Boolean updateAuthority(Authority authority) {
        return authorityMapper.updateAuthority(authority)>0;
    }

    @Override
    public Authority queryAuthorityById(Integer id) {
        return authorityMapper.queryAuthorityById(id);
    }

    @Override
    public int queryAllAuthority(String no) {
        return authorityMapper.queryAuthority_count(no);
    }

    @Override
    public Boolean addAuthority(Authority authority) {

        return authorityMapper.addAuthority(authority)>0;
    }

    @Override
    public List<Authority> queryAllAuthority() {
        return authorityMapper.queryAllAuthority();
    }

    @Override
    public Boolean deleteAuthority(Integer id) {

        return authorityMapper.deleteAuthority(id)>0;
    }

    @Override
    public List<Authority> queryAuthority(Integer begin, Integer limit, String no) {
        return authorityMapper.queryAuthority(begin,limit,no);
    }
}
