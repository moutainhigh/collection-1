package com.atguigu.controller;


import com.atguigu.feignservice.OrganizationFeign;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class OrganizationFeignController {
    @Autowired
    OrganizationFeign organizationFeign;
    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }
    @RequestMapping("/OrganizationManagePage")
    public String getOrganizationManagePage(){
        String organizationList = organizationFeign.getOrganizationList();
        System.out.println(organizationList);
        return "OrganizationManagePage";
    }
}
