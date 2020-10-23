package com.situ.lession11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
//		list有序 list唯一标识一个数据用的是下表加数据 下标不会重复 所以表面来看会重复
//		set无序 没有下标导致无法唯一标识一个数据靠数据本身 所以表面来看不会重复
		List<String> ListTest = new ArrayList<String>();
		ListTest.add("aaa");
		ListTest.add("bbb");
		ListTest.add("ccc");
		ListTest.add("ddd");
		ListTest.add("ddd");
		System.out.println(ListTest);
		Set<String> setTest = new HashSet<String>();
		setTest.add("aaa");
		setTest.add("bbb");
		setTest.add("ccc");
		setTest.add("ddd");
		setTest.add("ddd");
		setTest.add("ccc");
		System.out.println(setTest);
	}

}
