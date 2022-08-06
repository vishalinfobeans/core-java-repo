package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
	public static void main(String[] args) {
		//null insertion is not possible in ConcurrentHashMap as key or value
		//In ConcurrentHashMap, the Object is divided into number of segments according to the concurrency level.
		//Default concurrency-level of ConcurrentHashMap is 16.
		Map<String, String> premiumPhone = new ConcurrentHashMap<String, String>();
		 CopyOnWriteArrayList cpn = new CopyOnWriteArrayList(new ArrayList()); //concurent package
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
		
		System.out.println(premiumPhone);

	}

}