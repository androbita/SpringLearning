package com.ngopidevteam.service.impl;

import com.ngopidevteam.domain.Author;
import com.ngopidevteam.domain.Book;
import com.ngopidevteam.dto.BookDetailDTO;
import com.ngopidevteam.repository.BookRepository;
import com.ngopidevteam.service.BookService;

public class BookServiceImpl implements BookService{

	private Book book;
	
	private BookRepository bookRepository;

	public BookServiceImpl() {
		Author author = new Author();
		book = new Book(author);
	}

	@Override
	public BookDetailDTO findBookDetailById(Long BookId) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findBookById(BookId);
		BookDetailDTO dto = new BookDetailDTO();
		dto.setBookId(book.getId());
		dto.setAuthorName(book.getAuthor().getName());
		dto.setBookTitle(book.getTitle());
		dto.setBookDescription(book.getDescription());
		return dto;
	}

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
}
