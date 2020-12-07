package com.siti.oa.test;

import java.util.Calendar;

import com.siti.oa.role.pojo.Role;
import com.siti.oa.user.pojo.User;

public class MainTest {

	public static void main(String[] args) {
		User user1 = new User(12, "li", Calendar.getInstance().getTime(), "li", Calendar.getInstance().getTime(), 1L, "test", 1L, "photo", 12, Calendar.getInstance().getTime(), "122121:!2", 1);
		System.out.println(user1);
		Role role1 = new Role(1, "li", Calendar.getInstance().getTime(), "li", Calendar.getInstance().getTime(), 1L, 1, "test", "this is test");
		System.out.println(role1.toString());
	}

}
