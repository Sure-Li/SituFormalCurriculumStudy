package com.situ.test;

public class TestFour {

	public static void main(String[] args) {
		// ++在后 则使用++前的值 ++在前 则使用++后的值
		int i = 5;
		int j = ++i;
		System.out.println("i:" + i + "j:" + j);
		int k = 5;
		int m = k++;
		System.out.println("k:" + k + "m:" + m);
		int i1 = 5;
		if ((i1 != 5) && (++i1 == 6)) {// 如果i==5则成立
			System.out.print("Yes!");
		}
		System.out.print(i1);
		System.out.println();
		int j1 = 5;
		if ((j1 == 5) && (j1++ == 6)) {// 如果++在前则条件成立
			System.out.print("Yes!");
		}
		System.out.print(j1);
	}

}
