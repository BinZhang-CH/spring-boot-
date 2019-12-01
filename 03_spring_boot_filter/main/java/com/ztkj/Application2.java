package com.ztkj;

import com.ztkj.filter.FirstFilter;
import com.ztkj.filter.SecondFilter;
import com.ztkj.servlet.FirstServlet;
import com.ztkj.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * springboot实现Filter 二
 */
@SpringBootApplication
public class Application2 {
    public static void main(String [] args){
        SpringApplication.run(Application2.class,args);
    }


    /**
     * 注册Servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    /**
     * 注册Filter
     * @return
     */
    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        bean.addUrlPatterns(new String[]{"/second"});
        return  bean;
    }
}
