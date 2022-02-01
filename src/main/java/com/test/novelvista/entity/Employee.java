package com.test.novelvista.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long empid;
	String ename;
	String department;
	Date date_of_joining;
	String address;
	String state_and_city;

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Date date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState_and_city() {
		return state_and_city;
	}

	public void setState_and_city(String state_and_city) {
		this.state_and_city = state_and_city;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", department=" + department + ", date_of_joining="
				+ date_of_joining + ", address=" + address + ", state_and_city=" + state_and_city + ", getEmpid()="
				+ getEmpid() + ", getEname()=" + getEname() + ", getDepartment()=" + getDepartment()
				+ ", getDate_of_joining()=" + getDate_of_joining() + ", getAddress()=" + getAddress()
				+ ", getState_and_city()=" + getState_and_city() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Employee(Long empid, String ename, String department, Date date_of_joining, String address,
			String state_and_city) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.department = department;
		this.date_of_joining = date_of_joining;
		this.address = address;
		this.state_and_city = state_and_city;
	}

	public Employee() {
		super();
	}
}