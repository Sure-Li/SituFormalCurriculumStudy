package com.situ.test;

public class People {
	private String peopleName;
	private int peopleAge;
	private String peopleSex;
	private int peopleBirthday;
	private String peoplePhoneNumber;
	private String peopleEmail;
	private String peopleHobby;

	public People(String peopleName, int peopleAge, String peopleSex, int peopleBirthday, String peoplePhoneNumber,
			String peopleEmail, String peopleHobby) {
		super();
		this.peopleName = peopleName;
		this.peopleAge = peopleAge;
		this.peopleSex = peopleSex;
		this.peopleBirthday = peopleBirthday;
		this.peoplePhoneNumber = peoplePhoneNumber;
		this.peopleEmail = peopleEmail;
		this.peopleHobby = peopleHobby;
	}

	@Override
	public String toString() {
		return "People [peopleName=" + peopleName + ", peopleAge=" + peopleAge + ", peopleSex=" + peopleSex
				+ ", peopleBirthday=" + peopleBirthday + ", peoplePhoneNumber=" + peoplePhoneNumber + ", peopleEmail="
				+ peopleEmail + ", peopleHobby=" + peopleHobby + "]";
	}

}
