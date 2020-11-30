package com.situ.eoms.dao;

import java.sql.ResultSet;
import java.util.List;

import com.situ.eoms.pojo.Department;
import com.situ.eoms.pojo.Employee;

public interface DepDao {
	int DepAdd(Department department);
	int DepDelete(String empId);
	int DepUpdate(Department department);
	Department FindOne(String empId);
	List<Department> FindAll();
	Department getDepartmentFromResultSet(ResultSet rs);
}
