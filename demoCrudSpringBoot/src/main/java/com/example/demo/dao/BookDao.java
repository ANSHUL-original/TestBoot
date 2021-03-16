package com.example.demo.dao;

import java.util.List;

import com.example.demo.api.BookBeans;

public interface BookDao {

	public void addBook(BookBeans bookbeans);
	public BookBeans showBook(int id);
	public List<BookBeans> showAllBooks();
	public void updateBook(BookBeans bookBeans);
	public void deleteBook(int id);
}
