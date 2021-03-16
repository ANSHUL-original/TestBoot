package com.example.demo.api;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserBeans {
	
	@Column
	@Id
	private int userId;
	@Column
	private String userName;
	@Column
	private String password;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserBeans [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
		
}
