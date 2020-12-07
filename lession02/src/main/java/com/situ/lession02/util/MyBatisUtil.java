package com.situ.lession02.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory sqlSessionFactory;
	//在静态块里面进行赋值
	static{
		String resource = "mybatis/MyBatisConfig.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	public static SqlSession getSqlSession() {
		//得到一个自动提交的实例
		return sqlSessionFactory.openSession(true);
	} 
	public static <T>T getDao(Class<T> type) {
		//得到一个可以自动commit的SqlSession实例
		SqlSession session = sqlSessionFactory.openSession(true);
		return session.getMapper(type);
		}
 
}
