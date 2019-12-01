package com.ztkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring-boot处理异常方式1
 */
@Controller
public class DemoException1 {
    /**
     * 页面跳转
     ** @return
     */
    @RequestMapping("show1")
    public String show1(){
        try {
            String str= null;
            str.length();
            return "index";
        } catch (Exception e) {
            e.printStackTrace();
            return "index";
        }
    }

  @RequestMapping("show2")
    public String show2() {
        int a=10/0;
        return "index";
    }





}
