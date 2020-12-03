package com.situ.ajaxstudu.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.ajaxstudu.pojo.Clazz;
import com.situ.ajaxstudu.service.ClazzService;
import com.situ.ajaxstudu.service.impl.ClazzServiceImple;

/**
 * Servlet implementation class ClazzServlet
 */
@WebServlet("/ClazzServlet")
public class ClazzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ClazzService   clazzService = new ClazzServiceImple();
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.length()>0) {
			switch (action) {
			case "list":
				List<Clazz> clazzList = clazzService.findAll();
				request.setAttribute("clazzList", clazzList);
				request.getRequestDispatcher("clazz/clazzlist.jsp").forward(request, response);
				break;

			default:
				break;
			}
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
