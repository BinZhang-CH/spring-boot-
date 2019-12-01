package com.ztkj.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ServletContex域监听器
 * 初始化的工作：初始化对象、初始化数据（加载数据库驱动、连接池的初始化）
 * 加载一些初始化的配置文件(spring的配置文件）
 * 任务调度(定时器—Timer/TimerTask）
 */
@WebListener
public class ServletContexListener implements ServletContextListener {
    /**
     * 监听器初始化
     * @param arg0
     * Ctrl+Alt+L代码格式化
     */
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        ServletContext servletContext1 = arg0.getServletContext();//返回值是被监听的对象
        Object servletContext2 = arg0.getSource();//等同于arg0.getServletContext()，获得的是Object类型，但实际上也是获得被监听的对象
        System.out.println("context创建了...");
//        开启一个计息任务调度——每天晚上12点计息一次
        Timer timer = new Timer();
//        task任务，firstTime第一次执行的时间，period间隔执行的时间(单位毫秒)
//        timer.scheduleAtFixedRate(task, firstTime, period);
//        测试demo:从服务器启动开始每隔5秒打印“银行计息了”
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("银行计息了...");
            }
        }, new Date(), 60*1000);

    }

    /**
     * 监听器销毁
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("context销毁了...");

    }
}
