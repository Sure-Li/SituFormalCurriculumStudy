package com.situ.filemanagementsystem.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.filemanagementsystem.common.CommonUtil;
import com.situ.filemanagementsystem.pojo.FileMessage;
import com.situ.filemanagementsystem.service.FileMessageService;
import com.situ.filemanagementsystem.service.impl.FileMessageServiceImpl;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    FileMessageService fileMessageService = new FileMessageServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<FileMessage> findAllList =  fileMessageService.findAll();
		request.getServletContext().setAttribute(CommonUtil.FIND_ALL_LIST,findAllList);
		System.out.println(findAllList);
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
