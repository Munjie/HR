package com.mwj.mapper;

import com.mwj.bean.Photo;
import org.apache.ibatis.annotations.Param;

public interface PhotoMapper {


    Photo shwoPhoto(Integer employeeId);





    int insertPhoto(@Param("photoPath") String photoPath, @Param("employeeId") Integer employeeId);


}