package com.siti.oa.user.dao;

import java.util.List;

import com.siti.oa.user.pojo.User;

public interface UserDao {

	List<User> findAll();

	List<String> findAllRole();

	Integer addUser(String userName, String userId, String userPassword, String userPhoto, String userLoginCount,
			String userLastLoginTime, String userLastLoginIp, String userLock);

	Integer delUserByRowId(String rowId);

	User findOne(String rowId);


	User userFindOne(String userId, String userPassword);

	User findOneByName(String userName);

	Integer updateUser(String parameter, String parameter2, String parameter3, String parameter4, String parameter5,
			String parameter6, String parameter7, String parameter8, long parseLong);

}
