package com.situ.filemanagementsystem.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.situ.filemanagementsystem.common.CommonUtil;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
@WebListener
public class ApplicationListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("服务器关闭，销毁application");
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("服务器启动，获取当前项目绝对路径");
		ServletContext application = sce.getServletContext();
		System.out.println(application.getRealPath("/"));
		application.setAttribute(CommonUtil.REAL_PATH, application.getRealPath("/"));
	}

}
