package com.jersey.students.pojo;

public class Student {

	public String name;
	public String location;
	public int EnrollNo;
	public String fatherName;
	
	public Student(String name, int EnrollNo, String location,String fatherName) {
		super();
		this.name = name;
		this.location = location;
		this.EnrollNo = EnrollNo;
		this.fatherName = fatherName;
	}
	
	public Student() {
		super();
	}
	
	public String getName() {
		return name;

	
}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEnrollNo() {
		return EnrollNo;
	}

	public void setEnrollNo(int enrollNo) {
		EnrollNo = enrollNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setName(String name) {
		this.name = name;
	}
}
