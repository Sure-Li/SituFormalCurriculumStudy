package com.situ.eoms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.situ.eoms.dao.DepDao;
import com.situ.eoms.dao.EmpDao;
import com.situ.eoms.pojo.Department;
import com.situ.eoms.pojo.Employee;
import com.situ.eoms.util.JDBCUtil;

public class DepDaoImpl implements DepDao {


	@Override
	public int DepDelete(String depId) {
		int result = -1;
		String sql = "UPDATE `test`.`TB_DEPARTMENT` SET `ACTIVE_FLAG` = '0' WHERE `ROW_ID` = ? ";
		result = JDBCUtil.executeUpdate(sql, depId);
		return result;
	}

	@Override
	public int DepUpdate(Department department) {
		int result = -1;
		String sql = "UPDATE `test`.`TB_DEPARTMENT` SET `DEP_ID` = ? , `DEP_NAME` = ? , `DEP_INFO` = ? , `UPDATE_BY` = ? , `UPDATE_DATE` = ? WHERE `ROW_ID` = ?  ";
		result = JDBCUtil.executeUpdate(sql, department.getDepId(),department.getDepName(), department.getDepInfo(),"li", Calendar.getInstance().getTime(),department.getRowId());
		System.out.println("rrrrrrrrrrrrrrrrrrrrrr"+result+"-----"+department.getRowId());
		return result;
	}

	@Override
	public Department FindOne(String empId) {
		String sql = "SELECT ROW_ID,DEP_ID,DEP_NAME,DEP_EMP_NUM,DEP_INFO,ACTIVE_FLAG,CREATE_BY,CREATE_DATE,UPDATE_BY,UPDATE_DATE FROM TB_DEPARTMENT WHERE ROW_ID = ? ";
		Department em = getDepartmentFromResultSet(JDBCUtil.executeQuery(sql, empId));
		System.out.println("zzzzzzzzzzzzz" + em);
		return em;
	}

	@Override
	public List<Department> FindAll() {
		List<Department> resultList = new ArrayList<Department>();
		String sql = "SELECT * FROM TB_DEPARTMENT WHERE ACTIVE_FLAG = 1";
		ResultSet resultTemp = JDBCUtil.executeQuery(sql);
		try {

			while (resultTemp.next()) {
				Department employeeTemp = new Department(resultTemp.getLong("ROW_ID"),resultTemp.getLong("DEP_ID"), resultTemp.getString("DEP_NAME"), resultTemp.getInt("DEP_EMP_NUM"), resultTemp.getString("DEP_INFO"), resultTemp.getInt("ACTIVE_FLAG"), resultTemp.getString("CREATE_BY"), resultTemp.getDate("CREATE_DATE"), resultTemp.getString("UPDATE_BY"), resultTemp.getDate("UPDATE_DATE"));
				resultList.add(employeeTemp);
			}
		} catch (Exception e) {
		}
		System.out.println("_____________" + resultList);
		return resultList;
	}


	public Department getDepartmentFromResultSet(ResultSet rs) {
		Department result = null;
		try {
			while (rs.next()) {
				result = new Department(rs.getLong("ROW_ID"), rs.getLong("DEP_ID"), rs.getString("DEP_NAME"), rs.getInt("DEP_EMP_NUM"), rs.getString("DEP_INFO"), rs.getInt("ACTIVE_FLAG"), rs.getString("CREATE_BY"), rs.getDate("CREATE_DATE"), rs.getString("UPDATE_BY"), rs.getDate("UPDATE_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int DepAdd(Department department) {
		int result = -1;
		String sql = "INSERT INTO `test`.`TB_DEPARTMENT` (`DEP_ID`, `DEP_NAME`, `DEP_EMP_NUM`,`DEP_INFO`, `ACTIVE_FLAG`, `CREATE_BY`, `CREATE_DATE`, `UPDATE_BY`, `UPDATE_DATE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?); ";
		result = JDBCUtil.executeUpdate(sql,department.getDepId(),department.getDepName(),department.getDepEmpNumber(),department.getDepInfo(),department.getActiveFlag(),department.getCreateBy(),department.getCreateDate(),department.getUpdateBy(),department.getUpdateDate());
		return result;
	}


}
