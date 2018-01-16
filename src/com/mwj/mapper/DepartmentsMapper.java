package com.mwj.mapper;

import com.mwj.bean.Departments;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentsMapper {

      List<Departments> allDept();

      int addDept(@Param("departmentId") int departmentId, @Param("departmentName") String departmentName, @Param("locationName") String locationName);

      int deleteByPrimaryKey(@Param("departmentId")int departmentId);

        List<Departments>  showDeptById(@Param("departmentId")int departmentId);

      int updateDeptById(@Param("departmentId") int departmentId, @Param("departmentName") String departmentName, @Param("locationName") String locationName);
}