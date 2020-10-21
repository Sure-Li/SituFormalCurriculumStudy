package com.situ.lession06;

public class PersonTest {

	public static void main(String[] args) {
		Student student = new Student("张三", "山东", 'm', 19, 99.0, 87.1);
		test(student);
	}

	public static void test(Person p) {
		if (p instanceof Student) {
			Student s = (Student) p;
			System.out.println(s.toString());
		}

	}

}
