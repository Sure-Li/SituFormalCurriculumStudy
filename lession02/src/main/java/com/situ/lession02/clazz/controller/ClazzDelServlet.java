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
 * Servlet implementation class ClazzDelServlet
 */
@WebServlet("/ClazzDelServlet")
public class ClazzDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClazzService clazzService = new ClazzServiceImple();    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("message:"+request.getParameter("delName"));
		String sql = "DELETE FROM TB_CLAZZ WHERE ROW_ID = ?";
		System.out.println("受影响行数：" + JDBCUtil.executeUpdate(sql, request.getParameter("delName")));
		/* 将数据保存到DB中的表中 */
		response.sendRedirect("ClazzIndexServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
