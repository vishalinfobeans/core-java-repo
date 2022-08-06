package com;

public class Employee {
	private int eno;
	private String ename;

	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public String getEname() {
		return ename;
	}

	public static void main(String[] args) {
		Employee emp=new Employee(101,"vishal");
		Employee emp1=new Employee(101,"vishal");
		System.out.println(emp.equals(emp1));
		System.out.println(emp==emp1);
	}
}
