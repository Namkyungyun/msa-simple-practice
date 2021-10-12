package com.namkyung.zuul.server;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class RouteFilter extends ZuulFilter {

    private static final String Filter_Type = "route";
    private static final int Filter_Order = 1;
    private static final boolean Should_Filter = true;



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
        System.out.println("###ROUTE_filter 동작###");
        return null;
    }

}
