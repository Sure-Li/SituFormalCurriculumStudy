package com.situ.lession02.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;

/**
 * Servlet implementation class StudentDelServlet
 */
@WebServlet("/StudentDelServlet")
public class StudentDelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("message:"+request.getParameter("delName"));
		String sql = "DELETE FROM TB_STUDENT WHERE ROW_ID = ?";
		System.out.println("受影响行数：" + JDBCUtil.executeUpdate(sql, request.getParameter("delName")));
		/* 将数据保存到DB中的表中 */
		response.sendRedirect("StudentIndexServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
