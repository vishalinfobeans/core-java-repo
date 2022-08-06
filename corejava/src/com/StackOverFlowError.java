package com;

interface Printable {
	void print();
}

interface Showable {
	void print();
}

public class StackOverFlowError implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
		StackOverFlowError obj1 = new StackOverFlowError();
		obj1.print1();
	}
	public void print1() {
		System.out.println("Hello");
		StackOverFlowError obj2 = new StackOverFlowError();
		obj2.print();
	}

	public static void main(String args[]) {
		Printable obj = new StackOverFlowError();
		obj.print();
	}
}