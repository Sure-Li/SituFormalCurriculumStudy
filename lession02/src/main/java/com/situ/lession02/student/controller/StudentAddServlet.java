package com.situ.lession02.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;

@WebServlet("/StudentAddServlet")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doget");
		// request response
		// 设置请求对象的编码方式
		request.setCharacterEncoding("utf-8");
		String getStuName = request.getParameter("stuName");
		String getStuAge = request.getParameter("stuAge");
		System.out.println("学生姓名：" + getStuName);
		System.out.println("学生年龄 ：" + getStuAge);
		
		String sql = "INSERT INTO TB_STUDENT(STU_NAME,STU_AGE) VALUES (?,?)";
		System.out.println("受影响行数：" + JDBCUtil.executeUpdate(sql, getStuName, getStuAge));
		/* 将数据保存到DB中的表中 */
		response.sendRedirect("StudentIndexServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
