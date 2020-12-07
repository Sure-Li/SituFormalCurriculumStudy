package com.siti.oa.user.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.siti.oa.user.dao.UserDao;
import com.siti.oa.user.dao.impl.UserDaoImpl;
import com.siti.oa.user.pojo.User;
import com.siti.oa.user.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findOneByName(String userName) {
		return userDao.findOneByName(userName);
	}

	@Override
	public User findOne(String rowId) {
		return userDao.findOne(rowId);
	}



	@Override
	public Integer delUserByRowId(String rowId) {
		return userDao.delUserByRowId(rowId);
	}

	@Override
	public List<String> findAllRole() {
		return userDao.findAllRole();
	}

	@Override
	public Integer addUser(String userName, String userId, String userPassword, String userPhoto, String userLoginCount,
			String userLastLoginTime, String userLastLoginIp, String userLock) {
		return userDao.addUser(userName,userId,userPassword,userPhoto,userLoginCount,
				userLastLoginTime,  userLastLoginIp,  userLock);
	}


	@Override
	public User userFindOne(String userId, String userPassword) {
		return userDao.userFindOne(userId,userPassword);
	}

	@Override
	public Integer userLogin(String userId, String userPassword, HttpSession session) {
		User user = null;
		user = userDao.userFindOne(userId, userPassword);
		if (user == null) {
			if (userDao.findOne(userId) == null) {
//				账号或者密码不正确
				return 2;
			} else {
//				密码不正确
				return 3;
			}

		} else {
			session.setAttribute("LoginUser", user);
			return 1;
		}
	}

	@Override
	public Integer updateUser(String parameter, String parameter2, String parameter3, String parameter4, String parameter5,
			String parameter6, String parameter7, String parameter8, long parseLong) {
		return  userDao.updateUser( parameter,  parameter2,  parameter3,  parameter4,  parameter5,
				 parameter6,  parameter7,  parameter8,  parseLong);
	}

}
