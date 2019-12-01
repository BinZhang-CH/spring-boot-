package com.ztkj.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * 监听Context、Session、Request三大域 attribute的变化
 * 这里监听Context域参数的变化
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    /**
     * 增加
     * @param servletContextAttributeEvent
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name = servletContextAttributeEvent.getName();
        System.out.println("三大域 attribute的变化:"+name);
    }

    /**
     * 删除
     * @param servletContextAttributeEvent
     */
    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    /**
     * 替换
     * @param servletContextAttributeEvent
     */
    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

    }
}
