package com.situ.eoms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.situ.eoms.service.IndexService;
import com.situ.eoms.service.impl.IndexServiceImpl;
import com.situ.eoms.util.EmpUtil;

/**
 * Servlet implementation class IndexServle
 */
@WebServlet("/index")
public class IndexServle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IndexService indexService = new IndexServiceImpl();  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("项目首页的请求已经进到这里");
		boolean getValue = false;
		Cookie[] cookies = request.getCookies();
		String cookieValueGet = "";
		if(cookies!=null&&cookies.length>0) {
			for (Cookie cookie : cookies) {
				if (EmpUtil.AUTO_LOGIN_COOKIE_NAME.equals(cookie.getName())) {
					System.out.println(cookie.getName()+"\t"+cookie.getValue());
					cookieValueGet = cookie.getValue();
					getValue = true;
					break;
				}
			}
		}
		
		HttpSession session = request.getSession(); 
		System.out.println(session.getAttribute(EmpUtil.LOGIN_STUDENT));
	    if(session.getAttribute(EmpUtil.LOGIN_STUDENT)==null)
	    {
	    	if (!getValue) {
	    		response.sendRedirect("emp/emp_login.jsp");
			}
			else {
				//需要在此处自动登录完成后 将session的值带进去
				response.sendRedirect("index.jsp");
			}
	    	
	    }else {
	    	
	    	
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
