package com.situ.ajaxstudu.pojo;

import java.io.Serializable;

public class Clazz implements Serializable {
	private static final long serialVersionUID = 1L;
	private long rowId;
	private String clazzName;
	private int classStudentNumber;
	private String clazzInfo;
	public long getRowId() {
		return rowId;
	}
	public void setRowId(long rowId) {
		this.rowId = rowId;
	}
	public String getClazzName() {
		return clazzName;
	}
	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}
	public String getClazzInfo() {
		return clazzInfo;
	}
	public void setClazzInfo(String clazzInfo) {
		this.clazzInfo = clazzInfo;
	}
	public int getClassStudentNumber() {
		return classStudentNumber;
	}
	public void setClassStudentNumber(int classStudentNumber) {
		this.classStudentNumber = classStudentNumber;
	}
	@Override
	public String toString() {
		return "Clazz [rowId=" + rowId + ", clazzName=" + clazzName + ", classStudentNumber=" + classStudentNumber
				+ ", clazzInfo=" + clazzInfo + "]";
	}
	public Clazz(long rowId, String clazzName, int classStudentNumber, String clazzInfo) {
		super();
		this.rowId = rowId;
		this.clazzName = clazzName;
		this.classStudentNumber = classStudentNumber;
		this.clazzInfo = clazzInfo;
	}
	public Clazz() {
		super();
	}
	public Clazz(String clazzName, int classStudentNumber, String clazzInfo) {
		super();
		this.clazzName = clazzName;
		this.classStudentNumber = classStudentNumber;
		this.clazzInfo = clazzInfo;
	}
	
	
}
