package com.mwj.dao;


import com.mwj.bean.Photo;
import com.mwj.mapper.PhotoMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class PhotoDao {

    @Resource
     private  PhotoMapper photoMapper;

   public  Photo shwoPhoto(Integer employeeId){

       return photoMapper.shwoPhoto(employeeId);


    }

    public  boolean insertPhoto(String photoPath,Integer employeeId){
        int i = photoMapper.insertPhoto( photoPath,employeeId);
        return  i > 0;
    }
}
