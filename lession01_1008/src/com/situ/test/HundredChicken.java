package com.situ.test;

public class HundredChicken {
	private static int chickenSumNum = 100;
	private static double moneySumNum = 100;

	public static void main(String[] args) {
		for (int cock = 0; cock < chickenSumNum; cock++) {
			for (int hen = 0; hen < chickenSumNum; hen++) {
				if (cock * 5 + hen * 3 + (chickenSumNum - cock - hen) / 3 == moneySumNum) {
					System.out.println("100文钱可以买100只鸡的情况为：公鸡有" + cock + "母鸡有" + hen + "只，小鸡有"
							+ (chickenSumNum - cock - hen) + "只");
				}
			}
		}
	}

}
