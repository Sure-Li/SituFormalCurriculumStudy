package com.siti.oa.role.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.siti.oa.role.dao.RoleDao;
import com.siti.oa.role.pojo.Role;
import com.siti.oa.util.JDBCUtil;

public class RoleDaoImpl implements RoleDao {

	@Override
	public List<Role> findAll() {
		String sql = "SELECT * FROM TB_ROLE WHERE ACTIVE_FLAG = 1";
		ResultSet rs = JDBCUtil.executeQuery(sql);

		return null;
	}

	@Override
	public Role getRoleFromResultSet(ResultSet rs) {
		Role result = null;
		try {
			result = new Role(rs.getInt("ACTIVE_FLAG"), rs.getString("CREATE_BY"), rs.getDate("CREATE_DATE"),
					rs.getString("UPDATE_BY"), rs.getDate("UPDATE_DATE"), rs.getLong("ROW_ID"), rs.getInt("ROLE_TYPE"),
					rs.getString("ROLE_NAME"), rs.getString("ROLE_INFO"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
