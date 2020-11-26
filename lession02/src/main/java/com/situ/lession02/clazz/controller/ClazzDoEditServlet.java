package com.situ.lession02.clazz.controller;

import java.io.IOException;
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
 * Servlet implementation class ClazzDoEditServlet
 */
@WebServlet("/ClazzDoEditServlet")
public class ClazzDoEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClazzService clazzService = new ClazzServiceImple();    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Long rowId = Long.parseLong(request.getParameter("clazzIdEdit"));
		String clazzName = request.getParameter("clazzNameEdit");
		Integer clazzStudentNumber = Integer.parseInt(request.getParameter("clazzStudentNumberEdit"));
		String clazzInfo = request.getParameter("clazzInfoEdit");
		//此处应该传递值给service层---》生成student
		Clazz clazzGet = new Clazz(rowId, clazzName, clazzStudentNumber, clazzInfo);
		clazzService.updateClazz(clazzGet);
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
