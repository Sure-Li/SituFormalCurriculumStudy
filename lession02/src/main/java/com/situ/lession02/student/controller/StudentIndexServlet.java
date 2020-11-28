package com.situ.lession02.student.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;
import com.situ.lession02.student.pojo.Student;

/**
 * Servlet implementation class StudentIndexServlet
 */
@WebServlet("/StudentIndexServlet")
public class StudentIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询学生信息
		List<Student> resultList = new ArrayList<Student>();
		String sql = "SELECT * FROM TB_STUDENT";
		ResultSet resultTemp =  JDBCUtil.executeQuery(sql);
		try {
			while(resultTemp.next()) {
				resultList.add(new Student(resultTemp.getObject("ROW_ID").toString(),resultTemp.getLong("CLAZZ_ID"),resultTemp.getString("STU_CODE"),resultTemp.getString("STU_PASSWORD"),resultTemp.getObject("STU_NAME").toString(),resultTemp.getObject("STU_AGE").toString(),resultTemp.getDate("STU_BIRTHDAY")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("studentlist", resultList);
		request.getRequestDispatcher("student.jsp").forward(request, response);
		System.out.println(resultList);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
