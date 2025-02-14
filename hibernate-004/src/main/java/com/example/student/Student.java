package com.example.student;

public class Student {
	private int id;
	private String name;
	private int rollNumber;
	public Student(String string) {}
	public Student(String name,int rollNumber) {
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
}