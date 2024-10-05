package com.ossdanoroc.bookstoreapp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ossdanoroc.bookstoreapp.model.Book;

@Repository
public interface IBookRepository extends MongoRepository<Book, ObjectId> {

}
