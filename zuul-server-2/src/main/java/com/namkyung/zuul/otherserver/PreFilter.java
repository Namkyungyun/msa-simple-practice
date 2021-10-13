package com.namkyung.zuul.otherserver;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class PreFilter extends ZuulFilter {

    private String Filter_Type = "pre";
    private int Filter_Order = 1;

//    Environment environment;
    @Value("${should.value}")
    boolean Should_Filter;

    @Override
    public String filterType() {
        return Filter_Type;
    }

    @Override
    public int filterOrder() {
        return Filter_Order;
    }

    @Override
    public boolean shouldFilter() {
        return Should_Filter;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println("###other_PRE_filter 동작###");
//        System.out.println("yml = "+environment.getProperty("should.value"));
        System.out.println("###요청한 url : " + ctx.getRequest().getRequestURI());

        return null;
    }
}
