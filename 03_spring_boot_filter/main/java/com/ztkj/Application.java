package com.ztkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan  //SpringBoot在启动的时候回扫描@WebServlet（）这个注解 并实例化这个类
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class,args);
    }
}
