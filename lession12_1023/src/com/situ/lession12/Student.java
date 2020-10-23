package com.situ.lession12;

public class Student extends BaseDao<Student> {

	public static void main(String[] args) {
		new BaseDao<Student>().TgetName(new Student());
	}

	@Override
	public String toString() {
		return "ce====";
	}

}
