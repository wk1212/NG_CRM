package com.ngcrm.controller;

import com.ngcrm.model.TCustomer;
import com.ngcrm.service.CustomerService;
import com.ngcrm.vo.ResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

    CustomerService customerService;

    @RequestMapping("addCustomer.do")
    @ResponseBody
    public  Object addCustomer(TCustomer customer){
        ResultVo vo=new ResultVo();
        boolean f = customerService.addCustomer(customer);
        if(!f){
            vo.setCode(-1);
        }
        return vo;
    }
}
