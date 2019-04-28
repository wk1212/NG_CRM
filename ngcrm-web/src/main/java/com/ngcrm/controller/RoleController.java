package com.ngcrm.controller;

import com.ngcrm.model.Role;
import com.ngcrm.model.ZtreeVo;
import com.ngcrm.service.RoleService;
import com.ngcrm.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {


    @Autowired
    private RoleService roleService;

    @RequestMapping("allroles.do")
    @ResponseBody
    public Object queryAllRoles(){
        List<Role> list =roleService.queryAllRole();
        return list;
    }


    @RequestMapping("rolepage.do")
    @ResponseBody
    public Object rolePage(@RequestParam(defaultValue = "0")Integer begin,
                           @RequestParam(defaultValue = "10") Integer limit,
                           @RequestParam(defaultValue = "") String no){

        List<Role> list=roleService.queryRolesPage(begin,limit,no);
        ResultVo vo =new ResultVo();
        vo.setData(list);
        return vo;
    }

    @RequestMapping("queryroleByid")
    @ResponseBody
    public Object queryRoleById(Integer rid){

        Role role=roleService.queryRoleById(rid);

        return role;
    }

    @RequestMapping("editrole.do")
    @ResponseBody
    public Object editRole(Role role){

        ResultVo vo=new ResultVo();
        boolean f= roleService.editRole(role);

        if(!f){
            vo.setCode(-1);
        }

        return  vo;
    }
    @RequestMapping("roledel.do")
    @ResponseBody
    public Object deleleRole(Integer id){

        ResultVo vo=new ResultVo();
        vo.setCode(1000);
        boolean f= roleService.deleleRole(id);

        if(!f){
            vo.setCode(-1);
        }

        return  vo;
    }
    @RequestMapping("roleadd.do")
    @ResponseBody
    public Object roleAdd(Role role){

        ResultVo vo=new ResultVo();
        boolean f= roleService.roleAdd(role);

        if(!f){
            vo.setCode(-1);
        }

        return  vo;
    }
    @RequestMapping("queryroleauthority.do")
    @ResponseBody
    public Object queryRoleAuthority(Integer rid){

        ResultVo vo=new ResultVo();
        List<ZtreeVo> list =roleService.queryRoleAuthority(rid);
        vo.setData(list);

        return  vo;
    }
    @RequestMapping("editroleauthority.do")
    @ResponseBody
    public  Object editRoleAuthority(Integer rid,Integer[] aids){
        ResultVo vo=new ResultVo();
        Boolean f= roleService.editRoleAuthority(rid,aids);

        if(!f){
            vo.setCode(-1);
        }
        return  vo;
    }
}
