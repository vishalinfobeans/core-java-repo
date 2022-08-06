package com;
import java.util.Arrays;
import java.util.stream.Stream;

public class Pelindrum {
	@SuppressWarnings("unlikely-arg-type")
	public static boolean pTest(String s1) {
		String s2="";
		String arr[] = s1.split("");
		
		StringBuilder sb = new StringBuilder(s1);
	sb.reverse();
		
		System.out.println("="+s1);
 		
		for(int i = arr.length-1; i>=0; i--) {
			s2 = s2.concat(arr[i]);
		}
		if(s1.equals(sb.toString())) {
			System.out.println("it is palindrom");
			return true;
		}else {
			System.out.println("it is not palindrom");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(Pelindrum.pTest("level"));
	}
}
