package com.ossdanoroc.bookstoreapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BooksStoreAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksStoreAppApplication.class, args);
	}

}
