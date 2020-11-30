package com.situ.eoms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.situ.eoms.dao.EmpDao;
import com.situ.eoms.pojo.Employee;
import com.situ.eoms.util.JDBCUtil;

public class EmpDaoImpl implements EmpDao {

	@Override
	public int EmpAdd(Employee employee) {
		int result = -1;
		String sql = "INSERT INTO `test`.`TB_EMPLOYEE` (`EMP_DEP_ID`, `EMP_ID`, `EMP_PASSWORD`, `EMP_NAME`, `EMP_JOINTIME`, `EMP_LEVEL`, `ACTIVE_FLAG`, `CREATE_BY`, `CREATE_DATE`, `UPDATE_BY`, `UPDATE_DATE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		result = JDBCUtil.executeUpdate(sql, employee.getEmpDepId(), employee.getEmpId(), employee.getEmpPassword(),
				employee.getEmpName(), employee.getEmpJoinTime(), employee.getEmpLevel(), employee.getActiveFlag(),
				employee.getCreateBy(), employee.getCreateDate(), employee.getUpdateBy(), employee.getUpdateDate());
		return result;
	}

	@Override
	public int EmpDelete(String empId) {
		int result = -1;
		String sql = "UPDATE `test`.`TB_EMPLOYEE` SET `ACTIVE_FLAG` = '0' WHERE `ROW_ID` = ? ";
		result = JDBCUtil.executeUpdate(sql, empId);
		return result;
	}

	@Override
	public int EmpUpdate(Employee employee) {
		int result = -1;
		String sql = "UPDATE `test`.`TB_EMPLOYEE` SET `EMP_ID` = ? ,`EMP_PASSWORD` = ? , `EMP_NAME` = ? , `EMP_JOINTIME` = ? , `EMP_LEVEL` = ? , `UPDATE_BY` = ? , `UPDATE_DATE` = ? WHERE `ROW_ID` = ? ";
		result = JDBCUtil.executeUpdate(sql, employee.getEmpId(),employee.getEmpPassword(),employee.getEmpName(),employee.getEmpJoinTime(),employee.getEmpLevel(),employee.getUpdateBy(),employee.getUpdateDate(),employee.getRowId());
		return result;
	}

	@Override
	public Employee EmpFindOne(String empId) {
		String sql = "SELECT ROW_ID,EMP_DEP_ID,EMP_ID,EMP_PASSWORD,EMP_NAME,EMP_JOINTIME,EMP_LEVEL,ACTIVE_FLAG,CREATE_BY,CREATE_DATE,UPDATE_BY,UPDATE_DATE FROM TB_EMPLOYEE WHERE ROW_ID = ? ";
		Employee em = getEmployeeFromResultSet(JDBCUtil.executeQuery(sql, empId));
		System.out.println("zzzzzzzzzzzzz"+em);
		return em;
	}

	@Override
	public List<Employee> EmpFindAll() {
		List<Employee> resultList = new ArrayList<Employee>();
		String sql = "SELECT * FROM TB_EMPLOYEE WHERE ACTIVE_FLAG = 1";
		ResultSet resultTemp = JDBCUtil.executeQuery(sql);
		try {

			while (resultTemp.next()) {
				Employee employeeTemp = new Employee(resultTemp.getLong("ROW_ID"), resultTemp.getLong("EMP_DEP_ID"),
						resultTemp.getLong("EMP_ID"), resultTemp.getString("EMP_PASSWORD"),
						resultTemp.getString("EMP_NAME"), resultTemp.getDate("EMP_JOINTIME"),
						resultTemp.getInt("EMP_LEVEL"), resultTemp.getInt("ACTIVE_FLAG"),
						resultTemp.getString("CREATE_BY"), resultTemp.getDate("CREATE_Date"),
						resultTemp.getString("UPDATE_BY"), resultTemp.getDate("UPDATE_DATE"));
				resultList.add(employeeTemp);
			}
		} catch (Exception e) {
		}
		System.out.println("_____________" + resultList);
		return resultList;
	}

	@Override
	public Employee EmpFindOne(String empId, String empPassword) {
		String sql = "SELECT ROW_ID,EMP_DEP_ID,EMP_ID,EMP_PASSWORD,EMP_NAME,EMP_JOINTIME,EMP_LEVEL,ACTIVE_FLAG,CREATE_BY,CREATE_DATE,UPDATE_BY,UPDATE_DATE FROM TB_EMPLOYEE WHERE EMP_ID = ? AND EMP_PASSWORD= ? ";
		return getEmployeeFromResultSet(JDBCUtil.executeQuery(sql, empId, empPassword));
	}

	public Employee getEmployeeFromResultSet(ResultSet rs) {
		Employee result = null;
		try {
			while (rs.next()) {
				result = new Employee(rs.getLong("ROW_ID"), rs.getLong("EMP_DEP_ID"), rs.getLong("EMP_ID"),
						rs.getString("EMP_PASSWORD"), rs.getString("EMP_NAME"), rs.getDate("EMP_JOINTIME"),
						rs.getInt("EMP_LEVEL"), rs.getInt("ACTIVE_FLAG"), rs.getString("CREATE_BY"),
						rs.getDate("CREATE_Date"), rs.getString("UPDATE_BY"), rs.getDate("UPDATE_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public StringBuffer beforAdd() {
		StringBuffer resultString = new StringBuffer();
		String sql = "SELECT EMP_DEP_ID FROM TB_EMPLOYEE";
		ResultSet studentClazzIdSet = JDBCUtil.executeQuery(sql);
		try {
			while (studentClazzIdSet.next()) {
				resultString.append(studentClazzIdSet.getLong("EMP_DEP_ID")).append(",");
			}
			System.out.println(resultString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultString;
	}

}
