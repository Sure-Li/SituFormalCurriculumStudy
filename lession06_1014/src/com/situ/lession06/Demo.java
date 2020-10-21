package com.situ.lession06;

public class Demo {
//	public static void main(String[] args) {
////		System.out.println(stringCom(2, "aa", "bb", "cc","dd").toString());
//		String str = "null";
//		if (str == null) {
//			System.out.println("null");
//		} else if (str.length() == 0) {
//			System.out.println("zero");
//		} else {
//			System.out.println("some");
//		}
//
//	}

//	public static StringBuffer stringCom(int index, String... strings) {
//		int i = 0;
//		StringBuffer test = new StringBuffer();
//		for (String string : strings) {
//			i++;
//			if (i == index) {
//				string = strings[i - 1].toUpperCase();
//			}
//			test.append(string);
//		}
//		return test;
//	}
	int x;

	public static void main(String[] args) {
		Demo t = new Demo();
		t.x = 5;
		change(t);
		System.out.println(t.x);
	}

	public static void change(Demo t) {
		t.x = 3;
	}

}
