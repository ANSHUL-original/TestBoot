package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
	@Query(value="SELECT employee, \n" + 
			"    Column_Name\n" + 
			"FROM INFORMATION_SCHEMA.COLUMNS\n" + 
			"WHERE TABLE_CATALOG = 'newTestDB';")
	public List<Object> getColumnName();

}
