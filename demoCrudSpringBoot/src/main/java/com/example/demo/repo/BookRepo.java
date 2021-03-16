package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.api.BookBeans;

public interface BookRepo extends JpaRepository<BookBeans, Integer>{

}
