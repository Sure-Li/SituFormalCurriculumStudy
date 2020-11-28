package com.situ.lession02.student.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;
import com.situ.lession02.student.pojo.Student;

/**
 * Servlet implementation class StudentGoEditServlet
 */
@WebServlet("/StudentGoEditServlet")
public class StudentGoEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rowId =  request.getParameter("rowId");
		System.out.println(rowId);
		//服务层进行查询 返回类的实例
		String sql = "SELECT * FROM TB_STUDENT WHERE ROW_ID = ?";
		ResultSet studentList = JDBCUtil.executeQuery(sql, rowId);
		//==》得到一个类的实例
		Student studentEdit = new Student();
		studentEdit.setRow_id(rowId);
		try {
			while (studentList.next()) {
				studentEdit.setStuName(studentList.getString("STU_NAME"));
				studentEdit.setStuAge(studentList.getString("STU_AGE"));
				studentEdit.setClazzId(studentList.getLong("CLAZZ_ID"));
				studentEdit.setStuBirthday(studentList.getDate("STU_BIRTHDAY"));
				studentEdit.setStuCode(studentList.getString("STU_CODE"));
				studentEdit.setStuPassword(studentList.getString("STU_PASSWORD"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		==》 再将数据给到页面
//		下一步在studenEdit。jsp中解析 输出在界面中
		request.setAttribute("studentEdit", studentEdit);
		System.out.println(studentEdit);
		request.getRequestDispatcher("studentEdit.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
