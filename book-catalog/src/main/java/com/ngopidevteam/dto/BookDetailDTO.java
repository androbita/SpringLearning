package com.ngopidevteam.dto;

import java.io.Serializable;

public class BookDetailDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6277336667560478948L;
	private Long BookId;
	private String authorName;
	private String bookTitle;
	private String bookDescription;
	public Long getBookId() {
		return BookId;
	}
	public void setBookId(Long bookId) {
		BookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	@Override
	public String toString() {
		return "BookDetailDTO [BookId=" + BookId + ", authorName=" + authorName + ", bookTitle=" + bookTitle
				+ ", bookDescription=" + bookDescription + "]";
	}
	
	
}
