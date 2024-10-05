package com.ossdanoroc.bookstoreapp.service;

import java.util.List;

public interface ICRUD<T> {
	T save(T t);
	T update(T t);
	List<T> findAll();
	
}
