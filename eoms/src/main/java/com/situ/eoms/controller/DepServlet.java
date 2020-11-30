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

import com.situ.eoms.pojo.Department;
import com.situ.eoms.pojo.Employee;
import com.situ.eoms.service.DepService;
import com.situ.eoms.service.EmpService;
import com.situ.eoms.service.impl.DepServiceImpl;
import com.situ.eoms.service.impl.EmpServiceImpl;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/DepServlet")
public class DepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DepService depService = new DepServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String getAction = request.getParameter("depAction");
		System.out.println(getAction);
		if(getAction!="") {
			switch (getAction) {
			case "add":
				request.setCharacterEncoding("utf-8");
				Long depId = Long.parseLong( request.getParameter("depId"));
				String depName = request.getParameter("depName");
				String depinfo = request.getParameter("depInfo");
				
				Department departement = new Department(depId, depName, 0, depinfo, 1, "li", Calendar.getInstance().getTime(), null, null);
				depService.add(departement);
				System.out.println("wwwwwwwwwww");
				response.sendRedirect("DepServlet?depAction=select");
				break;
			case "delete":
				String rowId=request.getParameter("delName");
				depService.deleteDep(rowId);
				response.sendRedirect("DepServlet?depAction=select");
				break;
			case "select":
				List<Department> resultList = new ArrayList<Department>();
				resultList = depService.findAll();
				request.setAttribute("depList", resultList);
				request.getRequestDispatcher("dep/dep.jsp").forward(request, response);
				System.out.println(resultList);
				break;
			case "goUpdate":
				String rowId1 =  request.getParameter("rowId");
				System.out.println(rowId1);
				Department depEdit = depService.findOne(rowId1);
				System.out.println(depEdit);
				depEdit.setRowId(Long.parseLong(rowId1));
				request.setAttribute("depEdit", depEdit);
				System.out.println(depEdit);
				request.getRequestDispatcher("dep/dep_edit.jsp").forward(request, response);
				break;
			case "doUpdate":
				request.setCharacterEncoding("utf-8");
				Long rowIdEdit = Long.parseLong(request.getParameter("rowIdEdit"));
				long depIdEdit = Long.parseLong(request.getParameter("depIdEdit"));
				String depNameEdit = request.getParameter("depNameEdit");
				String depInfoEdit = request.getParameter("depInfoEdit");
				Department deployeeEdit = new Department(rowIdEdit,depIdEdit, depNameEdit, depInfoEdit,"li", Calendar.getInstance().getTime());
				
				depService.update(deployeeEdit);
				response.sendRedirect("DepServlet?depAction=select");
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
