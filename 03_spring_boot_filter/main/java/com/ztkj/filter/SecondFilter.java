package com.ztkj.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("SecondFilter开始......");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("SecondFilter退出......");
    }

    @Override
    public void destroy() {

    }
}
