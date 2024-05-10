package com.springcore.test.LiveIntervwQ;

public class Employee {
	private String title;
	private String name;
	private int id;
	private int salary;
	private int phone;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [title=" + title + ", name=" + name + ", id=" + id + ", salary=" + salary + ", phone=" + phone
				+ "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String title, String name, int id, int salary, int phone) {
		super();
		this.title = title;
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.phone = phone;
	}

}
