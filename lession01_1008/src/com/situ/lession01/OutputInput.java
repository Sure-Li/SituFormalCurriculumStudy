package com.situ.lession01;

import java.util.Scanner;

/**
 * 用来学习标准输入输出
 * @author Administrator
 *
 */
public class OutputInput {

	public static void main(String[] args) {
		//java.lang.System 全额类名 = 包名+类名
		System.out.append('c');
		System.out.println("标准输出");
		System.err.println("99");
		System.out.println("11111");
		System.out.println("OutputInput.main()");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("结果"+s);
		sc.close();;
	}

}
