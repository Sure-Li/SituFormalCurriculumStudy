package com.situ.eoms.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
/**
 * action
 * @author Administrator
 *
 */
@WebServlet("/CookieTestServlet")
public class CookieTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Object obj = request.getParameter("action");
		String action ="";
		if (obj!=null) {
			 action = obj.toString();
		}
		System.out.println(action);
		switch (action) {
		case "add":
			addCookieMethod(response);
			break;
		case "get":
			getCookieMethod(request);
			break;
		case "del":
			delCookieMethod(request,response);
			break;

		default:
			break;
		}
		
	}
	private void addCookieMethod(HttpServletResponse response)
	{
		String name = "situ_cookie";//一般使用项目的域名  全球唯一的
		String value = "this_is_value";//cookie中不能有空格 cookie限制严格
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(60*60*24*7);//设置cookie最大值   单位秒 七天有效时间
		
//		向浏览器写出cookie
		 response.addCookie(cookie);
		System.out.println("cookie写出成功！");
	}
	private void getCookieMethod(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies!=null&&cookies.length>0) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName()+"\t"+cookie.getValue());
			}
		}
	}
	private void delCookieMethod(HttpServletRequest request,HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		if(cookies!=null&&cookies.length>0) {
			for (Cookie cookie : cookies) {
				if ("situ_cookie".equals(cookie.getName())) {
					System.out.println(cookie.getName()+"\t"+cookie.getValue());
					cookie.setMaxAge(0);
//					向浏览器写出cookie
					response.addCookie(cookie);
				}
				
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
