package com.situ.lession02.clazz.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;
import com.situ.lession02.clazz.pojo.Clazz;
import com.situ.lession02.clazz.servic.ClazzService;
import com.situ.lession02.clazz.service.impl.ClazzServiceImple;
import com.situ.lession02.student.pojo.Student;

/**
 * Servlet implementation class ClazzGoEditServlet
 */
@WebServlet("/ClazzGoEditServlet")
public class ClazzGoEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClazzService clazzService = new ClazzServiceImple();      

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rowId =  request.getParameter("rowId");
		System.out.println(rowId);
		//服务层进行查询 返回类的实例
		//==》得到一个类的实例
		Clazz clazzEdit = clazzService.findOne(rowId);
		clazzEdit.setRowId(Long.parseLong(rowId));
		request.setAttribute("clazzEdit", clazzEdit);
		System.out.println(clazzEdit);
		request.getRequestDispatcher("clazzEdit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
