package com.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int id;
	private String first_name;
	private String last_name;
	private String branch;
	private String city;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String first_name, String last_name, String branch, String city) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.branch = branch;
		this.city = city;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
