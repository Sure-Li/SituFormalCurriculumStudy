package com.siti.oa.role.service;

import java.util.List;

import com.siti.oa.role.pojo.Role;

public interface RoleService {

	List<Role> findAll();

	Role findOneByName(String roleName);

	Role findOne(String rowId);

	Integer addRole(int  roletype, String  roleName, String roleInfo);

	Integer delRoleByRowId(String parameter);

}
