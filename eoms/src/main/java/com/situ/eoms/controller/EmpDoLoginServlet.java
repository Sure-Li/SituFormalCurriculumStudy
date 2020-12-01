package com.situ.eoms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.situ.eoms.service.EmpService;
import com.situ.eoms.service.impl.EmpServiceImpl;
import com.situ.eoms.service.impl.IndexServiceImpl;
import com.situ.eoms.util.EmpUtil;

/**
 * Servlet implementation class EmpDoLoginServlet
 */
@WebServlet("/EmpDoLoginServlet")
public class EmpDoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpService empServic = new EmpServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empId = request.getParameter("empId");
		String empPassword = request.getParameter("empPassword");
		Object isAtuoLogin = request.getParameter("isAtuoLogin");//
		
		System.out.println("登录信息：");
		System.out.println("empId:" + empId);
		System.out.println("empPassword:" + empPassword);
		System.out.println("isAtuoLogin:"+isAtuoLogin);
		
		//session 会话
		HttpSession session = request.getSession();
		int result =  empServic.empLogin(empId, empPassword, session);
		switch (result) {
		case EmpUtil.PASSWORD_RIGHT:
			System.out.println("账号密码匹配完成 账号登录成功");
			if (isAtuoLogin!=null) {
				System.out.println("自动登录打开");
//				自动登录打开 开始向cookie中注入信息
//				从数据库中查找数据 然后将信息注入到cookie中
				new IndexServiceImpl().doAutoLogin(empId, empPassword, session, request, response);
				
				
			}
			response.sendRedirect("index.jsp");
			break;
		case EmpUtil.PASSWORD_WRONG:
			String infoPasswordWrong = "账号或者密码错误 登录失败";
			request.setAttribute("loginInfo", infoPasswordWrong);
			System.out.println("----------------");
			request.getRequestDispatcher("emp/emp_login.jsp").forward(request, response);
			break;
		case EmpUtil.PASSWORD_OTHER_ERROR:
			String infoPasswordOtherError = "账号或者密码错误 登录失败";
			request.setAttribute("loginInfo", infoPasswordOtherError);
			System.out.println("------------------------");
			request.getRequestDispatcher("emp/emp_login.jsp").forward(request, response);
			break;

		default:
			System.out.println("出现了不可预测的错误 请检查系统");
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
