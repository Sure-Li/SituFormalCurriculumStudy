package com.situ.eoms.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class EmpLoginSessionListener
 *
 */
@WebListener
public class EmpLoginSessionListener implements HttpSessionListener {

    public EmpLoginSessionListener() {
    	//服务器开启后加载监听器
    	System.out.println("EmpLoginSessionListener监听器开始运行");
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    }
	
}
