package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home");
		return "home";
	}
	
	@RequestMapping("/addemppage")
	public String addEmpPage() {
		return "addemppage";
	}
	@RequestMapping("/addorgpage")
	public String addOrgPage() {
		return "addorgpage";
	}
	@GetMapping("/addsalarypage")
	public String addsalPage() {
		return "addsalarypage";
	}
}
