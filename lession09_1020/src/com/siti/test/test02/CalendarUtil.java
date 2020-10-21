package com.siti.test.test02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {
	public static String getShortDate() {
		return Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1) + "-"
				+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	}

	public static String getShortDate(Date date) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		return sd.format(date);
	}

	public static String getShortDate(Calendar calendar) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		return sd.format(calendar.getTime());
	}

	public static String getLongDate() {
		return Calendar.getInstance().get(Calendar.YEAR) + "-" + (Calendar.getInstance().get(Calendar.MONTH) + 1) + "-"
				+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + " "
				+ (Calendar.getInstance().get(Calendar.HOUR) > 10 ? "" + Calendar.getInstance().get(Calendar.HOUR)
						: ("0" + Calendar.getInstance().get(Calendar.HOUR)))
				+ ":" + Calendar.getInstance().get(Calendar.MINUTE) + ":" + Calendar.getInstance().get(Calendar.SECOND);
	}

	public static String getLongDate(Date date) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sd.format(date);
	}

	public static String getLongDate(Calendar calendar) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sd.format(calendar.getTime());
	}
}
