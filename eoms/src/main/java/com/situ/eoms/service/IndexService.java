package com.situ.eoms.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public interface IndexService {
	boolean doAutoLogin(String empId,String empPassword,HttpSession session,HttpServletRequest request,HttpServletResponse response);
}
