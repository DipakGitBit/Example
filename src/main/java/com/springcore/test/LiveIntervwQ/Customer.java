package com.springcore.test.LiveIntervwQ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Customer {
	private String ename;
	private String phone;
	private double salary;
	private String gender;

	public String getEname() {
		return ename;
	}

	public String getPhone() {
		return phone;
	}

	public double getSalary() {
		return salary;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", phone=" + phone + ", salary=" + salary + ", gender=" + gender + "]";
	}

	public Customer(String ename, String phone, double salary, String gender) {
		super();
		this.ename = ename;
		this.phone = phone;
		this.salary = salary;
		this.gender = gender;
	}

	public static void main(String[] args) {
		List<Customer> employees = new ArrayList<>();
		employees.add(new Customer("Alice", "1234567890", 50000, "female"));
		employees.add(new Customer("Bob", "9876543210", 60000, "male"));
		employees.add(new Customer("Ram", "9876543210", 70000, "male"));
		employees.add(new Customer("Carol", "8765432109", 55000, "female"));
		employees.add(new Customer("Carol", "8734432109", 34000, "female"));

		// The Optional class represent an object that may or may not contain a non-null
		// value.
		// It is designed to help avoid NullPointerExceptions by explicitly indicating
		// when a value is absent.

		// highest salary in female
		Optional<Customer> male = employees.stream().filter(employee -> employee.getGender().equals("female"))
				.max(Comparator.comparing(Customer::getSalary));

		// lowest salary in male
		Optional<Customer> female = employees.stream().filter(employee -> employee.getGender().equals("male"))
				.min(Comparator.comparing(Customer::getSalary));

		System.out.println(male);
		System.out.println(female);

		// separate only emp name
		List<String> onlyEmpName = employees.stream().map(Customer::getEname).collect(Collectors.toList());

		System.out.println(onlyEmpName);

		// count employee with same name
		Map<String, Long> namecount = employees.stream()
				.collect(Collectors.groupingBy(Customer::getEname, Collectors.counting()));
		System.out.println(namecount);

		// find the customer starting with A
		List<Customer> startingWithA = employees.stream().filter(employee -> employee.getEname().startsWith("A"))
				.collect(Collectors.toList());

		System.out.println(startingWithA);

		// find the customer GROUP BY GENDER
		Map<String, List<String>> namesByGender = employees.stream().collect(Collectors.groupingBy(Customer::getGender,
				Collectors.mapping(Customer::getEname, Collectors.toList())));

		System.out.println(namesByGender);

		Comparator<Customer> byname = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getEname().compareTo(o2.getEname());
			}
		};

		// ascending order using comparator
		employees.sort((o1, o2) -> o1.getEname().compareTo(o2.getEname()));
		System.out.println(employees);

		// descending order using comparator
		employees.sort((o1, o2) -> o2.getEname().compareTo(o1.getEname()));
		System.out.println(employees);
		
		//sorting by integer
		employees.sort((o1, o2) -> Double.compare(o1.getSalary(),o2.getSalary()));
		System.out.println(employees);
		
		
		
		
		

		// ascending order using comparable
		employees.sort((o1, o2) -> o1.getEname().compareTo(o2.getEname()));
		System.out.println(employees);

		// descending order using comparable
		employees.sort((o1, o2) -> o2.getEname().compareTo(o1.getEname()));
		System.out.println(employees);

	}

}
