package com.mwj.mapper;


import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EmployeesMapper {


    List<Map> displayEmp();

    int addEmp(@Param("empName")String empName,@Param("email") String email,@Param("phoneNumber")String phoneNumber,@Param("hireDate") Date hireDate, @Param("jobId")  String jobId, @Param("salary") Integer salary, @Param("departmentId")Integer departmentId);

    int updateEmp(@Param("employeeId")Integer employeeId,@Param("empName")String empName,@Param("email") String email,@Param("phoneNumber")String phoneNumber,@Param("hireDate") Date hireDate, @Param("jobId")  String jobId, @Param("salary") Integer salary, @Param("departmentId")Integer departmentId);

    int deleteEmp(@Param("employeeId")Integer employeeId);
}