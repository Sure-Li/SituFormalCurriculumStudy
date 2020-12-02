package com.situ.filemanagementsystem.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface FileMessageService {
	boolean fileUploadOne(HttpServletRequest request, HttpServletResponse response);
}
