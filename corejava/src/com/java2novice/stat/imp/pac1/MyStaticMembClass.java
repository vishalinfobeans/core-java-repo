package com.java2novice.stat.imp.pac1;

public class MyStaticMembClass {

	public static int INCREMENT;

	public static int incrementNumber(int number) {
		return number + INCREMENT;
	}
	
	public static void add1(){
		System.out.println("add1");
	}
}
