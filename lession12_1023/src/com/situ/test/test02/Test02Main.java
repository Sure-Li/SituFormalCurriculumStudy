package com.situ.test.test02;

import java.util.ArrayList;
import java.util.List;

public class Test02Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		new Test02<List>().testGetClass(list);
//		反编译结果
//		List list = new ArrayList();
//		new Test02().testGetClass(list);
	}

}
