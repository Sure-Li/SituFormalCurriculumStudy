package com.situ.eoms.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.situ.eoms.pojo.Employee;

public interface EmpService {
	int empLogin(String empId, String empPassword, HttpSession session);

	List<Employee> findAll();

	int deleteEmp(String rowId);

	StringBuffer beforeAdd();

	int add(Employee employee);

	Employee findOne(String rowId);

	int update(Employee employee);
}
