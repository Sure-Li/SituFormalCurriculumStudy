package com.siti.oa.user.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.siti.oa.user.pojo.User;

public interface UserService {

	List<User> findAll();

	User findOneByName(String userName);

	User findOne(String rowId);


	Integer delUserByRowId(String parameter);

	List<String> findAllRole();

	Integer addUser(String userName, String userId, String userPassword, String userPhoto, String userLoginCount,
			String userLastLoginTime, String userLastLoginIp, String userLock);


	User userFindOne(String userId, String userPassword);


	Integer userLogin(String userId, String userPassword, HttpSession session);

	Integer updateUser(String parameter, String parameter2, String parameter3, String parameter4, String parameter5,
			String parameter6, String parameter7, String parameter8, long parseLong);

}
