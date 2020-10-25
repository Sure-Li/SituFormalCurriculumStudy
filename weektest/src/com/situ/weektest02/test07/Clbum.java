package com.situ.weektest02.test07;

import java.util.List;

public class Clbum {
	private String clbumName;
	private Integer studengtNum;
	private List<Student> studentList;

	public String getClbumName() {
		return clbumName;
	}

	public void setClbumName(String clbumName) {
		this.clbumName = clbumName;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public String getName() {
		return clbumName;
	}

	public void setName(String name) {
		this.clbumName = name;
	}

	public Integer getStudengtNum() {
		return studengtNum;
	}

	public void setStudengtNum(Integer studengtNum) {
		this.studengtNum = studengtNum;
	}

	public Clbum() {
		super();
	}

	public Clbum(String name, Integer studengtNum) {
		super();
		this.clbumName = name;
		this.studengtNum = studengtNum;
	}

	public Clbum(String clbumName, Integer studengtNum, List<Student> studentList) {
		super();
		this.clbumName = clbumName;
		this.studengtNum = studengtNum;
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Clbum [name=" + clbumName + ", studengtNum=" + studengtNum + ", studentList=" + studentList + "]";
	}

	public void getClbum() {
		System.out.println(this.clbumName + this.studengtNum);
	}

}
