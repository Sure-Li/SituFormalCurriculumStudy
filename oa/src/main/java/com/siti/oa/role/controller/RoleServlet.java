package com.siti.oa.role.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.siti.oa.role.pojo.Role;
import com.siti.oa.role.service.RoleService;
import com.siti.oa.role.service.impl.RoleServiceImpl;

/**
 * Servlet implementation class RoleServlet
 */
@WebServlet("/RoleServlet")
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    RoleService roleService = new RoleServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.length()>0) {
			System.out.println(action);
			switch (action) {
			case "list":
				List<Role> roleList = roleService.findAll();
				response.setCharacterEncoding("utf-8");
				ObjectMapper objectMapper = new ObjectMapper();
				String jsonString = objectMapper.writeValueAsString(roleList);
				System.out.println(jsonString);
				response.getWriter().write(jsonString);
				break;
			case "check":
				Role roleGet =null;
//				clazzget = clazzService.findOne(action);
				String roleName = request.getParameter("roleName");
				System.out.println("roleName: "+roleName);
				roleGet = roleService.findOneByName(roleName);
				System.out.println(roleGet);
				if (roleGet!=null) {
					response.getWriter().write("1");
				}else {
					response.getWriter().write("0");
				}
				break;
			case "addform":
				response.sendRedirect("role/roleadd.jsp");
				break;
			case "edit":
				String rowId = request.getParameter("rowId");
				System.out.println(rowId);
				Role roleGetOne = roleService.findOne(rowId);
				request.setAttribute("clazzGet", roleGetOne);
				request.getRequestDispatcher("clazz/clazzedit.jsp").forward(request, response);
				break;
			case "doEdit":
//				roleService.updateClazz(new Role(Long.parseLong(request.getParameter("rowId")), request.getParameter("clazzName"), Integer.parseInt(request.getParameter("clazzStudentNumberEdit")), request.getParameter("clazzInfoEdit")));
				response.getWriter().write("1");
				break;
			case "add":
				roleService.addRole(Integer.parseInt(request.getParameter("clazzStudentNumber")),request.getParameter("clazzName"), request.getParameter("clazzInfo"));
				response.getWriter().write("1");
				break;
			case "delete":
				roleService.delRoleByRowId(request.getParameter("rowId"));
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
