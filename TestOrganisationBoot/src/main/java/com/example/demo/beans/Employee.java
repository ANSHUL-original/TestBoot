package com.example.demo.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="Emp_ID")
	private int eid;
	@Column(name="Emp_Name")
	private String empName;
	@Column(name="Emp_Phone")
	private String empPhone;
	@Column(name="Joining_Data")
	private Date joining;
	@Column(name="Org_Name")
	private String oName;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public Date getJoining() {
		return joining;
	}
	public void setJoining(Date joining) {
		this.joining = joining;
	}
	
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empName=" + empName + ", empPhone=" + empPhone + ", joining=" + joining
				+ ", oName=" + oName + "]";
	}	
}
