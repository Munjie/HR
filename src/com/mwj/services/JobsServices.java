package com.mwj.services;

import com.mwj.bean.Jobs;
import com.mwj.dao.JobsDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobsServices {

    @Resource
    private JobsDao jobsDao;

    //显示所有职位
    public List<Jobs> showAllJobs(){

        return  jobsDao.showAllJobs();
    }
    //添加职位
    public boolean addJobs( String jobId, String jobTitle, int minSalary,  int maxSalary){

        return  jobsDao.addJobs(jobId, jobTitle, minSalary, maxSalary);

    }
    //删除职位
    public boolean deleteJobsById(String jobId){

        return  jobsDao.deleteJobsById(jobId);



    }
    //更新职位
    public boolean  updateJobsById(String jobId, String jobTitle, int minSalary,  int maxSalary){

        return jobsDao.updateJobsById(jobId, jobTitle, minSalary, maxSalary);


    }

    public Jobs showSalary(String jobId){

       return jobsDao.showSalary(jobId);
    }

    public  List<Jobs> showAllJobsById(String jobId){

        return  jobsDao.showAllJobsById(jobId);
    }

}
