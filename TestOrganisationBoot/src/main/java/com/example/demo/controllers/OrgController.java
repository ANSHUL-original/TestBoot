package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.Organisation;
import com.example.demo.dao.OrgDao;

@Controller
public class OrgController {

	@Autowired
	OrgDao orgDao;
	
	@RequestMapping("/addOrg")
	public String addOrgMethod(Organisation org) {
		orgDao.save(org);
		return "dashboard";
	}
}
