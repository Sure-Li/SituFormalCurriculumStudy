package com.siti.oa.role.service.impl;

import java.util.List;

import com.siti.oa.role.dao.RoleDao;
import com.siti.oa.role.dao.impl.RoleDaoImpl;
import com.siti.oa.role.pojo.Role;
import com.siti.oa.role.service.RoleService;

public class RoleServiceImpl implements RoleService {
	RoleDao roleDao = new RoleDaoImpl();
	@Override
	public List<Role> findAll() {
		return roleDao.findAll();
	}

	@Override
	public Role findOneByName(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role findOne(String rowId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addRole(int roletype, String roleName, String roleInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delRoleByRowId(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

}
