package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Organisation;

@Service
public class OrgDao {

	@Autowired
	OrgRepo orgRepo;

	public void save(Organisation org) {
		orgRepo.save(org);
	}
}
