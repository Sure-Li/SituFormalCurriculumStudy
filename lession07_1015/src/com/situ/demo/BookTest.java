package com.situ.demo;

public class BookTest {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		for (int i = 0; i < books.length; i++) {
			books[i] = new Book("haha ", 15.0);
		}
		System.out.println("总共有书：" + (books[books.length - 1].getBookNum()));
	}

}
