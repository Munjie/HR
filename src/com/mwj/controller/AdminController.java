package com.mwj.controller;


import com.mwj.bean.Admin;
import com.mwj.bean.Departments;
import com.mwj.services.AdminServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class AdminController {

    @Resource
    private AdminServices adminServices;

     @RequestMapping("login.do")
    public  String login(Admin admin){

        boolean login = adminServices.login(admin.getAdminname(), admin.getAdminpwd(), admin.getAdminlevel());
         System.out.println(login);
        if (login)
            return "main";
        else
            return  null;


    }


}
