package com.siti.oa.role.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.siti.oa.role.dao.RoleDao;
import com.siti.oa.role.pojo.Role;
import com.siti.oa.util.JDBCUtil;

public class RoleDaoImpl implements RoleDao {

	@Override
	public List<Role> findAll() {
		List<Role> result = new ArrayList<Role>();
		String sql = "SELECT * FROM TB_ROLE WHERE ACTIVE_FLAG = 1";
		ResultSet rs = JDBCUtil.executeQuery(sql);
		System.out.println(rs);
		try {
			while (rs.next()) {
				result.add(getRoleFromResultSet(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Role getRoleFromResultSet(ResultSet rs) {
		Role result = null;
		try {
			result = new Role(rs.getInt("ACTIVE_FLAG"), rs.getString("CREATE_BY"), rs.getDate("CREATE_DATE"),
					rs.getString("UPDATE_BY"), rs.getDate("UPDATE_DATE"), rs.getLong("ROW_ID"), rs.getInt("ROLE_TYPE"),
					rs.getString("ROLE_NAME"), rs.getString("ROLE_INFO"));
			/* result = new */
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Integer addRole(int roleType, String roleName, String roleInfo) {
		String nowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String sql = "INSERT INTO `test`.`TB_ROLE` (`ROLE_TYPE`, `ROLE_NAME`, `ROLE_INFO`, `ACTIVE_FLAG`, `CREATE_BY`, `CREATE_DATE`, `UPDATE_BY`, `UPDATE_DATE`) VALUES (?, ?,?, ?, ?, ?, ?, ?) ";
		return JDBCUtil.executeUpdate(sql, roleType, roleName, roleInfo, 1, "li", nowDate, null, null);
	}

	@Override
	public Role findOneById(String rowId) {
		Role result = null;
		String sql = "SELECT * FROM TB_ROLE WHERE ACTIVE_FLAG = 1 AND ROW_ID = ?";
		ResultSet rs = JDBCUtil.executeQuery(sql, rowId);
		try {
			while (rs.next()) {
				result = getRoleFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Integer updateRole(int roletype, String roleName, String roleInfo, long rowId) {
		String nowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
		String sql = "UPDATE `test`.`TB_ROLE` SET `ROLE_TYPE` = ? , `ROLE_NAME` = ? , `ROLE_INFO` = ? , `UPDATE_BY` = ? , `UPDATE_DATE` = ? WHERE `ROW_ID` = ?";
		return JDBCUtil.executeUpdate(sql, roletype, roleName, roleInfo, "li", nowDate, rowId);
	}

	@Override
	public Integer deleteByRowId(String rowId) {
		String sql = "UPDATE `test`.`TB_ROLE` SET `ACTIVE_FLAG` = '0' WHERE `ROW_ID` = ? ";
		return JDBCUtil.executeUpdate(sql, Long.parseLong(rowId));

	}

}
