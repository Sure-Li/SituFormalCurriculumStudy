package com.situ.lession12;

public class MapDaoTest extends MapDao<String, String> {
	public static void main(String[] args) {
		new MapDao<String, String>("wang", "haha").getK();
		System.out.println(new MapDao<String, String>("wang", "haha").getK().isEmpty());
		System.out.println(new MapDao<String, String>("wang", "haha").getV());
		show(new MapDao<Object, Object>());
	}

	public static <T> void show(T t) {
//		根据传入的数据,取得其Class对象。
//		Class, java对 .class文件抽象后生成的一个类。

		Class<?> clazz = t.getClass();
		System.out.println(clazz);
	}

}
