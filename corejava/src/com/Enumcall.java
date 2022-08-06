package com;

public class Enumcall {
	public static void main(String[] args) {
		Object i1 = SingEnum1.getInstance();
		Object i2 = SingEnum1.getInstance();
		System.out.println(i1 == i2);
	}
}
