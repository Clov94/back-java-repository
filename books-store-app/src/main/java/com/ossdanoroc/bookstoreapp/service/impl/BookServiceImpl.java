package com.ossdanoroc.bookstoreapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ossdanoroc.bookstoreapp.model.Book;
import com.ossdanoroc.bookstoreapp.repository.IBookRepository;
import com.ossdanoroc.bookstoreapp.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private IBookRepository repo;

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public Book update(Book book) {
		// TODO Auto-generated method stub
		// --- use this code if the code before does not work
//		Book bookById = repo.findById(book.getBookId()).get();
//		bookById.setBookTitle("some new Title");
		return repo.save(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Book> findBookById(String _id) {
		// TODO Auto-generated method stub
		Optional<Book> book = repo.findById(new ObjectId(_id));
		return book;
	}

	@Override
	public void deleteBookById(String _id) {
		// TODO Auto-generated method stub
		repo.deleteById(new ObjectId(_id));
	}

}
