package com.namkyung.memberservice.controller;

import com.namkyung.memberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class MemberServiceController {

  @Autowired
  private MemberService memberService;

    @GetMapping("/member")
    public Object getInfo() {
      String configName = "Member의 이름\t"+memberService.getName();
      String configWhere= "\nMember가 있는 장소\t"+memberService.getWhere();
      String configWhat = "\nMember가 하는 작업은\t"+memberService.getWork();
      return configName + configWhere + configWhat;
    }
}
