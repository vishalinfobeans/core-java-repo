package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MaxOccurenceWordNumber {
	Map<String, Integer> wordCounts = new HashMap<String, Integer>();

	public static void main(String[] args) {
		//MaxOccurenceWordNumber m1 = new MaxOccurenceWordNumber();
		//m1.myLogic();
		//m1.maxNumberOfWord();
		
		
		Map<String, Integer> m1 = new HashMap<>();
		String s1 = "AbAbBBBcD";
		String arg1[] = s1.split("");

		for (String s2 : arg1) {
			int count = 1;
			Integer s3 = m1.get(s2);
			if (s3 == null) {
				m1.put(s2, count);
			} else {
				m1.put(s2, s3 + 1);
			}
		}
		
		System.out.println(m1);
	}

	private void myLogic() {
		String wordOccurrence = "abvasssSSssssssssbc";
		String[] words = wordOccurrence.split("");
		for (String word : words) {
			Integer count = wordCounts.get(word);
			if (count == null) {
				count = 0;
			}
			wordCounts.put(word, count + 1);
		}
		System.out.println(wordCounts);
	}

	private void maxNumberOfWord() {
		String largeWord = null;
		int large = 0;
		for(Map.Entry<String, Integer> entry: wordCounts.entrySet()) {
			if(entry.getValue()>large){
				largeWord = entry.getKey();
				large = entry.getValue();
			}
		}
		System.out.println(largeWord +"  "+large);
	}
}
