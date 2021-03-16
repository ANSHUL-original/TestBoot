package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.BookBeans;
import com.example.demo.repo.BookRepo;

@Service
public class BookDaoImpl implements BookDao {

	@Autowired
	public BookRepo bookRepo;

	@Override
	public void addBook(BookBeans bookbeans) {
		bookRepo.save(bookbeans);
	}

	@Override
	public BookBeans showBook(int id) {
		return bookRepo.findById(id).get();
	}

	@Override
	public List<BookBeans> showAllBooks() {
		List<BookBeans> book = new ArrayList<BookBeans>();
		bookRepo.findAll().forEach(books1 -> book.add(books1));
		;
		return book;
	}

	@Override
	public void updateBook(BookBeans bookBeans) {
		bookRepo.save(bookBeans);
	}

	@Override
	public void deleteBook(int id) {
		bookRepo.deleteById(id);
	}

}
