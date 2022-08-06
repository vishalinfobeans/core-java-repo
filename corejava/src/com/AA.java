package com;

public interface AA {
	default void print() {
		System.out.println("AA-");
	}
	static void print1() {
		System.out.println("AA-");
	}
	private void prin2t() {
		System.out.println("AA-");
	}
	
	
}
