package com.ztkj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
            return "error";
        }
    }

  @RequestMapping("show2")
    public String show2() {
        int a=10/0;
        return "index";
    }

    /**
     * ModelAndView：这里返返回ModelAndView的目的是我们捕获到了异常之后，除了需要跳转异常页面之外，
     * 我们还需要一些异常的参数，异常的相关信息
     * @param e
     * @return
     * ExceptionHandler(value),这里的value是一个数组，我们把需要的异常自定义处理
     */
    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception e){
        ModelAndView view = new ModelAndView();
        view.addObject("error",e.toString());
        view.setViewName("error1");
        return view;
    }

}
