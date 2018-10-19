package com.atguigu.feignservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("MANAGE-SERVICE")
public interface OrganizationFeign {
    @RequestMapping("OrganizationManagePage")
    String getOrganizationList();
}
