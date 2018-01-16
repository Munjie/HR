package com.mwj.controller;


import com.mwj.bean.Departments;
import com.mwj.bean.Jobs;
import com.mwj.services.DepartmentsServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/")
@Controller
public class DepartmentsController {

    @Resource
    private DepartmentsServices departmentsServices;

      @RequestMapping("dept.do")
      public  String allDept(Model model){

          List<Departments> departments = departmentsServices.allDept();
          model.addAttribute("dept",departments);
          if (departments != null)

              return "departments";
          else
              return
              null;



      }



      @RequestMapping("admin/adddept.do")
      @ResponseBody
      public  String addDept(Departments departments){
        boolean b = departmentsServices.addDept(departments.getDepartmentId(), departments.getDepartmentName(), departments.getLocationName());

        if (b)

            return "{'msg':'ok'}";
        else

            return "adddept";

    }

    @RequestMapping("deletedept.do")
    @ResponseBody
    public  String deleteByPrimaryKey(int departmentId){
        boolean b = departmentsServices.deleteByPrimaryKey(departmentId);

        if (b)

            return "{'msg':'deleteok'}";
        else

            return "adddept";
    }

    @RequestMapping("showdeptbyid.do")
    public  String showDeptById(int departmentId,Model model){
        List<Departments> departments = departmentsServices.showDeptById(departmentId);

        model.addAttribute("deptinfo",departments);

        if (departments != null)

           return "updatedept";

        else
            return "updatedept";

    }


    @RequestMapping("updatedept.do")
    @ResponseBody
    public  String updateDeptById(Departments departments){
        boolean b = departmentsServices.updateDeptById(departments.getDepartmentId(), departments.getDepartmentName(), departments.getLocationName());

        if (b)
            return "{'msg':'ok'}";
        else

            return "adddept";

    }



}
