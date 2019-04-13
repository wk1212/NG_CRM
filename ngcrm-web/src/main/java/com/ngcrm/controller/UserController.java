package com.ngcrm.controller;


import com.ngcrm.model.User;
import com.ngcrm.service.UserService;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("login.do")
    public  String login(String no, String Pass, HttpServletResponse response, HttpSession session){
        User user=userService.login(no,Pass);
        if (user!=null&&user.getFlag()==1){
            return "index";
        }else {
            return "login";
        }

    }
}
