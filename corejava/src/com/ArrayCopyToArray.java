package com;

import java.util.Arrays;

public class ArrayCopyToArray {
	public static void main(String args[]) {
		int arr[] = { 33, 3, 4, 5 };
		int[] copyOf = Arrays.copyOf(arr, 2);   //also can use
		int carr[] = arr.clone();

		System.out.println("Are both equal?");
		System.out.println(carr[0]);
		
		String s1 = "vishalthakur";
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(0,5));
		
		String s=new String("Sachine");    
		String s2=s.intern();    
		System.out.println(s == s2); //false
		
		String s3=new String("Sachin"); 
		System.out.println(s == s3); //false
		
		String s4 = "sachine";
		String s5 = "Sachine";
		System.out.println(s5==s2);
		
		int a[] = { 1, 8, 3 };
		 
        int b[] = new int[a.length];
 
        //not coping, only b refering a's location
        b = a;
        
        System.out.println("arr copy? "+b[2]);
	}
	
}
