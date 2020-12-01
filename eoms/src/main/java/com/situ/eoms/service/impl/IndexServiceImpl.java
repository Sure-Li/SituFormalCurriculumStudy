package com.situ.eoms.service.impl;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import com.situ.eoms.dao.EmpDao;
import com.situ.eoms.dao.impl.EmpDaoImpl;
import com.situ.eoms.pojo.Employee;
import com.situ.eoms.service.IndexService;
import com.situ.eoms.util.EmpUtil;

public class IndexServiceImpl implements IndexService {
	EmpDao empDao = new EmpDaoImpl(); 

	@Override
	public boolean doAutoLogin(String empId, String empPassword, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		Object obj =  empDao.EmpFindOne(empId, empPassword);
		if(obj!=null) {
			Employee employee = (Employee) obj;
			StringBuffer cookieValue = new StringBuffer();
			cookieValue.append(employee.getRowId()+"~#~"+employee.getEmpId());
			Cookie cookie = new Cookie(EmpUtil.AUTO_LOGIN_COOKIE_NAME, cookieValue.toString());
			cookie.setMaxAge(60*60*24*7);
			response.addCookie(cookie);
			
		}
		return false;
	}

	@Override
	public int setSession(String cookieValue,HttpServletRequest request) {
		int result =-1;
		String[] cookieValueArray = cookieValue.split("~#~");
		Employee employee = new Employee();
		if (cookieValueArray.length>0) {
			employee = empDao.EmpFindOneForAuto(cookieValueArray[1], cookieValueArray[0]);
			HttpSession session = request.getSession();
			session.setAttribute(EmpUtil.LOGIN_STUDENT, employee);
		}
		return result;
	}


}
