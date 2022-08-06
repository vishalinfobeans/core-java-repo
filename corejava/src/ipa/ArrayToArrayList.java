package ipa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {
	public static void main(String[] args) {

		  /* Array Declaration and initialization*/
		  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		  /*Array to ArrayList conversion*/
		//ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));
		ArrayList<String> citylist = new ArrayList<String>();
		boolean addAll = Collections.addAll(citylist, citynames); //extra way

		  /*Adding new elements to the converted List*/
		  citylist.add("New City2");
		  citylist.add("New City3");

		  /*Final ArrayList content display using for*/
		  for (String str: citylist)
		  {
			System.out.println(str);
	      }
		  ArrayList<String> citylist1 = new ArrayList<String>(citylist);
	 }
	
}
