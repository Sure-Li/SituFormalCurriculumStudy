package com.situ.filemanagementsystem.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletOutputStream;
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

public class FileMessageServiceImpl implements FileMessageService {
	FileMessageDao fileMessageDao = new FileMessageDaoImpl();

	@Override
	public boolean fileUploadOne(HttpServletRequest request, HttpServletResponse response) {
		boolean result = false;
		// Create a factory for disk-based file items
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setDefaultCharset("utf-8");
		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		// 使用fileuploader Parse the request =》List<FileItem>
		try {
			List<FileItem> items = upload.parseRequest(request);
			if (items != null && items.size() > 0) {
				for (FileItem fileItem : items) {
					// 得到form提交过来想要的数据
					if (CommonUtil.FILE_UPOLAD_FIELDNAME.equals(fileItem.getFieldName())) {
						// 得到二进制流的数据
						// 得到文件名称 文件名要重新制作 但是后缀不能改变
						String fileName = fileItem.getName();
						// 解析后缀
						String prefix = fileName.substring(fileName.lastIndexOf("."));
						String newFileName = Calendar.getInstance().getTimeInMillis() + prefix;
						// 得到文件绝对路径
						String realPath = request.getServletContext().getAttribute(CommonUtil.REAL_PATH).toString();
						// 需要写出文件的相对路径
						String filePath = "file/" + newFileName;
						// 后期相对路径需要保存到数据库中
						System.out.println(realPath + filePath);
						File tofile = new File(realPath + filePath);
						// 尝试生成文件目录
						File parentFile = tofile.getParentFile();
						if (!parentFile.exists()) {
							parentFile.mkdirs();
						}
						fileItem.write(tofile);
						System.out.println("文件写出成功");

						FileMessage uploadFile = new FileMessage(fileName, fileItem.getContentType(),
								(fileItem.getSize() / 1024F), filePath, Calendar.getInstance().getTime(), 1, "li",
								Calendar.getInstance().getTime(), "li", null);
						System.out.println(uploadFile);
						// 此处DAO层介入 需要将文件的数据的内容写出到数据库
						fileMessageDao.fileUploadOne(uploadFile);
						result = true;
					}
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<FileMessage> findAll() {
		return fileMessageDao.findAll();
	}

	@Override
	public boolean fileDownloadOne(HttpServletRequest request, HttpServletResponse response,Long rowId) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		FileMessage getFileMessage =  fileMessageDao.findOneById(rowId);
		//要下载文件的输入流
		File fromFile = new File(request.getServletContext().getRealPath("/")+getFileMessage.getFilePath());
		
		try {
			InputStream input = new FileInputStream(fromFile);
			response.setHeader("Content-Disposition","attachment; filename=" + getFileMessage.getFileName());
			System.out.println(getFileMessage.getFileName());
			
			//将输入流响应给浏览器
			ServletOutputStream output;
			output = response.getOutputStream();
			byte[] bytes =new byte[1024];
			@SuppressWarnings("unused")
			int length=-1;
			while((length=input.read(bytes))!=-1){
				output.write(bytes);
			}
			output.close();
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
