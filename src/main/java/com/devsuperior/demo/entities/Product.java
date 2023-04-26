package com.devsuperior.demo.entities;

public class Product {

	private Long id;
	private String name;
	private Double price;
	
	private Department department;

	public Product() {
	}

	public Product(Long id, String name, Double price, Department department) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
