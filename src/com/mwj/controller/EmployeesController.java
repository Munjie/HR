package com.mwj.controller;


import com.mwj.bean.Departments;
import com.mwj.bean.Employees;
import com.mwj.bean.Jobs;
import com.mwj.services.EmployeesServices;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RequestMapping("/")
@Controller
public class EmployeesController {

    @Resource
    private EmployeesServices employeesServices;


    @InitBinder
    public  void  bindDate(ServletRequestDataBinder requestDataBinder){
        requestDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),false));
    }

    @RequestMapping("emp.do")
    public  String display(Model model){
        List<Map> employeesList = employeesServices.displayEmp();
        model.addAttribute("emp",employeesList);

        if (employeesList != null)
        return   "viewemp";
        else
            return "{'msg':'ERROR}";

    }

    @RequestMapping("empadd.do")
    public  String addEmp(Employees employees){

        System.out.println(employees.getDepartmentId());
        System.out.println(employees.getEmpName());
        boolean b = employeesServices.addEmp(employees.getEmpName(), employees.getEmail(), employees.getPhoneNumber(), employees.getHireDate(), employees.getJobId(), employees.getSalary(), employees.getDepartmentId());

        if (b)

        return "{'msg':'ok'}";

        else

        return "{'msg':'ERROR}";

    }


    @RequestMapping("deleteemp.do")
    public  String deleteEmp(int employeeId){

        boolean b = employeesServices.deleteEmp(employeeId);
        if (b)

        return "{'msg':'ok'}";
            else
            return "{'msg':'ERROR}";


    }

    @RequestMapping("updateEmp.do")
    public  String updateEmp(Employees employees){
        boolean b = employeesServices.updateEmp(employees.getEmployeeId(),employees.getEmpName(), employees.getEmail(), employees.getPhoneNumber(), employees.getHireDate(), employees.getJobId(), employees.getSalary(), employees.getDepartmentId());

        if (b)

            return "{'msg':'OK'}";
        else
            return "{'msg':'ERROR}";

    }




}
