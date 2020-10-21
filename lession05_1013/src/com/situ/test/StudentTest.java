package com.situ.test;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student("1000", "欧拉", 85.5, 90.0, 20.0);
		Student stu2 = new Student("1001", "啦偶", 93.5, 55.0, 90.0);
		stu1.sum();
		stu1.avarage();
		if (stu1.isFalse()) {
			System.out.println("学号为：" + stu1.getStudentNum() + "的" + stu1.getStudentName() + "同学没有不及格的科目");
		} else {
			System.out.println("学号为：" + stu1.getStudentNum() + "的" + stu1.getStudentName() + "同学有不及格的科目");
		}
		stu2.sum();
		stu2.avarage();
		if (stu2.isFalse()) {
			System.out.println("学号为：" + stu2.getStudentNum() + "的" + stu2.getStudentName() + "同学没有不及格的科目");
		} else {
			System.out.println("学号为：" + stu2.getStudentNum() + "的" + stu2.getStudentName() + "同学有不及格的科目");
		}
	}

}
