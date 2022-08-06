package com;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RepeatingElementInArray {
	int min;
	 void printFirstRepeating(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> finalSet = new HashSet<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			min = -1;
			if (set.contains(arr[i])){
				min = i;			}
			else{
				set.add(arr[i]);
				
				}
			if (min != -1) {
				finalSet.add(arr[i]);
			}
		}
		System.out.println("The repeating element is " + finalSet);
	}
	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 3, 5, 6, 3};
		RepeatingElementInArray array = new RepeatingElementInArray();
       array.printFirstRepeating(arr);
        array.printFirstRepeating1(arr);
	}
	
	 void printFirstRepeating1(int arr[]) {
		 
		
		 
		 Map<Integer, Long> collect2 = Stream.of(10, 5, 3, 4, 3, 5, 6, 3)
         .collect(Collectors.groupingBy(Function.identity()
                 , Collectors.counting()));
		List<Integer> collect = collect2.keySet().stream()                 // Map -> Stream
         .filter(m -> m > 1)       // if map value > 1, duplicate element
         .collect(Collectors.toList());
		 
		 System.out.println("collect="+collect);
	 }
}
