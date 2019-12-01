package com.ztkj.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 利用session监听器统计网站访问人数
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
    private static  int  COUNT=0;
    @Override
    public void sessionCreated(HttpSessionEvent arg0) {
        System.out.println("SessionListener被创建......");
        String id = arg0.getSession().getId();
        COUNT++;
        System.out.println("访问人数："+COUNT);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        System.out.println("SessionListener被销毁......");
    }
}
