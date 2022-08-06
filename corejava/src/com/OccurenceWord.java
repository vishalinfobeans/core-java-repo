package com;

import java.util.HashMap;
import java.util.Map;

public class OccurenceWord {
	public static void main(String[] args) {
		String wordOccurrence = "string are count string are count string are count";
	     
		   String[] words = wordOccurrence.toLowerCase().split("\\s+");
		 
		   Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		 
		   for (String word : words) {
		      Integer count = wordCounts.get(word);
		           if (count == null) {
		            count = 0;
		        }
		        wordCounts.put(word, count + 1);
		    }
		     System.out.println(wordCounts);
	}
}
