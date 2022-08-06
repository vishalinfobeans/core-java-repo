package com.java2novice.stat.imp.pac1;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
	public static void main(String[] args) {
		 System.out.println(isAnagram("oooyooy", "yyooooo"));
		 
		 Map<Integer, String> m = new HashMap();
		 String s1 = m.put(100, "df");
		 
	}

	public static boolean isAnagram(String word, String pattern) {
		if (word.length() != pattern.length()) {
			return false;
		}

		char[] chars = word.toCharArray();

		for (char c : chars) {
			int index = pattern.indexOf(c);
			if (index != -1) {
				pattern = pattern.substring(0, index) + pattern.substring(index + 1, pattern.length());
			} else {
				return false;
			}
		}

		return pattern.isEmpty();
	}
}
