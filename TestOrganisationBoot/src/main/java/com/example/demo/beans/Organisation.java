package com.example.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Organisation {

	@Id
	@Column(name="Org_ID")
	@GeneratedValue
	private int oid;
	@Column(name="Org_Name")
	private String oName;
	@Column(name="Emp_Count")
	private int empCount;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	@Override
	public String toString() {
		return "Organisation [oid=" + oid + ", oName=" + oName + ", empCount=" + empCount + "]";
	}	
}
