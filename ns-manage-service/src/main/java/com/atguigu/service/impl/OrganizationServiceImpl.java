package com.atguigu.service.impl;

import com.atguigu.provide.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Override
    public String getOrganizationList() {
        return "这是一个测试";
    }
}
