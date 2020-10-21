package com.situ.lession10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class TestList {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(1);
//		System.out.println(list);
//		method();
	}

	@Test
	public void method() {

		// array-->list
		System.out.println("array-->list");
		Integer[] b = { 1, 2, 3, 4 };
		List<Integer> listArray = Arrays.asList(b);
		System.out.println(listArray);

		// list ->array
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 30; i++) {
			list.add(new Random().nextInt(100));
		}
		System.out.println("list ->array");
		Integer[] a = new Integer[list.size()];
		System.out.println(Arrays.toString(list.toArray(a)));
		System.out.println("+++++++++++");

//		这样遍历也可以
//		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();){
		System.out.println("遍历");
		java.util.Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			// 迭代器如何变化都不会影响几何
			if (it.next() % 2 == 0) {
				it.remove();
			}
		}

		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
				i--;
			}
		}

		// 遍历比大小
		System.out.println("遍历比大小");
		Integer max = list.get(0);
		Integer min = list.get(0);
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				list.remove(integer);
				continue;
			}
			if (integer > max) {
				max = integer;
			}
			if (integer < min) {
				min = integer;
			}
		}
		System.out.println(list);
		System.out.println("MAX:" + max + "\tMIN:" + min);

	}
}
