package com.situ.ajaxstudu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StuAddServlet")
public class StuAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			System.out.println(request.getParameter("stuNo"));
			System.out.println(request.getParameter("stuName"));
			System.out.println(request.getParameter("stuAge"));
			//通过服务层 保存到数据库中
			response.getWriter().write("后台获取到数据");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
