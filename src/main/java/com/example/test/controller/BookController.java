package com.example.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Book;
import com.example.test.repository.BookRepository;


@RestController
@RequestMapping("api/book")
public class BookController {
	
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/save")
	public Book getAllGift() throws InterruptedException{
//		for(int i = 0; i < 2000; i++) {
//            logger.info("This is the " + i + " time I say 'Hello World'.");
//            Thread.sleep(100);
//        }
		logger.info("Hello from Logback {}");
		Book book1 = new Book();
		book1.setBookName("comic");
		Book bookSaved = bookRepository.save(book1);		
		return bookSaved;
	}
}
