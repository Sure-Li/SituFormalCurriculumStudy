package com.situ.lession12;

import java.util.List;

public interface BaseDaoInterface<T> {
	void save(T t);

	List<T> find();
}
