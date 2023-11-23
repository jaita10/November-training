package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String id;

	public Student(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	private String name;
	private int age;
	private int salary;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
