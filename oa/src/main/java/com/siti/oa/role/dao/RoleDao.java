package com.siti.oa.role.dao;

import java.sql.ResultSet;
import java.util.List;

import com.siti.oa.role.pojo.Role;

public interface RoleDao {

	List<Role> findAll();
	Role getRoleFromResultSet(ResultSet rs);

}
