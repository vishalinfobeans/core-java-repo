package ipa;

import java.util.Map;
import java.util.TreeMap;

public class TestOverloading1 {
	 public static void main(String args[]){  
		 Map<Integer,String> map=new TreeMap<Integer,String>();//Creating HashMap    
		   map.put(1,null);    
		   map.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		 }  
}
