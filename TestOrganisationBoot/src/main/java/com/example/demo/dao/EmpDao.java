package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Employee;

@Service
public class EmpDao {
	
	@Autowired
	public EmpRepo empRepo;

	public void addEmp(Employee emp) {
		empRepo.save(emp);
		System.out.println("employee "+emp.getEmpName()+" added");
	}

	public void updateEmp(Employee emp) {
		empRepo.save(emp);
		System.out.println("employee "+emp.getEmpName()+" updated");
	}

	public List<Employee> getAllEmp() {
		return empRepo.findAll();
	}
	
}
