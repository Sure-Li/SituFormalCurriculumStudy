package com.situ.eoms.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.situ.eoms.dao.EmpDao;
import com.situ.eoms.dao.impl.EmpDaoImpl;
import com.situ.eoms.pojo.Employee;
import com.situ.eoms.service.EmpService;
import com.situ.eoms.util.EmpUtil;
import com.situ.eoms.util.JDBCUtil;

public class EmpServiceImpl implements EmpService {
	EmpDao empdao = new EmpDaoImpl();

	/**
	 * 完成员工登录
	 */
	@Override
	public int empLogin(String empId, String empPassword, HttpSession session) {
		Employee employee = null;
		employee = empdao.EmpFindOne(empId, empPassword);
		if (employee == null) {
			if (empdao.EmpFindOne(empId) == null) {
//				账号或者密码不正确
				return EmpUtil.PASSWORD_OTHER_ERROR;
			} else {
//				密码不正确
				return EmpUtil.PASSWORD_WRONG;
			}

		} else {
			session.setAttribute(EmpUtil.LOGIN_STUDENT, employee);
			return EmpUtil.PASSWORD_RIGHT;
		}
	}

	@Override
	public List<Employee> findAll() {
		
		return empdao.EmpFindAll();
	}

	@Override
	public int deleteEmp(String rowId) {
		int result = -1;
		result = empdao.EmpDelete(rowId);
		return result;
	}

	@Override
	public StringBuffer beforeAdd() {
		return empdao.beforAdd();
	}

	@Override
	public int add(Employee employee) {
		
		return empdao.EmpAdd(employee);
	}

	@Override
	public Employee findOne(String rowId) {
		return empdao.EmpFindOne(rowId);
	}

	@Override
	public int update(Employee employee) {
		return empdao.EmpUpdate(employee);
	}

}
