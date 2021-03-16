package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Salary {

	@Id
	@Column(name="S.NO")
	@GeneratedValue
	private int sid;
	@Column(name="Salary")
	private Double sal;
	@Column(name="Emp_ID")
	private int eid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Salary [sid=" + sid + ", sal=" + sal + ", eid=" + eid + "]";
	}
}
