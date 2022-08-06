package com.java2novice.stat.imp.pac2;

// 0 1 1 2 3 5 8 13
public class Fibonacci {
	public static void main(String[] args) {
		int a1 = 0; 
		int b1 = 1; 
		int c1 = 0;
		
		for (int i = 0; i <= 50; i++) {
		   c1 = a1+b1;  
		   a1=b1;
		   b1=c1;
		   System.out.print(c1+",");
			
		}
	}
}

// 0
//
//
//palindrom
