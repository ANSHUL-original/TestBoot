package com.example.demo.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.beans.Employee;
import com.example.demo.dao.EmpDao;

@Controller
public class EmpController {
	
	@Autowired
	EmpDao empDao;
	
	@RequestMapping(value="/addEmp",method=RequestMethod.POST)
	public String addEmpMethod(Employee emp) {
		empDao.addEmp(emp);		
		return "dashboard";
	}
	@RequestMapping(value="/updateEmp",method=RequestMethod.POST)
	public String updateEmpMethod(Employee emp) {
		empDao.updateEmp(emp);		
		return "dashboard";
	}
	
	@RequestMapping("/getAllEmp")
	public ModelAndView getAllEmpMethod() {
		ModelAndView mv=new ModelAndView();
		List<Employee> empList=empDao.getAllEmp();
		mv.addObject("empList",empList);
		mv.setViewName("getAllEmpPage");
		return mv;
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor dateEditor=new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, "joining", dateEditor);
	}
}
