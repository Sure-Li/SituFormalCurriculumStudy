package com.situ.eoms.dao;

import java.sql.ResultSet;
import java.util.List;

import com.situ.eoms.pojo.Department;
import com.situ.eoms.pojo.Employee;

public interface EmpDao {
	int EmpAdd(Employee employee);
	int EmpDelete(String empId);
	int EmpUpdate(Employee employee);
	Employee EmpFindOne(String empId);
	Employee EmpFindOne(String empId,String empPassword);
	Employee EmpFindOneForAuto(String empId,String rowId);
	List<Employee> EmpFindAll();
	Employee getEmployeeFromResultSet(ResultSet rs);
	StringBuffer beforAdd();
}
