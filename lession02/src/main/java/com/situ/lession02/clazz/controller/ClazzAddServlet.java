package com.situ.lession02.clazz.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;
import com.situ.lession02.clazz.servic.ClazzService;
import com.situ.lession02.clazz.service.impl.ClazzServiceImple;

/**
 * Servlet implementation class ClazzAddServlet
 */
@WebServlet("/ClazzAddServlet")
public class ClazzAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClazzService clazzService = new ClazzServiceImple();   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		String clazzName = request.getParameter("clazzName");
		Integer clazzStudentNumber = Integer.parseInt(request.getParameter("clazzStudentNumber"));
		String clazzInfo = request.getParameter("clazzInfo");
		System.out.println("班级姓名：" + clazzName);
		System.out.println("班级学生数量 ：" + clazzStudentNumber);
		System.out.println("班级信息量 ：" + clazzInfo);
		clazzService.addClazz(clazzName, clazzStudentNumber, clazzInfo);
		
		/* 将数据保存到DB中的表中 */
		response.sendRedirect("ClazzIndexServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
