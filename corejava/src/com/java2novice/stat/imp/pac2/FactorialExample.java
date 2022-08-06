package com.java2novice.stat.imp.pac2;
//5*4*3*2*1
public class FactorialExample {
	
	private FactorialExample () {
		
	}
	public static void main(String args[]) {
		
		FactorialExample fp = new FactorialExample();
		
		int fact = 1;
		int number = 5;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		//System.out.println("Factorial of " + number + " is: " + fact);
		System.out.println(factorial(5));
	}
	
	
	//using recurson
	static int factorial(int n){    
		  if (n == 0) {
			  System.out.println("if " +n);
		    return 1;  
		  }
		  else {    
			  System.out.println("else " +n);
			  return(n * factorial(n-1));
		  }
		 }   
}
