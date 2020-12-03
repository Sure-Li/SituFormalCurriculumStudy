package com.situ.ajaxstudu.service;

import java.util.List;

import com.situ.ajaxstudu.pojo.Clazz;


public interface ClazzService {
	List<Clazz> findAll();
	Integer updateClazz(Clazz clazz);
	Integer addClazz(String clazzName, int classStudentNumber, String clazzInfo);
	Integer delClazz(String delname);
	Integer delClazzByRowId(String rowId);
	Clazz findOne(String rowId);
	Clazz findOneByName(String clazzName);
}
