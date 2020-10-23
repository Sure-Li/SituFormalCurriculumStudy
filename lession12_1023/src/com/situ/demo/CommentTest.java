package com.situ.demo;

public class CommentTest {

	public static void main(String[] args) {
		Class classzz = MyCalss.class;
		MyAnnotation myAnnotation = (MyAnnotation) classzz.getAnnotation(MyAnnotation.class);
		System.out.println(myAnnotation);
	}

}

@MyAnnotation
class MyCalss {

}

@interface MyAnnotation {

}