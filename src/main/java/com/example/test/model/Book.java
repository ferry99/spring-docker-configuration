package com.example.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "m_book")
@Data
public class Book {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(unique = false, length = 15, nullable = false, name = "book_name")
	private String bookName;
}
	
