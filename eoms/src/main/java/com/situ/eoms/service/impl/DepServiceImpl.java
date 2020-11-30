package com.situ.eoms.service.impl;

import java.util.List;


import com.situ.eoms.dao.DepDao;
import com.situ.eoms.dao.impl.DepDaoImpl;
import com.situ.eoms.pojo.Department;
import com.situ.eoms.pojo.Employee;
import com.situ.eoms.service.DepService;

public class DepServiceImpl implements DepService {
	DepDao depDao = new DepDaoImpl();


	@Override
	public List<Department> findAll() {
		
		return depDao.FindAll();
	}



	@Override
	public int add(Department department) {
		
		return depDao.DepAdd(department);
	}

	@Override
	public Department findOne(String rowId) {
		return depDao.FindOne(rowId);
	}

	@Override
	public int update(Department department) {
		return depDao.DepUpdate(department);
	}

	@Override
	public int deleteDep(String rowId) {
		int result = -1;
		result = depDao.DepDelete(rowId);
		return result;
	}

}
