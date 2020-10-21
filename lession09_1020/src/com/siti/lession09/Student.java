package com.siti.lession09;

public class Student {
	private String stuName;
	private Integer stuAge;
	private String stuSex;

	public Student(String stuName, Integer stuAge, String stuSex) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
	}

	public Student() {
		super();
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex + "]";
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

}
