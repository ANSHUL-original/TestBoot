package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.User;

public interface UserDao {

	public void addUser(User user);
	public void deleteUser(int id);
	public List<User> showAllUsers();
	public User showById(int id);
	public void updateUser(int id);
}
