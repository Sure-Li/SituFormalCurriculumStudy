package com.situ.lession02.student.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;

/**
 * Servlet implementation class StudentBeforeAddServlet
 */
@WebServlet("/StudentBeforeAddServlet")
public class StudentBeforeAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer resultString = new StringBuffer();
		String sql = "SELECT CLAZZ_ID FROM TB_STUDENT";
		ResultSet studentClazzIdSet = JDBCUtil.executeQuery(sql);
		try {
			while(studentClazzIdSet.next()) {
				resultString.append(studentClazzIdSet.getLong("CLAZZ_ID")).append(",");
			}
			System.out.println(resultString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("clazzIdSet", resultString);
		request.getRequestDispatcher("student_add.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
