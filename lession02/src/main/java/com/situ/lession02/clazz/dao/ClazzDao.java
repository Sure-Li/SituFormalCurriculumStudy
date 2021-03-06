package com.situ.lession02.clazz.dao;

//import java.sql.ResultSet;
import java.util.List;

import com.situ.lession02.clazz.pojo.Clazz;

public interface ClazzDao {
	public List<Clazz> findAll();
	public Clazz findOne(long rowId);
//	public Clazz getClazzFromResultSet(ResultSet rs);
	public Integer update(Clazz clazz);
	Integer delete(String delName);
	int add(Clazz clazz);
}
