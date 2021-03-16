package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.Salary;
import com.example.demo.dao.SalDao;

@Controller
public class SalController {

	@Autowired
	SalDao salDao;
	
	@RequestMapping("/addSal")
	public String addSalMethod(Salary sal) {
		salDao.save(sal);
		return "dashboard";
	}
}
