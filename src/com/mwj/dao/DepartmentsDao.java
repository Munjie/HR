package com.mwj.dao;


import com.mwj.bean.Departments;
import com.mwj.mapper.DepartmentsMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class DepartmentsDao {

    @Resource
    private DepartmentsMapper departmentsMapper;
//显示所有部门
    public List<Departments> allDept(){

        return departmentsMapper.allDept();
    }
//添加部门
    public boolean  addDept(int departmentId, String departmentName, String locationName){

        int i = departmentsMapper.addDept(departmentId, departmentName, locationName);
        System.out.println(i);
        return  i > 0;
    }
//删除部门

    public  boolean deleteByPrimaryKey(int departmentId){

        int i = departmentsMapper.deleteByPrimaryKey(departmentId);
        return  i > 0;
    }
    //更具id显示部门
    public List<Departments> showDeptById(int  departmentId){

        return departmentsMapper.showDeptById(departmentId);
    }
    //更具id修改部门
    public boolean updateDeptById(int departmentId, String departmentName, String locationName){

        int i = departmentsMapper.updateDeptById(departmentId, departmentName, locationName);
        return  i> 0;
    }
}
