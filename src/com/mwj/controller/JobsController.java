package com.mwj.controller;
import com.google.gson.Gson;
import com.mwj.bean.Departments;
import com.mwj.bean.Jobs;
import com.mwj.services.DepartmentsServices;
import com.mwj.services.JobsServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/")
@Controller
public class JobsController {

    @Resource
    private  JobsServices jobsServices;
    @Resource
    private DepartmentsServices departmentsServices;


    @RequestMapping("addemp.do")
    public String addemp(Model model){
        List<Departments> departmentsList = departmentsServices.allDept();
        List<Jobs> jobsList = jobsServices.showAllJobs();
        model.addAttribute("job",jobsList);
        model.addAttribute("dept",departmentsList);
        if (jobsList != null && departmentsList != null)
             return  "addemp";
          else
            return  "addemp";

    }


    @RequestMapping("salarybyid.do")
    @ResponseBody
    public String salary(String jobId){
        Jobs jobs = jobsServices.showSalary(jobId);
        Gson gson = new Gson();
        String json = gson.toJson(jobs);
        System.out.println(json);
        return json;

    }

    @RequestMapping("viewjob.do")
    public  String showAllJobs(Model model){

        List<Jobs> jobsList = jobsServices.showAllJobs();
        model.addAttribute("job",jobsList);
        if (jobsList != null)
            return  "jobview";
        else
            return  null;
    }

    @RequestMapping("addjob.do")
    public  String addJob(Jobs jobs){

        boolean b  =  jobsServices.addJobs(jobs.getJobId(), jobs.getJobTitle(),jobs.getMinSalary(),jobs.getMaxSalary());
        if (b)
            return
                    "{'msg':'ok'}";
        else
            return
                    "{'msg':'error'}";

    }

    @RequestMapping("updatejob.do")
    @ResponseBody
    public  String updateJob(Jobs jobs){

        boolean b  =  jobsServices.updateJobsById(jobs.getJobId(), jobs.getJobTitle(),jobs.getMinSalary(),jobs.getMaxSalary());
        if (b)
            return
                    "{'msg':'ok'}";
        else
            return
                    "{'msg':'error'}";

    }

    @RequestMapping("deletejob.do")
    public  String deleteJob(String jobId){

        boolean b  =  jobsServices.deleteJobsById(jobId);
        if (b)
            return
                    "{'msg':'ok'}";
        else
            return
                    "{'msg':'error'}";

    }
    @RequestMapping("showjobbyid.do")
    public  String showAllJobsByiD(String jobId,Model model){

        List<Jobs> jobsList = jobsServices.showAllJobsById(jobId);
        model.addAttribute("job",jobsList);
        if (jobsList != null)
            return  "updatejob";
        else
            return null;

    }

}
