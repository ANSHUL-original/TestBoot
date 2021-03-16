package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Salary;

@Service
public class SalDao {
	@Autowired
	SalRepo salRepo;

	public void save(Salary sal) {
		salRepo.save(sal);
	}

}
