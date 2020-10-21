package com.situ.lession10;

public class EqualsTest {

	public static void main(String[] args) {
////		EqualsTest.Demo d1 = EqualsTest.new Demo();
////		Demo d2 = new Demo();
		Integer t1 = 6;
		Integer t2 = 6;
		System.out.println(t1 == t2);
		Integer t3 = new Integer(127);
		Integer t4 = new Integer(127);
		System.out.println(t3 == t4);
		System.out.println(t3.equals(t4));
		Integer t5 = 127;
		Integer t6 = new Integer(127);
		System.out.println(t6 == t5);
		System.out.println(t6 == 127);// -----------
		System.out.println(t6.equals(127));

		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}

	class outer {
		class inner {
			int a;
		}
	}
}
