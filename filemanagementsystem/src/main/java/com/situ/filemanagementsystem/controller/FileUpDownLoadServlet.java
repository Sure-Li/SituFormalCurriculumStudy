package com.situ.filemanagementsystem.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.situ.filemanagementsystem.common.CommonUtil;
import com.situ.filemanagementsystem.dao.FileMessageDao;
import com.situ.filemanagementsystem.dao.impl.FileMessageDaoImpl;
import com.situ.filemanagementsystem.pojo.FileMessage;
import com.situ.filemanagementsystem.service.FileMessageService;
import com.situ.filemanagementsystem.service.impl.FileMessageServiceImpl;

/**
 * Servlet implementation class FileUpDownLoadServlet
 */
@WebServlet("/FileUpDownLoadServlet")
public class FileUpDownLoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * fileAction=upload fileAction=download
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		FileMessageService fileMessageService = new FileMessageServiceImpl();
		Object obj = request.getParameter("fileAction");
		
		if (obj != null) {
			System.out.println("fileAction=" + obj.toString());
			if (ServletFileUpload.isMultipartContent(request)) {
				switch (obj.toString()) {
				case "upload":
					fileMessageService.fileUploadOne(request, response);
					response.sendRedirect("index");
					break;
				case "download":

					break;

				default:
					break;
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
