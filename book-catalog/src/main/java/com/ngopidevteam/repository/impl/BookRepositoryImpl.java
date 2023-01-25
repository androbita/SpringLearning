package com.ngopidevteam.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.ngopidevteam.domain.Author;
import com.ngopidevteam.domain.Book;
import com.ngopidevteam.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository{
	
	private Map<Long, Book> bookMap;
	
	

	public BookRepositoryImpl() {
		super();
		// TODO Auto-generated constructor stub
		bookMap = new HashMap<Long, Book>();
		Author author = new Author();
		author.setId(1L);
		author.setName("Pramudya Ananta Toer");
		author.setBirthDate(8769L);
		
		Book book1 = new Book(author);
		book1.setId(1L);
		book1.setTitle("Bumi Manusia");
		book1.setDescription("Bumi manusia adalah salah satu novel karya Pramudya Ananta Toer");
//		book1.setAuthor(author);
		
		bookMap.put(book1.getId(), book1);
	}



	@Override
	public Book findBookById(Long id) {
		// TODO Auto-generated method stub
		Book book = bookMap.get(id);
		return book;
	}

}
