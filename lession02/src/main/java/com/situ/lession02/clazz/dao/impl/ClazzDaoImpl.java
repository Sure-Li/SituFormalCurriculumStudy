package com.situ.lession02.clazz.dao.impl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.situ.lession02.JDBCUtil;
import com.situ.lession02.clazz.dao.ClazzDao;
import com.situ.lession02.clazz.pojo.Clazz;

public class ClazzDaoImpl implements Serializable, ClazzDao {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Clazz> findAll() {
		List<Clazz> resultList = new ArrayList<Clazz>();
		String sql = "SELECT * FROM TB_CLAZZ";
		ResultSet resultTemp = JDBCUtil.executeQuery(sql);
		try {
			if (resultTemp != null) {
				while (resultTemp.next()) {
					Clazz clazzTemp = getClazzFromResultSet(resultTemp);
					resultList.add(clazzTemp);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return resultList;
	}

	@Override
	public Clazz findOne(String rowId) {
		Clazz result = new Clazz();
		String sql = "SELECT * FROM TB_CLAZZ WHERE ROW_ID = ?";
		ResultSet resultTemp = JDBCUtil.executeQuery(sql,rowId);
		try {
			if (resultTemp != null) {
				while (resultTemp.next()) {
					result = getClazzFromResultSet(resultTemp);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return result;
	}

	@Override
	public Integer update(Clazz clazz) {
		String sql = "UPDATE `test`.`TB_CLAZZ` SET `CLAZZ_NAME` = ? , `CLAZZ_STUDENT_NUMBER` = ? , `CLAZZ_INFO` = ? WHERE `ROW_ID` = ?";
		;
		int resultTemp = JDBCUtil.executeUpdate(sql, clazz.getClazzName(), clazz.getClassStudentNumber(),
				clazz.getClazzInfo(), clazz.getRowId());
		return resultTemp;
	}

	@Override
	public Integer delete(String delname) {
		String sql = "UPDATE FORM `test`.`TB_CLAZZ` WHERE `ROW_ID` = ?";
		int resultTemp = JDBCUtil.executeUpdate(sql, delname);
		return resultTemp;
	}

	@Override
	public Integer add(Clazz clazz) {
		String sql = "INSERT INTO TB_CLAZZ(CLAZZ_NAME,CLAZZ_STUDENT_NUMBER,CLAZZ_INFO) VALUES (?,?,?)";
		return JDBCUtil.executeUpdate(sql, clazz.getClazzName(), clazz.getClassStudentNumber(),clazz.getClazzInfo());
	}
	@Override
	public Clazz getClazzFromResultSet(ResultSet rs) {
		Clazz result = new Clazz();
		try {
			result.setClassStudentNumber(rs.getInt("CLAZZ_STUDENT_NUMBER"));
			result.setClazzInfo(rs.getString("CLAZZ_INFO"));
			result.setClazzName(rs.getString("CLAZZ_NAME"));
			result.setRowId(rs.getLong("ROW_ID"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
