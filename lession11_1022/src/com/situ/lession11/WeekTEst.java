package com.situ.lession11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WeekTEst {

	public static void main(String[] args) {
//		Map<Integer, String> week = new HashMap<Integer, String>();
		// 可以按照某种顺序
		// Map是无序的 key不允许重复
		Map<Integer, String> week = new LinkedHashMap<Integer, String>();
		week.put(0, "周日");
		week.put(1, "周一");
		week.put(2, "周二");
		week.put(3, "周三");
		week.put(4, "周四");
		week.put(5, "周五");
		week.put(6, "周六");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入0-6");
		System.out.println(week.get(sc.nextInt()));
		Set<Integer> sets = week.keySet();
		System.out.println(week.entrySet());
		for (Integer integer : sets) {
			System.out.println(week.get(integer));
		}
		sc.close();
	}

}
