package com.mwj.dao;
import com.mwj.mapper.EmployeesMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeesDao {

    @Resource
    private EmployeesMapper employeesMapper;


     public List<Map> displayEmp(){

        return  employeesMapper.displayEmp();
    }

    public boolean addEmp(String empName, String email, String phoneNumber, Date hireDate,String jobId, Integer salary,Integer departmentId){

        int i = employeesMapper.addEmp(empName, email, phoneNumber, hireDate, jobId, salary, departmentId);
        return  i > 0;
    }

    public boolean updateEmp(Integer employeeId,String empName, String email,String phoneNumber,Date hireDate,String jobId,Integer salary, Integer departmentId){

        int i = employeesMapper.updateEmp(employeeId, empName, email, phoneNumber, hireDate, jobId, salary, departmentId);
        return  i > 0;
    }

    public boolean deleteEmp(Integer employeeId){

        int i = employeesMapper.deleteEmp(employeeId);
        return  i > 0;
    }

}
