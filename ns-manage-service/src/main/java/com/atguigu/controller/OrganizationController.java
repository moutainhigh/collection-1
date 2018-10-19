package com.atguigu.controller;


import com.atguigu.provide.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {
    @Autowired
    OrganizationService organizationService;
    @RequestMapping("/OrganizationManagePage")
    public String getOrganizationManagePage(){

        return organizationService.getOrganizationList();
    }
}
