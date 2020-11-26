package com.situ.lession02.clazz.servic;

import java.util.List;

import com.situ.lession02.clazz.pojo.Clazz;

public interface ClazzService {
	List<Clazz> findAll();
	Integer updateClazz(Clazz clazz);
	Integer addClazz(String clazzName, int classStudentNumber, String clazzInfo);
	Integer delClazz(String delname);
	Clazz findOne(String rowId);
}
