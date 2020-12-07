package com.siti.oa.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.siti.oa.user.pojo.User;
import com.siti.oa.user.service.UserService;
import com.siti.oa.user.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserService userService = new UserServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		response.setCharacterEncoding("utf-8");
		if(action.length()>0) {
			System.out.println(action);
			switch (action) {
			case "list":
				List<User> userList = userService.findAll();
				System.out.println(userList);
				response.setCharacterEncoding("utf-8");
				ObjectMapper objectMapper = new ObjectMapper();
				String jsonString = objectMapper.writeValueAsString(userList);
				System.out.println(jsonString);
				response.getWriter().write(jsonString);
				break;
			case "check":
				User userGet =null;
//				clazzget = clazzService.findOne(action);
				String userName = request.getParameter("userName");
				System.out.println("userName: "+userName);
				userGet = userService.findOneByName(userName);
				System.out.println(userGet);
				if (userGet!=null) {
					response.getWriter().write("1");
				}else {
					response.getWriter().write("0");
				}
				break;
			case "addform":
				response.sendRedirect("user/user_add.jsp");
				break;
			case "edit":
				String rowId = request.getParameter("rowId");
				System.out.println(rowId);
				User userGetOne = userService.findOne(rowId);
				response.setCharacterEncoding("utf-8");
				String jsonStringEdit = new ObjectMapper().writeValueAsString(userGetOne);
				System.out.println(jsonStringEdit);
				response.getWriter().write(jsonStringEdit);
				break;
			case "goEdit":
				response.sendRedirect("user/user_edit.jsp");
				break;
			case "doEdit":
//				System.out.println(Integer.parseInt(request.getParameter("userType"))+request.getParameter("userName")+request.getParameter("userInfo")+Long.parseLong(request.getParameter("rowId")));
				userService.updateUser(request.getParameter("userName"),request.getParameter("userId"), request.getParameter("userPassword"),request.getParameter("userPhoto"),request.getParameter("userLoginCount"),request.getParameter("userLastLoginTime"),request.getParameter("userLastLoginIp"),request.getParameter("userLock"),Long.parseLong(request.getParameter("rowId")));
				//此处还需处理好角色
				response.getWriter().write("用户修改成功");
				break;
			case "doAdd":
				request.setCharacterEncoding("utf-8");
				System.out.println(request.getParameter("userRole"));
				System.out.println(request.getParameter("userName"));
				System.out.println(request.getParameter("userName"));
				userService.addUser(request.getParameter("userName"),request.getParameter("userId"), request.getParameter("userPassword"),request.getParameter("userPhoto"),request.getParameter("userLoginCount"),request.getParameter("userLastLoginTime"),request.getParameter("userLastLoginIp"),request.getParameter("userLock"));
				
				response.getWriter().write("用户新增完成");
				break;
			case "delete":
				userService.delUserByRowId(request.getParameter("rowId"));
				response.getWriter().write("用户删除成功");
				break;
			case "getRole":
				List<String> getAllRole= userService.findAllRole();
				response.setCharacterEncoding("utf-8");
				String jsonStringGetAllRole = new ObjectMapper().writeValueAsString(getAllRole);
				System.out.println(jsonStringGetAllRole);
				response.getWriter().write(jsonStringGetAllRole);
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
