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
		System.out.println("登录信息：");
		System.out.println("empId:" + empId);
		System.out.println("empPassword:" + empPassword);
		//session 会话
		HttpSession session = request.getSession();
		int result =  empServic.empLogin(empId, empPassword, session);
		switch (result) {
		case EmpUtil.PASSWORD_RIGHT:
			System.out.println("账号密码匹配完成 账号登录成功");
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
