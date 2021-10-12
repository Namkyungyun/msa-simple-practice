package com.namkyung.zuul.server;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class PostFilter extends ZuulFilter {
    private static final String Filter_Type = "post";
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
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println("###POST_filter 동작###");
        return null;
    }

}
