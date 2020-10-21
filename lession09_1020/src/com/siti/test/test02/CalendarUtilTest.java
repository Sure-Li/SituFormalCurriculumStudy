package com.siti.test.test02;

import java.util.Calendar;
import java.util.Date;

public class CalendarUtilTest {
	static Date date = new Date();
	static Calendar calendar = Calendar.getInstance();

	public static void main(String[] args) {
		System.out.println(CalendarUtil.getShortDate());
		System.out.println(CalendarUtil.getLongDate());
		System.out.println(CalendarUtil.getShortDate(date));
		System.out.println(CalendarUtil.getLongDate(date));
		System.out.println(CalendarUtil.getShortDate(calendar));
		System.out.println(CalendarUtil.getLongDate(calendar));
	}

}
