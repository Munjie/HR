package com.mwj.services;

import com.mwj.dao.AdminDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServices {

    @Resource
    private AdminDao adminDao;


    public  boolean login(String adminname,  String adminpwd, Integer adminlevel){


        return  adminDao.login(adminname,adminpwd,adminlevel);

    }

}
