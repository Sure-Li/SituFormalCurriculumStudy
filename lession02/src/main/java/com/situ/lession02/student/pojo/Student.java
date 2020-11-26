package com.situ.lession02.student.pojo;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	 private String row_id;
	 private String stuName;
	 private String stuAge;
	public String getRow_id() {
		return row_id;
	}
	public Student(String row_id, String stuName, String stuAge) {
		super();
		this.row_id = row_id;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	public Student() {
	}
	public void setRow_id(String row_id) {
		this.row_id = row_id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAge() {
		return stuAge;
	}
	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "Student [row_id=" + row_id + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	
}
