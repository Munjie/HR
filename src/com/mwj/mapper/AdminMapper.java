package com.mwj.mapper;

import com.mwj.bean.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int insert(Admin record);

    int insertSelective(Admin record);

    int login(@Param("adminname")String adminname, @Param("adminpwd") String adminpwd, @Param("adminlevel") Integer adminlevel);
}