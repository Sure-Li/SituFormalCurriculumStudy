package com.situ.lession12;

public class MapDao<K,V> {
	private K k;
	private V v;
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	public MapDao(K k, V v) {
		super();
		this.k = k;
		this.v = v;
	}
	public MapDao() {
		super();
	}
	
}
