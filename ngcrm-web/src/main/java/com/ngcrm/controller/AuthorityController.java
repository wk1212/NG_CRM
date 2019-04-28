package com.ngcrm.controller;

import com.ngcrm.model.Authority;
import com.ngcrm.service.AuthorityService;
import com.ngcrm.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @RequestMapping("authority.do")
    @ResponseBody
    public Object queryAuthority(@RequestParam(defaultValue ="1") Integer page ,
                                 @RequestParam(defaultValue ="10") Integer limit,
                                 @RequestParam(defaultValue ="") String no){

        Integer begin=(page-1)*limit;
        List<Authority> list=authorityService.queryAuthority(begin,limit,no);
        ResultVo vo=new ResultVo();
        int count=authorityService.queryAllAuthority(no);
        vo.setCount(count);
        vo.setData(list);
        return vo;
    }
    @RequestMapping("authoritydel.do")
    @ResponseBody
    public Object authorityDelete(Integer id){
        ResultVo vo=new ResultVo();
        vo.setCode(1000);
        Boolean f=authorityService.deleteAuthority(id);

        if(!f){
            vo.setCode(-1);
        }
        return vo;
    }

    @RequestMapping("queryallauthority.do")
    @ResponseBody
    public Object queryAllAuthority(){
        ResultVo vo=new ResultVo();
        List<Authority> list=authorityService.queryAllAuthority();
        vo.setData(list);

        return vo;
    }
    @RequestMapping("addauthority.do")
    @ResponseBody
    public Object addAuthority(@RequestParam(defaultValue = "") String aicon ,
                               @RequestParam(defaultValue = "")String aurl,
                               Integer parentId,
                               Integer pid,
                               String title){
        ResultVo vo =new ResultVo();
        Authority authority=new Authority();
        authority.setAicon(aicon);
        authority.setTitle(title);
        authority.setAurl(aurl);
        if (pid==0){
            authority.setType(1);
            authority.setParentId(0);
        }else if (pid==-1){
            authority.setType(1);
            authority.setParentId(parentId);
        }else {
            authority.setType(2);
            authority.setParentId(parentId);
        }
        Boolean f=authorityService.addAuthority(authority);
        if (!f){
            vo.setCode(-1);
        }

        return vo;
    }

    @RequestMapping("queryAuthorityById.do")
    @ResponseBody
    public Object queryAuthorityById(Integer id){
       Authority authority =authorityService.queryAuthorityById(id);
       return authority;
    }

    @RequestMapping("updateAuthority.do")
    @ResponseBody
    public Object insertAuthority(Integer id,
                                  @RequestParam(defaultValue = "") String aicon ,
                                  @RequestParam(defaultValue = "")String aurl,
                                  Integer parentId,
                                  Integer pid,
                                  String title){
        ResultVo vo =new ResultVo();
        Authority authority=new Authority();
        authority.setId(id);
        authority.setAicon(aicon);
        authority.setTitle(title);
        authority.setAurl(aurl);
        if ( pid==0){
            authority.setType(1);
            authority.setParentId(0);
        }else if (pid==-1){
            authority.setType(1);
            authority.setParentId(parentId);
        }else if (pid==2){
            authority.setType(2);
            authority.setParentId(parentId);
        }
        Boolean f=authorityService.updateAuthority(authority);
        if (!f){
            vo.setCode(-1);
        }

        return vo;

    }


    public void test(){
        String A="aaabbb-bbb***";
       String B=A.replace('a','b');
        System.out.println(B);
    }

}
