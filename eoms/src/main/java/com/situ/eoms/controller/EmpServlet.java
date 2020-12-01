package com.situ.eoms.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.eoms.pojo.Employee;
import com.situ.eoms.service.EmpService;
import com.situ.eoms.service.impl.EmpServiceImpl;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpService empService = new EmpServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String getAction = request.getParameter("empAction");
		System.out.println(getAction);
		if (getAction != "") {
			switch (getAction) {
			case "beforAdd":
				String result = empService.beforeAdd().toString();
				request.setAttribute("depIdSet", result);
				request.getRequestDispatcher("emp/emp_add.jsp").forward(request, response);
				break;
			case "add":
				request.setCharacterEncoding("utf-8");
				String empName = request.getParameter("empName");
				Integer empLevel = Integer.parseInt(request.getParameter("empLevel"));
				Long empDepId = Long.parseLong(request.getParameter("empDepId"));
				Long empId = Long.parseLong(request.getParameter("empId"));
				String empPassword = request.getParameter("empPassword");
				Date empJoinTime = null;
				try {
					empJoinTime = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("empJoinTime"));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Employee employee = new Employee(empDepId, empId, empPassword, empName, empJoinTime, empLevel, 1, "li",
						Calendar.getInstance().getTime(), "li", Calendar.getInstance().getTime());
				empService.add(employee);
				response.sendRedirect("EmpServlet?empAction=select");
				break;
			case "delete":
				String rowId = request.getParameter("delName");
				empService.deleteEmp(rowId);
				response.sendRedirect("EmpServlet?empAction=select");
				break;
			case "update":

				break;
			case "select":
				List<Employee> resultList = new ArrayList<Employee>();
				resultList = empService.findAll();
				request.setAttribute("empList", resultList);
				request.getRequestDispatcher("emp/emp.jsp").forward(request, response);
				System.out.println(resultList);
				break;
			case "goUpdate":
				String rowId1 = request.getParameter("rowId");
				System.out.println(rowId1);
				Employee empEdit = empService.findOne(rowId1);
				System.out.println(empEdit);
				empEdit.setRowId(Long.parseLong(rowId1));
				request.setAttribute("empEdit", empEdit);
				System.out.println(empEdit);
				request.getRequestDispatcher("emp/emp_edit.jsp").forward(request, response);
				break;
			case "doUpdate":
				request.setCharacterEncoding("utf-8");
				Long empRowIDEdit = Long.parseLong(request.getParameter("empRowIDEdit"));
				String empNameEdit = request.getParameter("empNameEdit");
				Integer empLevelEdit = Integer.parseInt(request.getParameter("empLevelEdit"));
				Long empDepIdEdit = Long.parseLong(request.getParameter("empDepIdEdit"));
				Long empIdEdit = Long.parseLong(request.getParameter("empIdEdit"));
				String empPasswordEdit = request.getParameter("empPasswordEdit");
				Date empJoinTimeEdit = null;
				try {
					empJoinTimeEdit = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("empJoinTimeEdit"));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Employee employeeEdit = new Employee(empRowIDEdit, empDepIdEdit, empIdEdit, empPasswordEdit,
						empNameEdit, empJoinTimeEdit, empLevelEdit, "li", Calendar.getInstance().getTime());
				empService.update(employeeEdit);
				response.sendRedirect("EmpServlet?empAction=select");
				break;
			default:
				break;
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
