package com.situ.ajaxstudu.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.situ.ajaxstudu.dao.ClazzDao;
import com.situ.ajaxstudu.dao.impl.ClazzDaoImpl;
import com.situ.ajaxstudu.pojo.Clazz;
import com.situ.ajaxstudu.service.ClazzService;


public class ClazzServiceImple implements ClazzService, Serializable {
	private static final long serialVersionUID = 1L;
	ClazzDao clazzDao = new ClazzDaoImpl();
	@Override
	public List<Clazz> findAll() {
		List<Clazz> result =new ArrayList<Clazz>();
		result = clazzDao.findAll();
		return result;
	}
	@Override
	public Clazz findOne(String rowId) {
		Clazz result =null;
		result = clazzDao.findOne(rowId);
		return result;
	}
	@Override
	public Integer addClazz(String clazzName, int classStudentNumber, String clazzInfo) {
		Clazz clazzTemp = new Clazz(clazzName, classStudentNumber, clazzInfo);
		int result = clazzDao.add(clazzTemp);
		return result;
	}
	@Override
	public Integer delClazz(String delname) {
		return clazzDao.delete(delname) ;
	}
	@Override
	public Integer updateClazz(Clazz clazz) {
		int result = clazzDao.update(clazz);
		return result;
	}
	
	
}
