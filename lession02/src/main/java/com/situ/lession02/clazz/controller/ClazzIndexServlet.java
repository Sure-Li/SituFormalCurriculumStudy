package com.situ.lession02.clazz.controller;

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

import com.situ.lession02.clazz.pojo.Clazz;
import com.situ.lession02.clazz.servic.ClazzService;
import com.situ.lession02.clazz.service.impl.ClazzServiceImple;
/**
 * Servlet implementation class ClazzIndexServlet
 */
@WebServlet("/ClazzIndexServlet")
public class ClazzIndexServlet extends HttpServlet {
	ClazzService clazzService = new ClazzServiceImple();
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Clazz> resultList = new ArrayList<Clazz>();
		resultList = clazzService.findAll();
		request.setAttribute("clazzlist", resultList);
		request.getRequestDispatcher("clazz.jsp").forward(request, response);
		System.out.println(resultList);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
