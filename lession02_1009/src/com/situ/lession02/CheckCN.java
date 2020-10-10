package com.situ.lession02;

public class CheckCN {

	public static void main(String[] args) {
		System.out.println(checkCN('樊'));
		System.out.println((char) 20013);
		// 进制转换
		int t1 = 18;
		String st = Integer.toBinaryString(t1);
		System.out.println(st);
		System.out.println("0x" + Integer.toHexString(t1));
		Integer t = Integer.parseInt(st, 2);// 此处几进制后面就写几
		System.out.println("--" + t);
		System.out.println((char) 0x4e00);
		System.out.println((char) 0x9fa5);
	}

	public static boolean checkCN(char c) {
		return c >= 0x4E00 && c <= 0x9FA5;// 根据bai字节码判断
	}

}
