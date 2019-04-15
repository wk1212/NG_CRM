package com.ngcrm.controller;


import com.ngcrm.model.User;
import com.ngcrm.service.UserService;
import com.ngcrm.utils.EncrypUtil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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
}
