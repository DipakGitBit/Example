package com.springcore.test.LiveIntervwQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class employeeProject {

	public static void main(String[] args) {
		List<Project> pro = Arrays.asList(
				new Project("c++", "123", Arrays.asList(new Employee("ram", "xxx", 123, 60000, 3423),
						new Employee("sam", "xxx", 123, 50000, 5432), new Employee("bob", "xxx", 123, 20000, 7654))),
				new Project("c", "345", Arrays.asList(new Employee("ff", "xxx", 123, 60000, 1234),
						new Employee("ee", "xxx", 123, 50000, 2345), new Employee("tt", "xxx", 123, 20000, 2345))));

		List<Employee> sortedpro = pro.stream().flatMap(p -> p.getEmployee().stream())
				.sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());

		System.out.print(sortedpro);

	}

}
