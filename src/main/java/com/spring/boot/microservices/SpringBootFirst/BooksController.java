package com.spring.boot.microservices.SpringBootFirst;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(1,"The Secret", "Ronda Byrne"));
		bookList.add(new Book(1,"Who Moved my Cheese", "Krishna"));
		bookList.add(new Book(1,"Friends and Influence", "John"));		
		
		return bookList;		
	}

}
