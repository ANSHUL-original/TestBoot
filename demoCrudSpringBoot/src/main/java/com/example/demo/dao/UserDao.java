package com.example.demo.dao;

import com.example.demo.api.UserBeans;

public interface UserDao {

	public void addUser(UserBeans userBeans);
	public void readUser(UserBeans userBeans);
	public void updateUser(UserBeans userBeans);
	public void deleteUser(UserBeans userBeans);
}
