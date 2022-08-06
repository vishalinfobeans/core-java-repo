package com;
public class Solution {

public static String firstNonRepeatingLetter(String str) {
	String test = str;
        String op="";
        char[] charArray = str.toCharArray();
        for(Character c: charArray) {
        	int index = str.indexOf(c);
        	str = str.substring(index+1);
        	if(!test.contains(c.toString())) {
        	op=c.toString();
        	break;
        	}else {
        		str = str.replace(c.toString(), "");
        	}
        }
        return op;
    }
  
  public static void main(String[] args) {
	  Solution s = new Solution();
	  String firstNonRepeatingLetter = s.firstNonRepeatingLetter("vvishalthakur");
	  System.out.println("--"+firstNonRepeatingLetter);
	  
  }
}