package com.mwj.services;


import com.mwj.bean.Employees;
import com.mwj.dao.EmployeesDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class EmployeesServices {

    @Resource
    private EmployeesDao employeesDao;


   public  List<Map> displayEmp(){

        return employeesDao.displayEmp();
    }


    public boolean addEmp(String empName, String email, String phoneNumber, Date hireDate, String jobId, Integer salary, Integer departmentId){

     return   employeesDao.addEmp(empName, email, phoneNumber, hireDate, jobId, salary, departmentId);


    }


    public boolean updateEmp(Integer employeeId,String empName, String email,String phoneNumber,Date hireDate,String jobId,Integer salary, Integer departmentId){

       return  employeesDao.updateEmp(employeeId, empName, email, phoneNumber, hireDate, jobId, salary, departmentId);

    }

    public boolean deleteEmp(Integer employeeId){
      return  employeesDao.deleteEmp(employeeId);

    }
}
