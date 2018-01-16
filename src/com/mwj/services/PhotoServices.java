package com.mwj.services;

import com.mwj.bean.Photo;
import com.mwj.dao.PhotoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PhotoServices {

    @Resource
    private PhotoDao photoDao;


    public Photo shwoPhoto(Integer employeeId){

        return photoDao.shwoPhoto(employeeId);


    }
    public  boolean insertPhoto(String photoPath,Integer employeeId){
        return  photoDao.insertPhoto( photoPath,employeeId);

    }

}
