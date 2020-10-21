package com.siti.lession09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataTest {

	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(Calendar.getInstance());
//		System.out.println(date.toGMTString());
//		System.out.println("___________");
//		Calendar ca = Calendar.getInstance();
//		System.out.println(Calendar.YEAR + "-" + Calendar.MONTH + "-" + Calendar.DAY_OF_MONTH);
//		System.out.println(ca.get(1) + "-" + (ca.get(2) + 1) + "-" + ca.get(5));
//
//		Calendar calendat = Calendar.getInstance();
//		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-SSS");// 详细请看api说明
//
//		System.out.println(sd.format(calendat.getTime()));
//		// 将字符串格式的日期,转成 Date或 Calendar
//		String strDateTime = "2020-10-20 16:30:08";
//		SimpleDateFormat formater1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		try {
//			Date date1 = formater1.parse(strDateTime);
////			System.out.println(ca.after(date1));
//			System.out.println(date1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Date date1 = new Date();
		Date date2 = new Date();
		date2.setHours(14);
		System.out.println(date1.after(date2));
		System.out.println(date1.getDay() - date2.getDay());
	}

}
