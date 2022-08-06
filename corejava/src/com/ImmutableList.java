package com;

class Property implements Cloneable {
	private int id;
	private String name;
	
	public Property(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id)+" "+String.valueOf(name);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	      return super.clone();
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
}

final class Employee1 {
	private final String name;
	private final Property std;

	public Employee1(String name, Property s1) {
		this.name = name;
		this.std = s1;
	}
	
	public Property getProperty() throws CloneNotSupportedException {
		return (Property)std.clone();
	}
}

public class ImmutableList {
	public static void main(String ar[]) throws CloneNotSupportedException {
		Employee1 e = new Employee1("vishal", new Property(100, "vishalthakur"));
		Property property = e.getProperty();
		System.out.println(property);
		property.setId(300);
		System.out.println(e.getProperty());
	}
}
