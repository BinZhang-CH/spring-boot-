package com.ztkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * springboot启动类
 * 静态资源在springboot中的位置
 *
 */
@SpringBootApplication
@ServletComponentScan
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class,args);
    }
}
