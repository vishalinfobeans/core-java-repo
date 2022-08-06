package com.java2novice.stat.imp.pac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Simpson implements Comparable<Simpson> {
    String name;
    
    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }
}

	public class Java8Compare {
		
		int[] i = new int[21];
	     public static void main(String... sortingWithList) {
	        List<Simpson> simpsons = new ArrayList<>();
	        String []s1 = new String[23];
	        simpsons.add(new Simpson("Homer "));
	        simpsons.add(new Simpson("Marge "));
	        simpsons.add(new Simpson("Bart "));
	        simpsons.add(new Simpson("Lisa "));

	        //Collections.sort(simpsons);
	        //simpsons.stream().map(s -> s.name).sorted().forEach(x -> System.out.println(x));
	        //simpsons.stream().map(s -> new Simpson(s.name)).sorted().forEach(x -> System.out.println(x.name));
	        simpsons.stream().sorted(Comparator.comparing(Simpson::getName).reversed()).forEach(x -> System.out.println(x.name));
	        Collections.reverse(simpsons);
	        simpsons.stream().forEach(System.out::print);
	    }

	}