package com;

class SttPer extends RuntimeException {
	public static void st1() {
		System.out.println("par");
	}
}

public class StaticOverRideExample extends SttPer {
	//@Override
	public static void st1() {
		// TODO Auto-generated method stub
	}
}