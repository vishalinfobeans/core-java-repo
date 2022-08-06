package com.java2novice.stat.imp.pac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.Item;

public class Java8Stream {
	
	protected Java8Stream(int i) {
		// TODO Auto-generated constructor stub
	}
	
	public Java8Stream() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//print number on given number range
		IntStream.range(1, 16). forEach((x) -> System.out.println("range= "+x));
		IntStream.range(1, 16). forEach(System.out::println);
		//skip upto given number
		//IntStream.range(1, 10).skip(5).forEach(x -> System.out.print(x+","));
		//sum item on geven range
		//System.out.println(IntStream.range(1, 10).sum());
		
		//find max on given range
		//System.out.println(IntStream.range(1, 10).max().getAsInt());
		
		//find first shorted string..here 'of' means verags
		//Stream.of(1,2,3,4).sorted().findFirst().ifPresent(System.out::println);
		
		//sorting and filter of string-array
		String name [] = {"visal","ravi","mohan","Avi","gvisal","rgavi","vmohanv","vAvi"};
		Arrays.stream(name).sorted().forEach(k -> {System.out.println(k);});
		//Arrays.stream(name).filter((x)-> x.startsWith("v")).sorted().forEach(p -> System.out.println("####"+p));
		//System.out.println("++++++++"+Arrays.stream(name));
		//addition of squire
		//Integer num [] = {1, 2, 3};
		//Arrays.stream(num).map((x) -> x * x).forEach(System.out :: println);

		//iterate ArrayList & filter & string validation
		//List<String> l1 = new ArrayList<>();
		//l1.add("nfndhjs"); l1.add("rdfqds"); l1.add("epfds"); l1.add("wsfds"); l1.add("pfds"); l1.add("efds");
		//l1.stream().filter(x -> x.startsWith("E")).map(String :: toUpperCase).forEach(System.out :: println);
		//Set<String> collect = l1.stream().filter(y->y.length()>1).map(y->y.toUpperCase()).collect(Collectors.toSet());
		//l1.stream().filter(x -> x.startsWith("e")).forEach(y -> System.out.println("YY="+y));
		//l1.stream().collect(Collectors.toSet());
		
		
		//added return type with list iterate
		List<String> l1 = new ArrayList<>();
		l1.add("nf"); l1.add("rd"); l1.add("eg"); l1.add("ws"); l1.add("gf"); l1.add("ef");
		//List<String> list = l1.stream().map(String :: toUpperCase).filter((x) -> x.startsWith("E")).collect(Collectors.toList());
		int total = l1.stream().mapToInt(String::length).sum();
		System.out.println("total "+total);
		
		//remove duplicate from list
		//List<String> l1 = new ArrayList<>();
		//l1.add("nfndhjs"); l1.add("rdfqds"); l1.add("egfds"); l1.add("wsfds"); l1.add("gfds"); l1.add("efds");
		//List<String> collect = l1.stream().distinct().collect(Collectors.toList());
		//System.out.println(collect);
		
		int testNum = 1;
		List<Integer> la1 = new ArrayList<>();;
		for(int i = 1; i<988; i=i+2) {
			testNum ++;
			la1.add(testNum);
		}
		
		long startTime = System.nanoTime();
		for(int i1: la1) {
			//System.out.println(i1);
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		//System.out.println("========================================================");
		long startTime1 = System.nanoTime();
		//l1.stream().forEach(x -> System.out.println(x));
		long endTime1 = System.nanoTime();
		long totalTime1 = endTime1 - startTime1;
		
		//System.out.println("totaltime1= "+totalTime/600);
		//System.out.println("totaltime2= "+totalTime1/600);
		
		//iterate custom duplicate object from list
		
//		  List<Employee> l2 = new ArrayList<>();
//		  Employee e1 = new Employee(1,"vishal");
//		  Employee e2 = new Employee(1, "vishal");
//		  
//		  l2.add(e1); l2.add(e2);
//		  
//		  List<Employee> collect =
//		  l2.stream().distinct().map(e->e).collect(Collectors.toList());
//		  collect.forEach( (e)->System.out.println("--"+e.SSN));
		  
		  //list.stream().
		 
		
		//iterate map
		/*
		 * Map<String, Integer> items = new HashMap<>(); items.put("A", 10);
		 * items.put("B", 20); items.put("C", 30); items.put("D", 40); items.put("E",
		 * 50); items.put("F", 60);
		 * 
		 * items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		 * 
		 * items.forEach((k,v)->{ System.out.println("Item : " + k + " Count : " + v);
		 * if("E".equals(k)){ System.out.println("Hello E"); } });
		 */
		
		//List<String> l1 = new ArrayList<>();
		//l1.add("nfndhjs"); l1.add("rdfqds"); l1.add("egfds"); l1.add("wsfds"); l1.add("gfds"); l1.add("efds");
		//l1.forEach((e)->{});
		//Lamda expression
		//Square r1 = () -> System.out.println("My Runnable");
		//r1.calculate();
		
		
		//Lamda expression
		//Qquare i = (int x) -> x*x;
		//System.out.println(i.calculate(4));
		
		/*Chek c = () ->{
			System.out.println("d");
			return 0;
		};
	
		System.out.println("done");*/
		
		
		List<String> collect = Stream.of(new Item(10, null), new Item(20, "test")).map(x -> x.getItem_name()).collect(Collectors.toList());
		
		collect.forEach(x -> {
			System.out.println(x);
		});
		
		Qquare w = (x)->{
			return x;
			};
			w.calculate(324234);
	}
	
	@FunctionalInterface
	interface Square
	{
	    //int calculate(int x);
	    void calculate();
	    static void m1() {
	    	
	    }
	    default void s1() {
	    	
	    }
	}
	
	interface Chek
	{
		public static final int  n1 = 10;
	    public abstract int calculate();
	}
	
	@FunctionalInterface
	interface Qquare
	{
		
		public static final int i = 3;
	    int calculate(int x);
	}
	
	
	
}
