package com.situ.eoms.upload;

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

/**
 * Servlet implementation class UploaderServlet
 */
@WebServlet("/UploaderServlet")
public class UploaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameter("stuName")+"\t"+request.getParameter("stuImage"));
		//判断是否是2进制流
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if(isMultipart) {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setDefaultCharset("utf-8");
			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 使用fileuploader Parse the request =》List<FileItem>
			try {
				List<FileItem> items = upload.parseRequest(request);
				if (items!=null&&items.size()>0) {
					for (FileItem fileItem : items) {
						System.out.print(fileItem.getFieldName());
						if(fileItem.isFormField()) {
							String name = fileItem.getFieldName();
							String value = fileItem.getString();
							System.out.println(name+"==="+value);
						}else{
							//得到二进制流的数据
							InputStream input = fileItem.getInputStream();
							//得到文件名称 文件名要重新制作 但是后缀不能改变
							String filename = fileItem.getName();
							//解析后缀
							String prefix = filename.substring(filename.lastIndexOf("."));
							String newFileName = Calendar.getInstance().getTimeInMillis()+prefix;
							//将文件写出
							//得到文件绝对路径
							ServletContext application = request.getServletContext();
							String realPath = application.getRealPath("/");
							//需要写出文件的相对路径
							String filePath = "file/"+newFileName;
							System.out.println(realPath+filePath);
							File tofile = new File(realPath+filePath);
							//尝试生成文件目录
							File parentFile = tofile.getParentFile();
							if (!parentFile.exists()) {
								parentFile.mkdirs();
							}
							//输出流
							BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tofile));
							
							BufferedInputStream bis =new BufferedInputStream(input);
							
							byte[] bytes= new byte[2048];
							int length =-1;
							while((length = bis.read(bytes))!=-1) {
								bos.write(bytes,0,length);
							}
							bos.close();
							bis.close();
							System.out.println("文件写出成功");
						}
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
