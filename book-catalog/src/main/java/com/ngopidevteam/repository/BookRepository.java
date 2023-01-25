package com.ngopidevteam.repository;

import com.ngopidevteam.domain.Book;

public interface BookRepository {
	
	public Book findBookById(Long id);

}
