package com.situ.lession12;

public class SeasonUtil {
	public static String seasonCheck(SeasonEnum season) {
		String seasonInfo = "";
		if (season.equals(SeasonEnum.SPRING)) {
			System.out.println("SPRING");
		}
		switch (season) {

		case SPRING:
			seasonInfo = "春天";
			break;
		case SUMMER:

			break;
		case AUTUMN:

			break;
		case WINTER:

			break;

		default:
			break;
		}
		return seasonInfo;
	}
}
