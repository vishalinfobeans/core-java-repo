package com;

public class RandomNumberExample2 {
	public static void main(String args[]) {
		int min = 0;
		int max = 9;
		for(int i =1 ; i<=24; i++) {
			int b = (int) (Math.random() * (max - min + 1) + min);
			System.out.print(b+" ");
			if(i%6 == 0) {
				System.out.println("");
			}
		}
	}
}
