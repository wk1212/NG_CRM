package com.ngcrm.controller;


import com.ngcrm.model.TauthorityVO;
import com.ngcrm.model.User;
import com.ngcrm.service.UserService;
import com.ngcrm.utils.EncrypUtil2;
import com.ngcrm.vo.ResultVo;
import com.ngcrm.vo.UserRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("login.do")
    public  String login(String no, String pass, HttpSession session)throws IOException {

        User user=userService.login(no,pass);
        if (user!=null&&user.getFlag()==1){
            session.setAttribute("user",user);
            return "index";
        }else {
            return "login";
    }
    }
    @RequestMapping("userloginout.do")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "login";
    }
    @RequestMapping("querySessionUser.do")
    @ResponseBody
    public Object querySessionUser(HttpSession session) {
        User user = (User) session.getAttribute("user");
        return user;
    }
    @RequestMapping("usermenu.do")
    @ResponseBody
    public Object userMenu(HttpSession session){
        User user = (User) session.getAttribute("user");
        List<TauthorityVO> list =userService.queryMenu(user.getId());
        return list;
    }

    @RequestMapping("uploadphoto.do")
    @ResponseBody
    public Object uploadPhoto(MultipartFile file, HttpSession session, HttpServletRequest request) throws IOException {
        //上传图片到项目
        String contextPath = request.getServletContext().getRealPath("/media/headphoto");
        File file1 =new File(contextPath);

        if (file.isEmpty()){
            return null;
        }
        if (!file1.isDirectory()){
            file1.delete();
            file1.mkdirs();
        }
        String name=UUID.randomUUID().toString()
                .replaceAll("-","")
                +"_"+file.getOriginalFilename();

        file.transferTo(new File(contextPath+"/"+name));
        //上传成功后将user表中的headphoto 更改图片地址  同时更改session中的user
        User user = (User) session.getAttribute("user");

        user.setHeadphoto("media/headphoto/"+name);
        int flag= userService.updateUser(user);
        Map<String,Object> map =new HashMap<>();
        if (flag>0){
            map.put("code",0);

        }else {
            map.put("code",1);
        }

        return map;
    }

    @RequestMapping("updatepassword.do")
    @ResponseBody
    public Object updatePassword(String oldpassword,String password,HttpSession session){
        String s = EncrypUtil2.md5Pass(oldpassword);
        User user = (User) session.getAttribute("user");
        Map<String,Object> map =new HashMap<>();
        if (!user.getPassword().equals(s)){
            return null;
        }else {
            user.setPassword(EncrypUtil2.md5Pass(password));
            userService.updateUser(user);
            map.put("code",0);
            return map;
        }

    }

    @RequestMapping("userall.do")
    @ResponseBody
    public Object queryUserAll(@RequestParam(defaultValue = "0") Integer begin,
                               @RequestParam(defaultValue = "10")Integer limit,
                               String no,
                               String flag){
        ResultVo vo=new ResultVo();
        vo.setMsg("");
        List<UserRoleVo> list=userService.queryUserAll(begin,limit,no,flag);
        vo.setCount(list.size());
        vo.setData(list);
        return vo;
    }

    @RequestMapping("activeuser.do")
    @ResponseBody
    public Object activeUser(Integer id, Integer flag){

        ResultVo vo=new ResultVo();
        User user=userService.queryById(id);
        user.setFlag(flag);
        boolean f= userService.activeUser(user);

        if(!f){
            vo.setCode(-1);
        }

        return  vo;
    }
    @RequestMapping("userdel.do")
    @ResponseBody
    public Object userDelete(Integer id){
        ResultVo vo=new ResultVo();

        boolean f= userService.deleteUser(id);

        if(!f){
            vo.setCode(-1);
        }

        return  vo;

    }

    @RequestMapping("userroleedit.do")
    @ResponseBody
    public Object userRoleEdit(Integer id,Integer[] rids){
        ResultVo vo=new ResultVo();
        boolean f= userService.userRoleEdit(id,rids);

        if(!f){
            vo.setCode(-1);
        }
        return  vo;

    }
    @RequestMapping("adduser")
    @ResponseBody
    public Object addUser(User user,Integer[] rids){

        ResultVo vo=new ResultVo();
        boolean f= userService.addUser(user,rids);
        if(!f){
            vo.setCode(-1);
        }
        return  vo;

    }
}
