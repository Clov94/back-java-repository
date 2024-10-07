package com.ossdanoroc.bookstoreapp.service;

import java.util.List;

public interface ICRUD<T, V> {
	T save(T t);
	T update(T t, V v);
	List<T> findAll();
	
}
