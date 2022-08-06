package ipa;

import java.io.Serializable;

class Address{
	String addName;
}

public class Employee extends Human implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4890909519383077618L;
	/**
	 * 
	 */
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	//public Address a;
	
	public Employee(int ssn, String name, String address) {
		this.SSN = ssn;
		this.name = name;
		//this.a.addName = address;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}
