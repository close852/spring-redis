package com.cjhm.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Employee implements Serializable {

	private static final long serialVersionUID = -3508227253669625336L;
	private String id;
	private String name;
	private Integer age;
	private LocalDateTime createdDate;

	public Employee() {
	}

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(String id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
		createdDate = LocalDateTime.now();
	}

	public Employee(String id, String name, Integer age, LocalDateTime createdDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.createdDate = createdDate;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", createdDate=" + createdDate + "]";
	}

}
