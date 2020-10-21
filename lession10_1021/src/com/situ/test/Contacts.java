package com.situ.test;

public class Contacts {
	private String name;
	private String phoneNumber;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Contacts() {
		super();
	}

	public Contacts(String name, String phoneNumber, String email, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		return "联系人：" + name + ", 手机号：" + phoneNumber + ", 邮箱地址：" + email + ", 地址：" + address;
	}

}
