package com.ngopidevteam.service;

import com.ngopidevteam.dto.BookDetailDTO;

public interface BookService {

	public BookDetailDTO findBookDetailById(Long BookId);
}
