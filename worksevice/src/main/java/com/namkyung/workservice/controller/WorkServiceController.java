package com.namkyung.workservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@RefreshScope
public class WorkServiceController {

    @Value("${work.value}")
    private String configStr;

    @GetMapping("/work")
    public String getWork(){
        return configStr;
    }

}
