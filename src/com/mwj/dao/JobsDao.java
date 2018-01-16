package com.mwj.dao;


import com.mwj.bean.Jobs;
import com.mwj.mapper.JobsMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class JobsDao {

    @Resource
    private JobsMapper jobsMapper;

//显示所有职位
    public List<Jobs> showAllJobs(){

        return  jobsMapper.showAllJobs();
    }
//添加职位
    public boolean addJobs( String jobId, String jobTitle, int minSalary,  int maxSalary){

        int i = jobsMapper.addJobs(jobId, jobTitle, minSalary, maxSalary);
        return  i > 0;
    }
    //删除职位
    public boolean deleteJobsById(String jobId){

        int i = jobsMapper.deleteJobsById(jobId);
        return  i >0;


    }
    //更新职位
     public boolean  updateJobsById(String jobId, String jobTitle, int minSalary,  int maxSalary){

         int i = jobsMapper.updateJobsById(jobId, jobTitle, minSalary, maxSalary);

         return  i >0;
     }
    //查询工资
       public Jobs showSalary(String jobId){
         return  jobsMapper.showSalary(jobId);
       }

    public  List<Jobs> showAllJobsById(String jobId){

        return  jobsMapper.showAllJobsById(jobId);
    }
}
