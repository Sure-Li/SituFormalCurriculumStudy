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
		response.setCharacterEncoding("utf-8");
		if(action.length()>0) {
			System.out.println(action);
			switch (action) {
			case "list":
				List<Role> roleList = roleService.findAll();
				System.out.println(roleList);
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
				response.sendRedirect("role/role_add.jsp");
				break;
			case "edit":
				String rowId = request.getParameter("rowId");
				System.out.println(rowId);
				Role roleGetOne = roleService.findOne(rowId);
				response.setCharacterEncoding("utf-8");
				String jsonStringEdit = new ObjectMapper().writeValueAsString(roleGetOne);
				System.out.println(jsonStringEdit);
				response.getWriter().write(jsonStringEdit);
				break;
			case "goEdit":
				response.sendRedirect("role/role_edit.jsp");
				break;
			case "doEdit":
//				System.out.println(Integer.parseInt(request.getParameter("roleType"))+request.getParameter("roleName")+request.getParameter("roleInfo")+Long.parseLong(request.getParameter("rowId")));
				roleService.updateRole(Integer.parseInt(request.getParameter("roleType")),request.getParameter("roleName"), request.getParameter("roleInfo"),Long.parseLong(request.getParameter("rowId")));
				response.getWriter().write("角色修改成功");
				break;
			case "doAdd":
				request.setCharacterEncoding("utf-8");
//				System.out.println(request.getParameter("roleName"));
				roleService.addRole(Integer.parseInt(request.getParameter("roleType")),request.getParameter("roleName"), request.getParameter("roleInfo"));
				response.getWriter().write("角色新增完成");
				break;
			case "delete":
				roleService.delRoleByRowId(request.getParameter("rowId"));
				response.getWriter().write("角色删除成功");
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
