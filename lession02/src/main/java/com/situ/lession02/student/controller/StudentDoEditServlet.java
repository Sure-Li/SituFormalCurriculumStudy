package com.situ.lession02.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.lession02.JDBCUtil;
import com.situ.lession02.student.pojo.Student;

/**
 * Servlet implementation class StudentDoEditServlet
 */
@WebServlet("/StudentDoEditServlet")
public class StudentDoEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rowId = request.getParameter("stuIdEdit");
		String stuAge = request.getParameter("stuAgeEdit");
		String stuName = request.getParameter("stuNameEdit");
		//此处应该传递值给service层---》生成student
		Student studentGoEdit = new Student(rowId, stuName, stuAge);
		/*
		 * 从数据库里拿到旧类 用新数据进行覆盖
		 * 在将类的新数据导入数据库
		 * 然后对updateby等人进行更新
		 * */
		//此处应该student---》dao层进行数据库更新
		String sql = "UPDATE `test`.`TB_STUDENT` SET `STU_NAME` = ? , `STU_AGE` = ? WHERE `ROW_ID` = ?";
		JDBCUtil.executeUpdate(sql, studentGoEdit.getStuName(),studentGoEdit.getStuAge(),studentGoEdit.getRow_id());
		//--更新完毕后跳转页面
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
