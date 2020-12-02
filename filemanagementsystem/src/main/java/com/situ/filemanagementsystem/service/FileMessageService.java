package com.situ.filemanagementsystem.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.situ.filemanagementsystem.pojo.FileMessage;

public interface FileMessageService {
	boolean fileUploadOne(HttpServletRequest request, HttpServletResponse response);
	List<FileMessage> findAll();
	boolean fileDownloadOne(HttpServletRequest request, HttpServletResponse response,Long rowId);
}
