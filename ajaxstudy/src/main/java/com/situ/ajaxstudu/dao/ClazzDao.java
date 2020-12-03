package com.situ.ajaxstudu.dao;

import java.sql.ResultSet;
import java.util.List;

import com.situ.ajaxstudu.pojo.Clazz;


public interface ClazzDao {
	public List<Clazz> findAll();
	public Clazz findOne(String rowId);
	public Clazz getClazzFromResultSet(ResultSet rs);
	public Integer update(Clazz clazz);
	public Integer delete(String delname);
	public Integer add(Clazz clazz);
}
