package com.situ.test.test01;

public class Test01<K, V> {
	private K kTest;

	@Override
	public String toString() {
		return "Test01 [kTest=" + kTest + ", vTest=" + vTest + "]";
	}

	public Test01() {
		super();
	}

	public Test01(K kTest, V vTest) {
		super();
		this.kTest = kTest;
		this.vTest = vTest;
	}

	public K getkTest() {
		return kTest;
	}

	public void setkTest(K kTest) {
		this.kTest = kTest;
	}

	public V getvTest() {
		return vTest;
	}

	public void setvTest(V vTest) {
		this.vTest = vTest;
	}

	private V vTest;
}
