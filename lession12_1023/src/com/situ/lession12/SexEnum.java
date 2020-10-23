package com.situ.lession12;

public enum SexEnum {
	MAN(1), WOMEN(0);

	int sexValue;

	private SexEnum(int sexValue) {
		this.sexValue = sexValue;
	}

	public int getSexValue() {
		return sexValue;
	}

	public void setSexValue(int sexValue) {
		this.sexValue = sexValue;
	} 

}
