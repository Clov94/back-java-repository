package com.ossdanoroc.bookstoreapp.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ossdanoroc.bookstoreapp.model.Book;

@Service
public interface IBookService extends ICRUD<Book, String> {

	Optional<Book> findBookById(String _id);

	void deleteBookById(String _id);

}
