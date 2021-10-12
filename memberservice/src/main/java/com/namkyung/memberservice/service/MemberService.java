package com.namkyung.memberservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class MemberService {

    @Value("${name.value}")
    private String name;

    @Value("${thing.value}")
    private String what;

    @Value("${workspace.value}")
    private String where;

    public Map<String,String> getName(){
        Map<String,String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    public Map<String,String> getWhere(){
        Map<String,String> map = new HashMap<>();
        map.put("where", where);
        return map;
    }

    public Map<String,String> getWork(){
        Map<String,String> map = new HashMap<>();
        map.put("what", what);
        return map;
    }

}
