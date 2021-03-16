package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.BookBeans;
import com.example.demo.dao.BookDaoImpl;

@RestController
public class BookController {

	@Autowired
	public BookDaoImpl bookDao;
	
	@RequestMapping("/addbook")
	public int addBookMethod(@ModelAttribute("bookBeans") BookBeans bookBeans) {
		bookDao.addBook(bookBeans);
		return bookBeans.getBookId();
	}
	@RequestMapping("/showAllBook")
	public List<BookBeans> viewAllBooks() {

		return bookDao.showAllBooks();
	}
	@RequestMapping("/showbook/{book_id}")
	public BookBeans viewBook(int book_id) {
		return bookDao.showBook(book_id);
	}
	@RequestMapping("/updatebook")
	public BookBeans updateBook(@ModelAttribute("bookBeans") BookBeans bookBeans) {
		bookDao.updateBook(bookBeans);
		return bookBeans;
	}
	@RequestMapping("/deletebook/{book_id}")
	public void deleteBook(@PathVariable("book_id") int book_id) {
		bookDao.deleteBook(book_id);
	}
	
}
