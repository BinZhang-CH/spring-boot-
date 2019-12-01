package com.ztkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * springboot启动类
 * @author ZhangXianSen
 * @data 2019-11-16
 *
 * 可以和controller位于同一个包下或者上级包
 * 但是不可以位于同级其他包下，加载不了其他组件
 */
@SpringBootApplication
public class Application {
    public static  void main(String[] args ){
        SpringApplication.run(Application.class,args);
    }
}
