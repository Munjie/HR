package com.mwj.dao;


import com.mwj.mapper.AdminMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class AdminDao {


    @Resource
    private AdminMapper adminMapper;


    public  boolean login(String adminname,  String adminpwd, Integer adminlevel){

        int login = adminMapper.login(adminname, adminpwd, adminlevel);

        return  login > 0;


    }



}
