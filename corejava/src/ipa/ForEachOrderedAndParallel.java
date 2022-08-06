package ipa;

import java.util.stream.Stream;

//parallel partition stream in multiple core
public class ForEachOrderedAndParallel {
	public static void main(String[] args) {

		Stream.of("AAA","BBB","CCC","1","2","5","AAA","BBB","CCC","1","2","5").parallel().forEach(s->System.out.print(" "+s));
		System.out.println();
		Stream.of("AAA","BBB","CCC","2","4","3","AAA","BBB","CCC","81","2","5").forEachOrdered(s->System.out.print(" "+s));  
	}
}
