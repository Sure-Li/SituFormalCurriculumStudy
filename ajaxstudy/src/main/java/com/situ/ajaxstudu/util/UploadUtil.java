package com.situ.ajaxstudu.util;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadUtil {
	private List<FileItem> fileItemList;

	/**
	 * 构造函数中完成解析 将传入的request以二进制方式闯入的表单数据 解析成fileitem的集合
	 * @param request
	 */
	public UploadUtil(HttpServletRequest request) {
		if (ServletFileUpload.isMultipartContent(request)) {
			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setDefaultCharset("utf-8");
			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				fileItemList = upload.parseRequest(request);
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
		}

	}
	/**
	 * 根据表单域名称 得到二进制FileItem实例
	 * @param name
	 * @return
	 */
	public FileItem getBinaryData(String name) {
		if (fileItemList != null && fileItemList.size() > 0) {
			for (FileItem fileItem : fileItemList) {
				if (name.equals(fileItem.getFieldName())) {
					return fileItem;
				}
			}
		}
		return null;
	}
	/**
	 * 根据名称得到String的值
	 * 
	 * @param name
	 * @return
	 */
	public String getParameter(String name) {
		if (fileItemList != null && fileItemList.size() > 0) {
			for (FileItem fileItem : fileItemList) {
				if (name.equals(fileItem.getFieldName())) {
					return fileItem.getString();
				}
			}
		}
		return null;
	}

	public String[] getParameterValues(String name) {
		List<String> valueList = new ArrayList<String>();
		if (fileItemList != null && fileItemList.size() > 0) {
			for (FileItem fileItem : fileItemList) {
				if (name.equals(fileItem.getFieldName())) {
					valueList.add(fileItem.getString());
				}
			}
			return valueList.toArray(new String[valueList.size()]);
		}
		return null;
	}
}
