package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NsManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NsManageServiceApplication.class, args);
    }
}
