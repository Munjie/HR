package com.mwj.controller;


import com.mwj.bean.Photo;
import com.mwj.services.PhotoServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;

@RequestMapping("/")
@Controller
public class PhotoController {


    @Resource
    private PhotoServices photoServices;



    @RequestMapping("emphoto.do")
    public  String showEmpPhoto(int employeeId,Model model){

        Photo photo = photoServices.shwoPhoto(employeeId);
        String fileName= photo.getPhotoId() + photo.getPhotoPath();
        model.addAttribute("img",fileName);
        return "photoview";


    }

    @RequestMapping("addphobyid.do")
    public  String showAddPhoto(int employeeId,Model model){
        Photo photo = photoServices.shwoPhoto(employeeId);
        Integer employeeId1 = photo.getEmployeeId();
        model.addAttribute("adempid",employeeId);
        return "addphoto";

    }

    @RequestMapping("up.do")
    public  String fielset(@RequestParam("myfile") CommonsMultipartFile upfile, HttpServletRequest httpServletRequest, Model model, int employeeId){
        //存放的位置
        String fileDir = httpServletRequest.getServletContext().getRealPath("/img/");
        //存放的名字
        String fileName= UUID.randomUUID().toString().replace("-","")+".jpg";
        boolean i =  photoServices.insertPhoto(fileName,employeeId);
        String filePath = fileDir + fileName;
        coppyFile(upfile,filePath);
        model.addAttribute("img",fileName);
        if (i)
            return "photoview";
        else
            return  null;

    }


    private  void coppyFile(CommonsMultipartFile commonsMultipartFile, String filePath){

        try{


            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            InputStream inputStream = commonsMultipartFile.getInputStream();
            int length = -1;
            byte[] bytes = new byte[10];
            while ((length = inputStream.read(bytes) ) != -1){

                fileOutputStream.write(bytes,0,length);
            }
            fileOutputStream.close();
            inputStream.close();

        }
        catch (Exception e){

            e.printStackTrace();
        }



    }



}
