package com.mwj.services;


import com.mwj.bean.Departments;
import com.mwj.dao.DepartmentsDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentsServices {

    @Resource
    private DepartmentsDao departmentsDao;


    public List<Departments> allDept(){

        return departmentsDao.allDept();
    }


    public boolean  addDept( int departmentId, String departmentName, String locationName){

        return departmentsDao.addDept(departmentId,departmentName,locationName);

    }

    public  boolean deleteByPrimaryKey(int departmentId){

        return departmentsDao.deleteByPrimaryKey(departmentId);

    }

    public List<Departments> showDeptById(int  departmentId){

       return departmentsDao.showDeptById(departmentId);
    }

    public boolean updateDeptById(int departmentId, String departmentName, String locationName){

        return  departmentsDao.updateDeptById(departmentId,departmentName,locationName);
    }
}
