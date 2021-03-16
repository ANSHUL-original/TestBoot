package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
public class User {

	@Id
	@Column(name="U_Id")
	@GeneratedValue
	public int uid;
	@Column(name="User_Name")
	private String userName;
	@Column(name="Password")
	private String password;
	@Exclude
	private String cnfPassword;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public String getCnfPassword() {
		return cnfPassword;
	}
	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}
	@Override
	public String toString() {
		return "RegisterUserBean [uid=" + uid + ", userName=" + userName + ", password=" + password + ", cnfPassword="
				+ cnfPassword + "]";
	}
}
