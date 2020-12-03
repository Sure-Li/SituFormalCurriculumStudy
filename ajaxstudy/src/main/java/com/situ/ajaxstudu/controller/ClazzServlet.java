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
			System.out.println(action);
			switch (action) {
			case "list":
				List<Clazz> clazzList = clazzService.findAll();
				request.setAttribute("clazzList", clazzList);
				request.getRequestDispatcher("clazz/clazzlist.jsp").forward(request, response);
				break;
			case "check":
				Clazz clazzget =null;
//				clazzget = clazzService.findOne(action);
				String clazzName = request.getParameter("clazzName");
				System.out.println("clazzName: "+clazzName);
				clazzget = clazzService.findOneByName(clazzName);
				System.out.println(clazzget);
				if (clazzget!=null) {
					response.getWriter().write("1");
				}else {
					response.getWriter().write("0");
				}
				break;
			case "addform":
				response.sendRedirect("clazz/clazzadd.jsp");
				break;
			case "edit":
				String rowId = request.getParameter("rowId");
				System.out.println(rowId);
				Clazz clazzGet = clazzService.findOne(rowId);
				request.setAttribute("clazzGet", clazzGet);
				request.getRequestDispatcher("clazz/clazzedit.jsp").forward(request, response);
				break;
			case "doEdit":
				clazzService.updateClazz(new Clazz(Long.parseLong(request.getParameter("rowId")), request.getParameter("clazzName"), Integer.parseInt(request.getParameter("clazzStudentNumberEdit")), request.getParameter("clazzInfoEdit")));
				response.getWriter().write("1");
				break;
			case "add":
				clazzService.addClazz(request.getParameter("clazzName"), Integer.parseInt(request.getParameter("clazzStudentNumber")), request.getParameter("clazzInfo"));
				response.getWriter().write("1");
				break;
			case "delete":
				clazzService.delClazzByRowId(request.getParameter("rowId"));
				response.getWriter().write("1");
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
