package com.java2novice.stat.imp.pac1;

import java.util.stream.IntStream;

public class PrimeExample {
	public static void main(String args[]) {
		//java7();
		java8();
	}

	private static void java7() {
		int i, m = 0, flag = 0;
		int n = 37;// it is the number to be checked
		m = n / 2;
		System.out.println(m);
		
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} 
		else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}
	
	public static void java8(){
		
		IntStream.range(2,100).forEach(x-> {
			if(x%2==0) {
				//System.out.println("not prime");
			} else {
				System.out.println("prime="+x);
			}
			});
	}
		
}
