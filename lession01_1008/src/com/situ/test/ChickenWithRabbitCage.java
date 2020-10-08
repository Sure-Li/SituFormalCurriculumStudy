package com.situ.test;

public class ChickenWithRabbitCage {
	private static int animalSumNum = 15;
	private static int footSumNum = 40;

	public static void main(String[] args) {
		for (int chickenNum = 0; chickenNum < animalSumNum; chickenNum++) {
			if (chickenNum * 2 + (animalSumNum - chickenNum) * 4 == footSumNum) {
				System.out.println("鸡有" + chickenNum + "只,兔子有" + (animalSumNum - chickenNum) + "只");
			}
		}
	}

}
