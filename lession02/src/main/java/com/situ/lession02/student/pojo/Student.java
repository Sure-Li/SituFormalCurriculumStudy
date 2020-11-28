package com.situ.lession02.student.pojo;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	 private String row_id;
	 private long ClazzId;
	 private String stuCode;
	 private String stuPassword;
	 private String stuName;
	 private String stuAge;
	 private Date stuBirthday;
	 
	public long getClazzId() {
		return ClazzId;
	}
	public void setClazzId(long clazzId) {
		ClazzId = clazzId;
	}
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	public String getStuPassword() {
		return stuPassword;
	}
	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}
	public Date getStuBirthday() {
		return stuBirthday;
	}
	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
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
	
	public Student(String row_id, long clazzId, String stuCode, String stuPassword, String stuName, String stuAge,
			Date stuBirthday) {
		super();
		this.row_id = row_id;
		ClazzId = clazzId;
		this.stuCode = stuCode;
		this.stuPassword = stuPassword;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuBirthday = stuBirthday;
	}
	@Override
	public String toString() {
		return "Student [row_id=" + row_id + ", stuName=" + stuName + ", stuAge=" + stuAge + "]";
	}
	
}
