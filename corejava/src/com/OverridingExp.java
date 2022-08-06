package com;

class A{
	 static void m1() {
		System.out.println("A");
	}
}

class B extends A{
	static void m1() {
		System.out.println("B");
	}
}

public class OverridingExp extends B{
	public static void main(String[] args) {
		A a1 = new OverridingExp();
		a1.m1();
		
		
		    
	}
}
