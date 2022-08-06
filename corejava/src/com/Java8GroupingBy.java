package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8GroupingBy {
	public static void main(String[] args) {
		 List<String> g
         = Arrays.asList("geeks", "for", "geeks");
		 
		 Map<String, Long> collect = g.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 
		 String collect2 = g.stream().collect(Collectors.joining("-"));
		 
		 collect.entrySet().stream().forEach(k -> System.out.println(k.getKey()+" "+k.getValue()));
		 
		 System.out.println(collect2);
		 
		 
		 
		 //===============
		 List<Integer> i
         = Arrays.asList(10,20,30);
		 Integer collect3 = i.stream().collect(Collectors.summingInt(x->x*x));
		 System.out.println(collect3);
		 
		 //Partition by exaple
		 Map<Boolean, List<Integer>> map = Stream.of(1,2,3,4,5,6).collect(Collectors.partitioningBy(num->num%2==0));
		 map.forEach((k,v) -> System.out.println(k+"  "+v));
		 
		 List<String> list
         = Arrays.asList("geeks", "for", "geeks","vishal", "kumaar", "thaur");
		 
		 Map<Boolean, List<String>> map1 = list.stream().collect(Collectors.partitioningBy(str-> str.contains("e")));
		 map1.forEach((k,v) -> System.out.println(k+"  "+v));
		 
		 
	}
}
