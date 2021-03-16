package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping("/")
	public String homepagemethod() {
		return "home";
	}
	
	@PostMapping("/addUser")
	public String addUserMethod(User user) {
		userDao.addUser(user);
		return "home";
	}
	
	@GetMapping("/showUsers")
	public ModelAndView showUsersMethod() {
		ModelAndView mv=new ModelAndView();
		List<User> list= userDao.showAllUsers();
		mv.addObject("list", list);
		mv.setViewName("showAllUserPage");
		return mv;
	}
}
