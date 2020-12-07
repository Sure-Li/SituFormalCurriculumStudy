package com.siti.oa.user.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.siti.oa.user.dao.UserDao;
import com.siti.oa.user.pojo.User;
import com.siti.oa.util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> findAll() {
		List<User> result = new ArrayList<User>();
		String sql = "SELECT * FROM TB_User WHERE ACTIVE_FLAG = 1";
		ResultSet rs = JDBCUtil.executeQuery(sql);
		System.out.println(rs);
		try {
			while (rs.next()) {
				result.add(getUserFromResultSet(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	private User getUserFromResultSet(ResultSet rs) {
		User result = null;
		try {
			result = new User(rs.getInt("ACTIVE_FLAG"), rs.getString("CREATE_BY"),rs.getDate("CREATE_DATE"), rs.getString("UPDATE_BY"), rs.getDate("UPDATE_DATE"), rs.getLong("ROW_ID"), rs.getString("USER_NAME"), Long.parseLong(rs.getString("USER_ID")), rs.getString("USER_PHOTO"), rs.getInt("USER_LOGIN_COUNT"), rs.getDate("USER_LAST_LOGIN_TIME"), rs.getString("USER_LAST_LOGIN_IP"), rs.getInt("USER_LOCK"));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<String> findAllRole() {
		List<String> result = new ArrayList<String>();
		String sql = "SELECT ROLE_NAME FROM TB_ROLE WHERE ACTIVE_FLAG = 1";
		ResultSet rs = JDBCUtil.executeQuery(sql);
		System.out.println(rs);
		try {
			while (rs.next()) {
				result.add(rs.getString("ROLE_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Integer addUser(String userName, String userId, String userPassword, String userPhoto, String userLoginCount,
			String userLastLoginTime, String userLastLoginIp, String userLock) {
		String sql = "INSERT INTO `test`.`TB_USER` (`USER_NAME`, `USER_ID`, `USER_PASSWORD`,`USER_PHOTO`, `USER_LOGIN_COUNT`, `USER_LAST_LOGIN_TIME`, `USER_LAST_LOGIN_IP`, `USER_LOCK`, `ACTIVE_FLAG`, `CREATE_BY`, `CREATE_DATE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?) ";
		return JDBCUtil.executeUpdate(sql, userName,userId,userPassword,userPhoto,userLoginCount,
				userLastLoginTime,  userLastLoginIp,  userLock,1,"li",new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
	}

	@Override
	public Integer delUserByRowId(String rowId) {
		String sql = "UPDATE `test`.`TB_USER` SET `ACTIVE_FLAG` = '0' WHERE `ROW_ID` = ?"; 
		return JDBCUtil.executeUpdate(sql, rowId);
	}

	@Override
	public User findOne(String rowId) {
		User result = null;
		String sql = "SELECT * FROM TB_User WHERE ACTIVE_FLAG = 1 AND ROW_ID = ?";
		ResultSet rs = JDBCUtil.executeQuery(sql,rowId);
		System.out.println(rs);
		try {
			while (rs.next()) {
				result = getUserFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	@Override
	public User userFindOne(String userId, String userPassword) {
		User result = null;
		String sql = "SELECT * FROM TB_User WHERE ACTIVE_FLAG = 1 AND USER_ID = ? AND USER_PASSWORD = ?";
		ResultSet rs = JDBCUtil.executeQuery(sql,userId,userPassword);
		System.out.println(rs);
		try {
			while (rs.next()) {
				result = getUserFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public User findOneByName(String userName) {
		User result = null;
		String sql = "SELECT * FROM TB_User WHERE ACTIVE_FLAG = 1 AND USER_NAME = ? ";
		ResultSet rs = JDBCUtil.executeQuery(sql,userName);
		System.out.println(rs);
		try {
			while (rs.next()) {
				result = getUserFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Integer updateUser(String parameter, String parameter2, String parameter3, String parameter4,
			String parameter5, String parameter6, String parameter7, String parameter8, long parseLong) {
		String sql = "UPDATE `test`.`TB_USER` SET `USER_NAME` = ? , `USER_ID` = ? , `USER_PASSWORD` = ? , `USER_PHOTO` = ? , `USER_LOGIN_COUNT` = ? , `USER_LAST_LOGIN_TIME` = ? , `USER_LAST_LOGIN_IP` = ? , `USER_LOCK` = ? , `UPDATE_BY` = ? , `UPDATE_DATE` = ? WHERE `ROW_ID` = ?; ";
		return JDBCUtil.executeUpdate(sql, parameter,  parameter2,  parameter3,  parameter4,  parameter5,
				 parameter6,  parameter7,  parameter8,  parseLong);
	}

}
