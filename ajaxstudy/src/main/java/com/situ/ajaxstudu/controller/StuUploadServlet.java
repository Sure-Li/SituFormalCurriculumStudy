package com.situ.ajaxstudu.controller;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;

import com.situ.ajaxstudu.util.UploadUtil;

/**
 * Servlet implementation class StuUploadServlet
 */
@WebServlet("/StuUploadServlet")
public class StuUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UploadUtil uploadutil = new UploadUtil(request);
		FileItem fileItem = uploadutil.getBinaryData("stuImage");
		String name = fileItem.getName();
		String realPath = request.getServletContext().getRealPath("/");
		String filePath = "upfiles"+Calendar.getInstance().getTimeInMillis()+name.substring(name.lastIndexOf("."));
		File tofile = new File(realPath+filePath);
		File fileParent = tofile.getParentFile();
		if (!fileParent.exists()) {
			fileParent.mkdirs();
		}
		try {
			fileItem.write(tofile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().write(filePath);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
