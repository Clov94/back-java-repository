package com.ossdanoroc.bookstoreapp.controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ossdanoroc.bookstoreapp.model.Book;
import com.ossdanoroc.bookstoreapp.service.IBookService;



@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("v1/api/books/")
public class BookController {

	@Autowired
	private IBookService bookService;

	@PostMapping("save-book")
	public HttpEntity<Book> save(@RequestBody Book book) {
		if (book.getBookId() == null) {
			book.setBookId(new ObjectId());
		}
		Book bSaved = bookService.save(book);
		return new ResponseEntity<Book>(bSaved, HttpStatus.CREATED);
	}

	@PutMapping("update-book/{_id}")
	public HttpEntity<Book> update(@PathVariable(value = "_id") String _id, @RequestBody Book book) {	
		Book updatedBook = bookService.update(book, _id);
		return new ResponseEntity<Book>(updatedBook, HttpStatus.ACCEPTED);
	}

	@GetMapping("all-books")
	public HttpEntity<List<Book>> findAllBooks() {
		List<Book> books = bookService.findAll();
		return new ResponseEntity<List<Book>>(books, HttpStatus.FOUND);
	}

	@GetMapping("book-by/{_id}")
	public ResponseEntity<Book> findBookById(@PathVariable String _id) {
		Optional<Book> book = bookService.findBookById(_id);
		return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//		return new ResponseEntity<Optional<Book>>(book, HttpStatus.OK);
	}

	@DeleteMapping("delete-book/{_id}")
	public ResponseEntity<Book> deleteBookById(@PathVariable String _id) {
		bookService.deleteBookById(_id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
