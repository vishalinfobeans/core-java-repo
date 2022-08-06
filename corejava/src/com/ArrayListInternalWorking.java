package com;

import java.util.Arrays;
import java.util.Collections;

public class ArrayListInternalWorking {
	public static void main(String[] args) {
		Object[] i = { 1, 2, 3, 4, 5 };
		i = new Object[10]; //default capacity
		i = Arrays.copyOf(i, 20);
		i[19] = 654; //exp
		System.out.println(i[14]);
		
	}
}
