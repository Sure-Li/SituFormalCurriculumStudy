package com.situ.filemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.situ.filemanagementsystem.common.CommonUtil;
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
			String choose =obj.toString();
			System.out.println("fileAction=" + choose);
				switch (choose) {
				case CommonUtil.FILE_UPLOAD_ACTION:
					if (ServletFileUpload.isMultipartContent(request)) {
					fileMessageService.fileUploadOne(request, response);
					response.sendRedirect("index");
					}
					break;
				case CommonUtil.FILE_DOWNLOAD_ACTION:
					Object object = request.getParameter("rowId");
					if (object!=null) {
						Long rowId = Long.parseLong(object.toString());
						System.out.println(rowId);
						fileMessageService.fileDownloadOne(request, response,rowId);
					}
					
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
