package com.ossdanoroc.bookstoreapp.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "books")
public class Book {

	@Id
//	private ObjectId bookId;
	private ObjectId _id;
	private String bookTitle;

	public Book() {
		super();
	}

	public Book(String bookTitle) {
		super();
		this._id = new ObjectId();
		this.bookTitle = bookTitle;
	}

	public ObjectId getBookId() {
		return _id;
	}

	public void setBookId(ObjectId bookId) {
		this._id = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + _id + ", bookTitle=" + bookTitle + "]";
	}

}
