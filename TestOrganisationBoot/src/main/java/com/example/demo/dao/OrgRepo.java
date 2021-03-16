package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Organisation;

@Repository
public interface OrgRepo extends JpaRepository<Organisation, Integer> {

}
