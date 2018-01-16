package com.mwj.mapper;

import com.mwj.bean.Jobs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobsMapper {
    List<Jobs> showAllJobs();
    Jobs  showSalary(@Param("jobId") String jobId);
    List<Jobs> showAllJobsById(@Param("jobId") String jobId);
    int addJobs(@Param("jobId") String jobId,@Param("jobTitle")String jobTitle, @Param("minSalary")  int minSalary,@Param("maxSalary") int maxSalary);
    int deleteJobsById(@Param("jobId") String jobId);
    int updateJobsById(@Param("jobId") String jobId,@Param("jobTitle")String jobTitle, @Param("minSalary")  int minSalary,@Param("maxSalary") int maxSalary);
}