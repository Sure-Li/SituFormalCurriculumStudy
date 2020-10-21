package com.siti.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		System.out.println("这天是否为周末：" + isWeekend(dateInput()));

	}

	public static Date dateInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请按照YYYY—MM—DD的格式输入日期");
		String dateInput = sc.next();
		SimpleDateFormat formater1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date = formater1.parse(dateInput);
		} catch (ParseException e) {
			System.out.println("输入错误，请重新输入");
			System.exit(0);
		}
		sc.close();
		return date;
	}

	public static Boolean isWeekend(Date date) {
		boolean result = false;
		SimpleDateFormat sd = new SimpleDateFormat("E");
		// 用于测试
//		System.out.println(sd.format(date.getTime()));
		if ((sd.format(date.getTime()).equals("星期六")) || (sd.format(date.getTime()).equals("星期日"))) {
			result = true;
		}
		return result;
	}

}
