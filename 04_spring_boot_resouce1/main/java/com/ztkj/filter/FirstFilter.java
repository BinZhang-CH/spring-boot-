package com.ztkj.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.xml.crypto.dsig.spec.XPathType;
import java.io.IOException;

@WebFilter(filterName = "FirstFilter",urlPatterns = {"*.do","/first"})
public class FirstFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("进入Filter......");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始Filter......");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("退出Filter......");

    }
}
