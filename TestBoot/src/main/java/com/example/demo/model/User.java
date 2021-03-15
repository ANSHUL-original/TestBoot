package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	private String uName;
	private String uTech;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuTech() {
		return uTech;
	}

	public void setuTech(String uTech) {
		this.uTech = uTech;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uName=" + uName + ", uTech=" + uTech + "]";
	}

}
