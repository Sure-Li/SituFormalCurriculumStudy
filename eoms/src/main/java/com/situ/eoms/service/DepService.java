package com.situ.eoms.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.situ.eoms.pojo.Department;
import com.situ.eoms.pojo.Employee;

public interface DepService {

	List<Department> findAll();

	int deleteDep(String rowId);


	int add(Department department);

	Department findOne(String rowId);

	int update(Department department);
}
