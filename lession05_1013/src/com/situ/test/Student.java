package com.situ.test;

public class Student {
	private String studentNum;
	private String studentName;
	private double studentChineseGrade;
	private double studentMathGrade;
	private double studentEnglishGrade;

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentChineseGrade() {
		return studentChineseGrade;
	}

	public void setStudentChineseGrade(double studentChineseGrade) {
		this.studentChineseGrade = studentChineseGrade;
	}

	public double getStudentMathGrade() {
		return studentMathGrade;
	}

	public void setStudentMathGrade(double studentMathGrade) {
		this.studentMathGrade = studentMathGrade;
	}

	public double getStudentEnglishGrade() {
		return studentEnglishGrade;
	}

	public void setStudentEnglishGrade(double studentEnglishGrade) {
		this.studentEnglishGrade = studentEnglishGrade;
	}

	public Student(String studentNum, String studentName, double studentChineseGrade, double studentMathGrade,
			double studentEnglishGrade) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentChineseGrade = studentChineseGrade;
		this.studentMathGrade = studentMathGrade;
		this.studentEnglishGrade = studentEnglishGrade;
	}

	public Student() {
		super();
	}

	public void sum() {
		System.out.println("学号为：" + getStudentNum() + "的" + getStudentName() + "同学的总分为："
				+ (this.getStudentChineseGrade() + this.studentEnglishGrade + this.studentMathGrade));
	}

	public void avarage() {
		System.out.println("学号为：" + getStudentNum() + "的" + getStudentName() + "同学的平均分为："
				+ ((this.getStudentChineseGrade() + this.studentEnglishGrade + this.studentMathGrade) / 3));
	}

	public boolean isFalse() {
		boolean isFalse = true;
		if ((this.studentChineseGrade < 60.0) || (this.studentEnglishGrade < 60.0) || (this.studentMathGrade < 60.0)) {
			isFalse = false;
		}
		return isFalse;
	}
}
