package com.springcore.test.LiveIntervwQ;

import java.util.List;

public class Project {

	private String pname;
	private String pcode;
	private List<Employee> employee;

	public String getPname() {
		return pname;
	}

	public String getPcode() {
		return pcode;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	@Override
	public String toString() {
		return "Project [pname=" + pname + ", pcode=" + pcode + ", employee=" + employee + "]";
	}

	public Project(String pname, String pcode, List<Employee> employee) {
		super();
		this.pname = pname;
		this.pcode = pcode;
		this.employee = employee;
	}

}
