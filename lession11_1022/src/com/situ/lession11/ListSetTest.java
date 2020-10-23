package com.situ.lession11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListSetTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(new Random().nextInt(10));
		}
		System.out.println(list);
		System.out.println(Collections.synchronizedCollection(list).getClass());
		Set<Integer> set = new LinkedHashSet<Integer>(list);// 可以保持原来的顺序关系
//		Set<Integer> set = new HashSet<Integer>(list);//不会保持原来的顺序关系
//		set仍然是无序
		System.out.println(set);
		List<Integer> list1 = new ArrayList<Integer>(set);
		System.out.println(list1);
	}

}
