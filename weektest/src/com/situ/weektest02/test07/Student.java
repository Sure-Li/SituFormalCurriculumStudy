package com.situ.weektest02.test07;

public class Student {
	private String studentId;
	private String studentName;
	private Integer studentAge;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public Student() {
		super();
	}

	public Student(String studentId, String studentName, Integer studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "-studentId：" + studentId + ",studentName：" + studentName + ",studentAge：" + studentAge + "-";
	}

}
