package com.situ.filemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	public static ResultSet executeQuery(String sql, Object... args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		conn = getConnection();

		try {
			ps = conn.prepareStatement(sql);
			if (args.length > 0) {
				int parameterIndex = 1;
				for (Object object : args) {
					ps.setObject(parameterIndex, object);
					parameterIndex++;
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rs;

	}

	public static int executeUpdate(String sql, Object... args) {
		int result = -1;
		Connection conn = getConnection();
		PreparedStatement ps = null;
		if (conn != null) {

			try {
				ps = conn.prepareStatement(sql);
				if (args.length > 0) {
					int parameterIndex = 1;
					for (Object object : args) {
						ps.setObject(parameterIndex, object);
						parameterIndex++;
					}
					result = ps.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		}
		return result;
	}

	public static Connection getConnection() {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8&characterEncoding=UTF-8&useSSL=true&allowMultiQueries=true",
					"root", "123456");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(conn);
		return conn;

	}
}
