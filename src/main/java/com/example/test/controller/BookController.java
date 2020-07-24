package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Book;
import com.example.test.repository.BookRepository;


@RestController
@RequestMapping("api/book")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/save")
	public Book getAllGift(){
		Book book1 = new Book();
		book1.setBookName("comic");
		Book bookSaved = bookRepository.save(book1);		
		return bookSaved;
	}
}
