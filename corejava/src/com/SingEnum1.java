package com;

public enum SingEnum1 {
	instance;
	
	public static Object getInstance(){
		System.out.println("got instance");
		return instance;
	}
	
}
