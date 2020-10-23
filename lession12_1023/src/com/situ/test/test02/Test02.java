package com.situ.test.test02;

import java.util.Collection;

public class Test02<T extends Collection<?>> {
	
	public void testGetClass(T t) {
		Class clzz = t.getClass();
		System.out.println(clzz);
	}
}
