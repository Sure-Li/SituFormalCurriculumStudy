package com.situ.demo;

public class Book {
	private String bookName;
	private static int bookId = 8888;
	private double bookPrice;
	private static int bookNum;


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public static int getBookId() {
		return bookId;
	}

	public static void setBookId(int bookId) {
		Book.bookId = bookId;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public static int getBookNum() {
		return bookNum;
	}

	public static void setBookNum(int bookNum) {
		Book.bookNum = bookNum;
	}

	public Book(String bookName, double bookPrice) {
		bookId++;
		bookNum++;		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

}
