package com.situ.ajaxstudu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StuCkeckNoServlet
 */
@WebServlet("/StuCkeckNoServlet")
public class StuCkeckNoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String getStuNo = request.getParameter("stuNo");
		System.out.println(getStuNo);
		String result = "0";
		if ("0001".equals(getStuNo)) {
			result ="1";
		}
		//结果响应给ajax
		response.getWriter().write(result);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
