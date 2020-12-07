package com.siti.oa.user.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.siti.oa.user.pojo.User;
import com.siti.oa.user.service.UserService;
import com.siti.oa.user.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService userService = new UserServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		Object isAtuoLogin = request.getParameter("isAtuoLogin");//
		
		System.out.println("登录信息：");
		System.out.println("userId:" + userId);
		System.out.println("userPassword:" + userPassword);
		System.out.println("isAtuoLogin:"+isAtuoLogin);
		
		//session 会话
		HttpSession session = request.getSession();
		int result =  userService.userLogin(userId, userPassword, session);
		switch (result) {
		case 1:
			System.out.println("账号密码匹配完成 账号登录成功");
			if (isAtuoLogin!=null) {
				System.out.println("自动登录打开");
//				自动登录打开 开始向cookie中注入信息
//				从数据库中查找数据 然后将信息注入到cookie中
				doAutoLogin(userId, userPassword, session, request, response);
			}
			response.sendRedirect("index.jsp");
			break;
		case 2:
			String infoPasswordWrong = "账号或者密码错误 登录失败";
			request.setAttribute("loginInfo", infoPasswordWrong);
			System.out.println("----------------");
			request.getRequestDispatcher("user/user_login.jsp").forward(request, response);
			break;
		case 3:
			String infoPasswordOtherError = "账号或者密码错误 登录失败";
			request.setAttribute("loginInfo", infoPasswordOtherError);
			System.out.println("------------------------");
			request.getRequestDispatcher("user/user_login.jsp").forward(request, response);
			break;

		default:
			System.out.println("出现了不可预测的错误 请检查系统");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public boolean doAutoLogin(String userId, String userPassword, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		Object obj =  userService.userFindOne(userId, userPassword);
		if(obj!=null) {
			User user = (User) obj;
			StringBuffer cookieValue = new StringBuffer();
			cookieValue.append(user.getRowId()+"~#~"+user.getUserId());
			Cookie cookie = new Cookie("loginUserName", cookieValue.toString());
			cookie.setMaxAge(60*60*24*7);
			response.addCookie(cookie);
		}
		return false;
	}

}
