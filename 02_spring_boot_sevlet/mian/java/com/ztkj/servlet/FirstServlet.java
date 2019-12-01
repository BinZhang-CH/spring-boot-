package com.ztkj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * springboot 整合servlet的方式1
 *
 * --web.XML的配置
 * <servlet>
 *     <servlet-name>FirstServlet</sevlet-name>
 *     <servlet-class>com.ztkj.servlet.FirstServlet</servlet-class>
 * </servlet>
 * <servlet-mapping>
 *     <servlet-name>FirstServlet</servlet-name>
 *     <url-pattern>/first</url-pattern>
 * </servlet-mapping>
 */
//@WebServlet(name = "FirstServlet",urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String protocol = req.getProtocol();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FirstServlet......");
        String protocol = req.getProtocol();

    }

}
