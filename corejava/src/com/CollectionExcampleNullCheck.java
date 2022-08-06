package com;

import java.util.Hashtable;
import java.util.Map;

public class CollectionExcampleNullCheck {
	public static void main(String args[]){
		 
		  Map<Integer,String> hm=new Hashtable<>();

		  hm.put(108,"Amit");
		  hm.put(101,"Ravi");
		  hm.put(102,"Vijay");
		  hm.put(103,"Rahul");
		  hm.put(104,"Amit1");
		  hm.put(105,"Ravi1");
		  hm.put(106,"Vija1y");
		  hm.put(null,"Rahul1");

		  for(Map.Entry m:hm.entrySet()){
		   System.out.println(m.getKey()+" "+m.getValue());
		  }
		 }
}
