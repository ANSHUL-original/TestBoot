package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.UserBeans;

@Controller
public class UserController {

	@GetMapping("/home")
	public String homeMethod(@ModelAttribute("userBeans") UserBeans userBeans) {
		System.out.println("home");
		return "index";
	}
	
	@PostMapping("/login")
	public String loginMethod(@ModelAttribute("userBeans") UserBeans userBeans) {
		String userName=userBeans.getUserName();
		String password=userBeans.getPassword();
		
		if(userName.equals("root") && password.equals("root")) {
			return "dashboard";
		}
		else {
			System.out.println("ERROR");
			return "home";
		}
	}
}
