package com;

abstract class  Ab1 {
	public Ab1() {
		System.out.println("ab1 const");
		//fdfd
	}
}

public class AbstClassExp extends Ab1{
	public AbstClassExp() {
		//super();
	}
	
	public static void main(String[] args) {
		new AbstClassExp();
	}
}
